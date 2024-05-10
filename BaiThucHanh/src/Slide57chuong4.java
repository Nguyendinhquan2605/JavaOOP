import java.util.HashSet;
import java.util.Scanner;

public class Slide57chuong4 {
    public static void main(String[] args) {
        String name ;
        HashSet<String> hsetString  = new HashSet<>() ;
        Scanner sc = new Scanner(System.in);

        //Them cac phan tu vao hashSetString
        hsetString.add("Ronaldo") ;
        hsetString.add("Messi") ;
        hsetString.add("Valveder") ;
        hsetString.add("Toni Kross") ;
        hsetString.add("Kyle Walker") ;
        hsetString.add("Luka Modric") ;

        //Hien thi cac phan tu trong Hset
        System.out.println("cac phan tu trong hashSetString: ");
        System.out.println(hsetString);
        System.out.println("Nhap phan tu can xoa: ");
        name = sc.nextLine() ;

        if(hsetString.contains(name)){
            hsetString.remove(name) ;
            System.out.println("Xoa thanh cong! ");
            System.out.println("Cac phan tu con lai trong hsetString: ");
            System.out.println(hsetString);
        }
        else{
            System.out.println("Xoa khong thanh cong! ");
        }
    }
}
