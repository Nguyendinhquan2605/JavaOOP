import java.util.ArrayList;
import java.util.ListIterator;

public class Slide20chuong4 {
    public static void main(String[] args) {
        //Khai bao 1 ArrayList co ten la arrListChar
        ArrayList<Character> arrayListChar = new ArrayList<>() ;

        arrayListChar.add('a');
        arrayListChar.add('b') ;
        arrayListChar.add('c') ;
        arrayListChar.add('d') ;

        //Khai bao 1 ListIterator co kieu la Character
        ListIterator<Character> listIterator = arrayListChar.listIterator() ;

        //Hien thi cac phan tu co trong arrListchar bang cach sd ListIterator
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next() + "\t");
        }
    }
}
