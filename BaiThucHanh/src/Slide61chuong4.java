import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Slide61chuong4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>() ;
        linkedHashSet.add("Java"); 
        linkedHashSet.add("PHP") ;
        linkedHashSet.add("C++") ;
        linkedHashSet.add("Python");
        linkedHashSet.add("C") ;

        for(String str : linkedHashSet){
            System.out.println(str);
        }
        System.out.println(linkedHashSet);

        System.out.println("Nhap phan tu can xoa: ");
        String name = sc.nextLine();
        if (linkedHashSet.contains(name)) {
            linkedHashSet.remove(name);
            System.out.println("Xoa thanh cong! ");
            System.out.println("cac phan tu con lai trong linkedHashSet ");
            System.out.println(linkedHashSet);
        }
        else{
            System.out.println("Xoa khong thanh cong! ");
        }

    }
}
