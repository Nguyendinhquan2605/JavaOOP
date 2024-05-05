import java.util.ArrayList;
import java.util.Scanner;

public class Slide25chuong4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrInteger = new ArrayList<>() ;
        Scanner sc = new Scanner(System.in) ;
        int number ;

        System.out.println("Nhap sp phan tu cua  ArrayList: ");
        int n = sc.nextInt() ;

        //Nhap va them phan tu cho ArrayList
        for(int i = 0 ; i < n ; i++){
            System.out.println("Nhap phan thu " +i+ ": ");
            number = sc.nextInt() ;
            arrInteger.add(number) ;
        }

        int max = arrInteger.get(0) ;

        for(int i = 1 ; i < arrInteger.size() ; i++){
            if (arrInteger.get(i).compareTo(max) > 0) {
                max = arrInteger.get(i) ;
            }
        }
        System.out.println("Phan tu lon nhat trong arrInteger = " +max);
    }
}
