import java.util.Scanner;

public class Slide35chuong2 {
    public static void main(String[] args) {
        int a , b ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhap so a: ");
        a = sc.nextInt() ;

        System.out.println("Nhap so b: ");
        b = sc.nextInt() ;
        int min = a ;
        
        if (a > b) {
           min = b;
             System.out.println("So nho nhat trong hai so la: " +min);
        }else if(a < b) { 
            System.out.println("So nho nhat trong hai so la: " +min);
        }
    }
}
