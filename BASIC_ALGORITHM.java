import java.util.Scanner;
public class BASIC_ALGORITHM {
     //So nguyen to 
    public static boolean prime(int n){
        if(n<2) return false;
        for(int i=2;i<=n/2;i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
    //So hoan hao
    public static boolean perfectnum(int n){
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i == 0){
                sum+=i;
            }
        }
        if(sum == n) 
            return true;
        else
            return false;
    }
    //Uoc chung lon nhat
    public static int UCLN(int a,int b){
        while(a!=b){
            if(a>b)
                a-=b;
            else
                b-=a;
        }
        return a;
    }
    //Boi chung nho nhat
    public static int BCNN(int a,int b){
        return (a*b)/UCLN(a,b);
    }  
    public static void main(String[] args) {
        int t1=0,t2=0;
        Scanner sc = new Scanner(System.in);
        int a[];
        System.out.print("Nhap so phan tu cua mang: ");
        int n;
        n = sc.nextInt();
        a = new int [n];
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"] = ");
            a[i] = sc.nextInt();
        }
        System.out.print("Mang da nhap la: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        System.out.print("So nguyen to trong mang: ");
        for(int i=0;i<n;i++){
            if(prime(a[i])){
                System.out.print(a[i]);
                t1 = 1;
            }
        }
        if(t1 == 0) System.out.println("Khong co so nguyen to trong mang !");
        System.out.println("So hoan hao trong mang: ");
        for(int i=0;i<n;i++){
            if (perfectnum(a[i])){
                System.out.println(a[i]);
                t2 = 1;
            }
        }
        if (t2 == 0) System.out.println("Khong co so hoan hao trong mang !");
        System.out.print("Nhap x,y(UCLN,BCNN):");
        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("UCLN cua "+x+","+y+" la: "+UCLN(x,y));
        System.out.println("BCNN cua "+x+","+y+" la: "+BCNN(x,y));
    }
}
