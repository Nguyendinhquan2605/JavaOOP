import java.util.ArrayList;

public class Slide22chuong4 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>() ;

        colors.add("red") ;
        colors.add("Blue") ;
        colors.add("Green") ;
        colors.add("Yellow") ;
        colors.add("Pink") ;
        colors.add("Black") ;

        System.out.println(colors.get(1));
        System.out.println(colors.contains("Pink"));
        System.out.println(colors.size());
        System.out.println(colors);
    }
}
