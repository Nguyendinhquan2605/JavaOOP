import java.util.ArrayList;

public class Teenclass {
    public static void main(String[] args) {
        ArrayList<String> arrayListString = new ArrayList<>() ;

        //Them cac phan tu vao arraylist sd phuong thuc add()
        arrayListString.add("Son");
        arrayListString.add("Thinh") ;
        arrayListString.add("Quan");
        arrayListString.add("Sinh") ;

        System.out.println("Cac phan tu co trong arrListString la: ");
        for(int i = 0 ; i < arrayListString.size() ; i++){
            System.out.println(arrayListString.get(i) + "\t");
        }

        ArrayList<Integer> arrayListInteger = new ArrayList<>();
        arrayListInteger.add(1) ;
        arrayListInteger.add(2) ;
        arrayListInteger.add(3) ;
        arrayListInteger.add(4) ;

        System.out.println("\nCac phan tu co trong arrListInteger la: ");
        for(int number : arrayListInteger){
            System.out.println(number + "\t");
        }
    }
}
