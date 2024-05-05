import java.util.LinkedList;
import java.util.List;

public class Slide27chuong4 {
    public static void main(String[] args) {
        //Khai bao danh sach lien ket co ten la linkedlist
        //Integer
        LinkedList<String> linkedlist = new LinkedList<>() ;
        linkedlist.add("java") ;
        linkedlist.add("C++") ;
        linkedlist.add("PHP") ;
        linkedlist.add("Java") ;

        System.out.println("Vd su sung phuong thuc addAll()");

        //them cac phan tu cua list vao listA
        LinkedList<String> listA = new LinkedList<>() ;
        listA.addAll(linkedlist) ;
        System.out.println("ListA: ");
        //showList(listA)
        System.out.println("\nVi du su dung phuong thuc retainAll()");
        
        //Khoi tao listB
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("java") ;
        //Xoa nhung phan tu khong thuoc listB khoi listA
        listA.retainAll(listB);
        System.out.println("listA: ");
        //showList(listA) ;

        System.out.println("\nSu sung phuong thuc removeAll()");
        //xoa nhung phan tu thuoc listB khoi list
        linkedlist.removeAll(listB);
        System.out.println("lnkedlist: ");
        //showList(linkedlist) ;

    }
}
