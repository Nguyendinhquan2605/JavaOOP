import java.util.Scanner;

public class Employee {
    public int Manv ;
    public String name ;
    public float Luong=7000,Phucap=1000 ;

    //cac phuong thuc
    void Nhapthongtin()
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Fullname: ");
        name = sc.nextLine();

        System.out.println("Nhap ma nhan vien: ");
        Manv = sc.nextInt() ;

    }
    public float Tinhluongphucap()
    {
        Phucap = 1000f *0.8f  ;
        return Phucap ;
    }

    public float TinhLuongTB()
    {
        Luong = Luong +Phucap  ;
        return Luong ;
    }

    void Xuatthongtin()
    {
        System.out.println(name+"-"+Manv);
        System.out.println("Luong phu cap: "+Tinhluongphucap());
        System.out.println("Luong trung binh :" +TinhLuongTB());
    }
}
