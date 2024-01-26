import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        String Ten ;
        int Tuoi ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhap ten: ");
        Ten = sc.nextLine() ;
        System.out.println("Nhap tuoi: ");
        Tuoi = sc.nextInt() ;

        if (Tuoi < 16) {
            System.out.println("Ban " +Ten+ " o do tuoi vi thanh nien");
        }
        else if (Tuoi >= 16 & Tuoi < 18) {
            System.out.println("Ban " +Ten+ " o do tuoi truong thanh");
        }
        else{
           if (Tuoi >= 18) {
            System.out.println("Ban " +Ten+ " da gia ");
           }
        }
    }
}
