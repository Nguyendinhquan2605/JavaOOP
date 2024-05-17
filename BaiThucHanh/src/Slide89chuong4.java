import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide89chuong4 {
    public static void main(String[] args) {
        HashMap<String,String> hsmapCity = new HashMap<>();
        hsmapCity.put("QNg", "Quang Ngai");
        hsmapCity.put("QN", "Quang Nam");
        hsmapCity.put("QN", "Quang Ninh");
        hsmapCity.put("HCM", "Thanh pho Ho Chi Minh");

        System.out.println("Ds cac thanh pho trong hsmapCity: ");
        Set<Map.Entry<String,String>> setCity = hsmapCity.entrySet() ;
        System.out.println(setCity);

        //lay thanh pho co ma la Qng va hien thi ten thanh pho
        System.out.println("QNg: " +hsmapCity.get("QNg"));

        //lay tp co ma la NT 
        System.out.println("NT: " +hsmapCity.get("NT"));

        //de kiem tra 1 value co trong HashMap hay khong
        //chung ta se dung phuong thuc containsValue()

        if (hsmapCity.containsValue("Quang Ninh")) {
            System.out.println("Co Quang Ninh trong hsmapCity");
        }
        else{
            System.out.println("Key khong ton tai");
        }
    }
}
