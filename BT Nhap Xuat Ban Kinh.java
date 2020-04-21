/*
Xây dựng lớp HinhTron bao gồm các thuộc tính, phương thức sau:
Các thuộc tính:
	- bán kính, pi
Các phương thức:
	- Phương thức set, get, khởi tạo
	- Phương thức tính diện tích, chu vi
	- Phương thức nhập thông tin hình tròn
	- Phương thức xuất thông tin: bán kính, chu vi, diện tích.
Xây dựng lớp thực hiện các yêu cầu trên, với bán kính nhập vào từ bán phím
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    public static class HinhTron{
        public static float BanKinh;

        public float getBanKinh() {
            return BanKinh;
        }
        public void setBanKinh(float BanKinh) {
            this.BanKinh = BanKinh;
        }

        public float getPi() {
            return pi;
        }

        public void setPi(float pi) {
            this.pi = pi;
        }
        private static float pi;
        public HinhTron(){}

        public float ChuVi(){
            return (float)(2*getBanKinh()*3.14);
        }
        public float DienTich(){
            return (float)(getBanKinh()*getBanKinh()*3.14);
        }
        public void Nhap(){
            System.out.println("\nNhap Ban kinh"); 
            float bk = imp.nextFloat();
            setBanKinh(bk);
        }
        public void Xuat(){
            System.out.println("\nChu vi :"+ChuVi());
            System.out.println("\nDien tich :"+DienTich());
        }
    }
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.Nhap();
        ht.Xuat();
    }
}
