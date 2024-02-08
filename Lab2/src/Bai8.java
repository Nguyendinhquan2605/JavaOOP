import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        int n , number , sum = 0 ;
        float Trungbinhcong ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhap vao so nguyen n co trong day: ");
        n = sc.nextInt() ;
        for(int i = 1; i <= n; i++) {
            System.out.println("Nhap  so thu " +i);
            number = sc.nextInt() ;
            sum  = sum + number ;
        }
        Trungbinhcong = (float) sum/n ;
        System.out.println("Trung binh cong = " +Trungbinhcong);
    }
}
