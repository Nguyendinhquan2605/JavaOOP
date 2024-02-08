import java.util.Scanner;

public class Slide90chuong2 {
    public static void main(String[] args) {
        String chuoi ;
        char kytu ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhap vao chuoi bat ky:");
        chuoi = sc.nextLine() ;
           System.out.println("Cac ky tu co chuoi trong mang la: ");
           for(int i = 0 ; i < chuoi.length(); i++){
              //tra ve ky tu tai vi tri thu i trong chuoi
              //gan gia tri cho bien ky tu
              // i chay tu 0 den vi tri co do dai cua chuoi
              kytu = chuoi.charAt(i) ;
              System.out.println(kytu);
           }
    }
}
