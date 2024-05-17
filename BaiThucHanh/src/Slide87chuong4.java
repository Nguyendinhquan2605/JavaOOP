import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide87chuong4 {
    public static void main(String[] args) {
       HashMap<String,String> hsmap = new HashMap<>() ;

       //them valude vao trong hashMap voi key tuong ung
       hsmap.put("CSLT","Co so lap trinh");
       hsmap.put("C++", "C++");
       hsmap.put("C#", "C Sharp");
       hsmap.put("PHP", "PHP");
       hsmap.put("Java", "Java");

       //tao 1 set co ten la setHashMap
       //chua toan bo cac entry(vua key vua value) cua hashmap
       Set<Map.Entry<String,String>> setHashMap = hsmap.entrySet();

       System.out.println("Cac entry co trong setHashMap: ");
       System.out.println(setHashMap);
    }
}
