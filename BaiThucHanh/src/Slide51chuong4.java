import java.util.HashSet;
import java.util.Scanner;

public class Slide51chuong4 {
    public static void main(String[] args) {
        //khai bao 1 HashSet co ten la hashSetint
        int number ;
        HashSet<Integer> hSetIntegers = new HashSet<>() ;
        Scanner sc = new Scanner(System.in) ;

        //them cac phan tu vao hashsetInteger
        hSetIntegers.add(0) ;
        hSetIntegers.add(1) ;
        hSetIntegers.add(4) ;
        hSetIntegers.add(2) ;
        hSetIntegers.add(8) ;
        hSetIntegers.add(3) ;
        //Hien thi cac phan tu trong hashSetInteger
        System.out.println("cac phan tu trong hashSetInteger: ");
        System.out.println(hSetIntegers);
        System.out.println("Nhap phan tu can them: ");
        number = sc.nextInt() ;
        //Them mot phan tu tu hashSet tu ban phim
        if(!hSetIntegers.contains(number)){
            hSetIntegers.add(number) ;
            System.out.println("Them thanh cong ");
            System.out.println("Cac phan tu sau khi them: ");
            System.out.println(hSetIntegers);
        }
        else{
            System.out.println("Phan tu " +number+ " da ton tai");
        }
    }
}
