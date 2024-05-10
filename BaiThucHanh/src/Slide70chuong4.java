import java.util.Scanner;
import java.util.TreeSet;

public class Slide70chuong4 {
    public static void main(String[] args) {
        int number ;
        TreeSet<Integer> treeInteger = new TreeSet<>() ;
        Scanner sc = new Scanner(System.in) ;

        //Them cac phan tu vao treeset
        treeInteger.add(1) ;
        treeInteger.add(5) ;
        treeInteger.add(7) ;
        treeInteger.add(2) ;
        treeInteger.add(8) ;
        treeInteger.add(4) ;
        //hien thi cac phan tu trong treeset
        System.out.println("Cac phan tu co trong TreeSet: ");
        System.out.println(treeInteger);
        System.out.println("Nhap phan tu can them: ");
        number = sc.nextInt() ;

        if (!treeInteger.contains(number)) {
            treeInteger.add(number) ;
            System.out.println("Them thanh cong! ");
            System.out.println("Cac phan tu trong treeSet sau khi them: ");
            System.out.println(treeInteger);
        }
        else{
            System.out.println("Phan tu " +number+ " da ton tai! ");
        }
    }
}
