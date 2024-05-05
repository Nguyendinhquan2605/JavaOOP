import java.util.ArrayList;
import java.util.Iterator;

public class Slide19chuong4 {
    public static void main(String[] args) {
        ArrayList<Float> arrayListFloat = new ArrayList<>();

        //them cac phan tu su dung phuong thuc add
        arrayListFloat.add(0.5f) ;
        arrayListFloat.add(0.6f) ;
        arrayListFloat.add(0.7f) ;
        arrayListFloat.add(0.8f) ;

        //khai bao mot Iterator co kieu ka float
        Iterator<Float> iterator = arrayListFloat.iterator();

        System.out.println("Cac phan tu co trong arrListFloat la: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "\t");
        }
    }
}
