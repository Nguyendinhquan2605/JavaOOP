import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int n , i= 1;
        long giaithua = 1 ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhap n : ");
        n = sc.nextInt() ;
        while (i <= n) {
            giaithua = giaithua * i ;
            i++ ;
        }
        System.out.println("n! = " +giaithua);
    }
}
