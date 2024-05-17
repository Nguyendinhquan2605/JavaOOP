import java.util.Set;
import java.util.TreeMap;

import javax.swing.RowFilter.Entry;

public class Slide107chuong4 {
    public static void main(String[] args) {
        TreeMap<Integer,Character> treemap = new TreeMap<>();

        //Them value vao trong treemap voi key tuong ung
        treemap.put(6, 'A');
        treemap.put(5, 'B');
        treemap.put(1, 'C');
        treemap.put(2, 'D');
        treemap.put(8, 'E');

        //tao 1 set co ten la setTreeMap chua toan bo cac entry  cua treemap
        Set<java.util.Map.Entry<Integer,Character>> setTreeMap = treemap.entrySet();

        System.out.println("cac entry co trong setTreemap: ");
        System.out.println(setTreeMap);
    }
}
