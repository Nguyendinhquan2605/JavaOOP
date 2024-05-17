import java.util.LinkedHashMap;
import java.util.Set;

public class Slide96chuong4 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedhsmap = new LinkedHashMap<Integer,String>();

        //add element to linkedhashmap
        linkedhsmap.put(1, "Java");
        linkedhsmap.put(3, "C++");
        linkedhsmap.put(2, "PHP");
        linkedhsmap.put(4, "Python");
        //show linkedhsmap before remove
        System.out.println("Before remove: ");
        System.out.println(linkedhsmap);

        //remove element
        linkedhsmap.remove(2);
        //show linkedhsmap after remove
        System.out.println("After remove");
        System.out.println(linkedhsmap);
    }

    //show hashmap
    public static void show(LinkedHashMap<Integer,String> Lkhsmap){
        Set<Integer> keySet = Lkhsmap.keySet();
        for(Integer Key : keySet){
            System.out.println(Key + " " + Lkhsmap.get(Key));
        }
    }
}