/*
Xây dựng lớp Account quản lý thông tin khách hàng.
Các thuộc tính:
	- Mã số tài khoản
	- Tên tài khoản
	- Số dư tài khoản
Các phương thức:
	- khởi tạo, get, set
	- Phương thức nạp tiền: số dư = số dư + tiền nạp
	- Phương thức rút tiền: số dư = số dư - tiền rút
	- Phương thức nhập thông tin
	- Phương thức xuất thông tin
Xây dựng lớp thực hiện các yêu cầu trên, với tiền nạp, tiền rút nhập vào từ bàn phím
 */
package javaapplication9;

import java.awt.List;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

public class JavaApplication9 {
//    C = 2*R*Pi
//    S = R*R*3.14
    public static Scanner imp = new Scanner(System.in);
    public static class ThonTinKhachHang{
        public ThonTinKhachHang(){}
        private static String MaKH;

        public static String getMaKH() {
            return MaKH;
        }

        public static void setMaKH(String MaKH) {
            ThonTinKhachHang.MaKH = MaKH;
        }

        public static String getTenTK() {
            return TenTK;
        }

        public static void setTenTK(String TenTK) {
            ThonTinKhachHang.TenTK = TenTK;
        }

        public static float getSoDu() {
            return SoDu;
        }

        public static void setSoDu(float SoDu) {
            ThonTinKhachHang.SoDu = SoDu;
        }
        private static String TenTK;
        private static float SoDu;
        
        public String NapTien(float TienNap)
        {
            setSoDu(getSoDu()+TienNap);
            return "\nSo Du :"+getSoDu() +" "+" So Tien Da Nap:" +TienNap;
        }
        public String RutTien(float TienRut)
        {
            setSoDu(getSoDu()-TienRut);
            return "\nSo Du :"+getSoDu() +" "+" So Tien Da Rut:" +TienRut;
        }
        public void Nhap()
        {
            System.out.println("\nNhap ma tai khoan : ");
            setMaKH(imp.nextLine());
            System.out.println("\nNhap ten tai khoan : ");
            setTenTK(imp.nextLine());  
            System.out.println("\nNhap so du : ");
            setSoDu(imp.nextFloat()); 
        }
        public void Xuat(){
            System.out.println("\nMa tai khoan : "+getMaKH());
            System.out.println("\nNhap ten tai khoan : "+getTenTK());  
            System.out.println("\nNhap so du : "+getSoDu());
        }

    }
    public static void main(String[] args) {
        ThonTinKhachHang kh = new ThonTinKhachHang();
        int luachon =0;
        System.out.println("\n 1. Nhap Thong tin khach Hang moi");
        System.out.println("\n 2. Xuat Thong tin khach Hang moi");
        System.out.println("\n 3. Nap tien");
        System.out.println("\n 4. Rut tien");
        System.out.println("\n 0. Thoat");
        
        while(true)
        {
            System.out.println("Nhap lua chon");
            luachon= imp.nextInt();
            switch (luachon)
            {
                case 1: 
                    kh.Nhap();
                    break;
               case 2:
                    kh.Xuat();
                    break;
               case 3: 
                    System.out.println("\nNhap Tien Nap :");
                    System.out.println(kh.NapTien(imp.nextFloat()));
                    break;
                case 4:
                    System.out.println("\nNhap Tien Rut :");
                    System.out.println(kh.RutTien(imp.nextFloat()));
                    break;
            }
            if(luachon==0)
            {
                break;
            }
        }
        

    }
}
