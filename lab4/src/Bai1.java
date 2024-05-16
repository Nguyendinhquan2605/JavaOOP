import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        ArrayList<Integer> arraylistInteger = new ArrayList<>() ;
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt() ;

        for(int i = 0 ; i < n ; i++){
            System.out.print("Nhap phan thu thu " +(i+1)+ " :");
            int number = sc.nextInt();
            arraylistInteger.add(number) ;
        }
        System.out.println("Mang sau khi nhap la: ");
        for(int x : arraylistInteger){
            System.out.println(x +"\t");
        }
        int max = arraylistInteger.get(0) ;
        for(int i = 1 ; i < arraylistInteger.size() ; i++){
            if (max < arraylistInteger.get(i)) {
                max = arraylistInteger.get(i) ;
            }
        }
        System.out.println("Phan tu lon nhat cua ArrayList la: " +max);

        //Nhap vao mot phan tu va xoa khoi mang cac phan tu co gia tri bang gtri vua nhap
        System.out.print("Nhap gia tri can xoa: ");
        int m = sc.nextInt() ;
        if(arraylistInteger.contains(m)){
            for(int i = 0 ; i < arraylistInteger.size() ; i++){
                if (m == arraylistInteger.get(i)) {
                    arraylistInteger.remove(i) ;
                }
            }
            System.out.println("So phan tu con lai trong mang la: ");
            System.out.println(arraylistInteger);
        }
        else{
            System.out.println("Xoa khong thanh cong! ");
        }

        //Sap xep mang arraylist
        /*int temp ;
        for(int i = 0 ; i < arraylistInteger.size(); i++){
            for(int j = i+1 ; j < arraylistInteger.size(); j++){
                if (arraylistInteger.get(i) > arraylistInteger.get(j)) {
                    temp = arraylistInteger.get(i) ;
                    arraylistInteger.set(i, arraylistInteger.get(j)) ;
                    arraylistInteger.set(j,temp) ;
                }
            }
        }
        System.out.println("Mang sau khi duoc sap xep la: ");
        System.out.println(arraylistInteger);*/

        arraylistInteger.sort((o1,o2) -> o2-o1);
        System.out.println("mang sau khi dc sap xep la: ");
        System.out.println(arraylistInteger);
    }
    
}
