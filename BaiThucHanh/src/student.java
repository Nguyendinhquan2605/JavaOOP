import java.util.Scanner;

public class student {
    public String name ;
    public int age ;
    public String ID ;
    public float A,B,C,Trungbinh ;

    //cac phuong thuc
    void Nhapthongtin()
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Fullname: ");
        name = sc.nextLine() ;

        System.out.println("ID: ");
        ID = sc.nextLine() ;

        System.out.println("Nhap diem A: ");
        A = sc.nextFloat();

        System.out.println("Nhap diem B: ");
        B = sc.nextFloat() ;

        System.out.println("Nhap diem C: ");
        C = sc.nextFloat() ;

        System.out.println("Nhap age:");
        age = sc.nextInt() ;

    }

    public float TinhdiemTB()
    {
        Trungbinh = A * 0.6f + B * 0.3f + C * 0.1f ;  ;
        return Trungbinh ;
    }

    void Xuatthongtin()
    {
        System.out.println(name+"-"+age+"-"+ID);
        System.out.println("Diem cac mon:" +A+"-"+B+"-"+C);
        System.out.println("Diem TB cac mon la :" +TinhdiemTB());
    }

}
