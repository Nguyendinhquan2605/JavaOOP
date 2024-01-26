import java.util.Scanner;

public class Slide30chuong2 {
    public static void main(String[] args) {
        int n , sodu ,tong =0 ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhap vao so n: ");
        n = sc.nextInt() ;

        while (n > 0) {
            sodu = n %10 ;
            n = n/10 ;
            tong = tong + sodu ;
        }
        System.out.println("Tong cac chu so la= " +tong);
    }
}
