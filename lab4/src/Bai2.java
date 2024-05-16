import java.util.LinkedList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        LinkedList<Integer> linkedlist = new LinkedList<>() ;

        System.out.println("Nhap vao so phan tu cua mang: ");
        int n = sc.nextInt() ;
        for(int i = 0 ; i < n ; i++){
            System.out.println("Nhap phan tu thu " +(i+1)+ " :");
            int number = sc.nextInt() ;

            linkedlist.add(number) ;
        }
        System.out.println(linkedlist);
        int sum = 0 ;
        int count = 0 ;
        for(int i : linkedlist){
            if (i % 2 == 0) {
                sum = sum + i ;
                count++ ;
            }
        }
        
        System.out.println("Trung binh cong cua cac so chan trong mang la: " +sum/count);
    }
}
