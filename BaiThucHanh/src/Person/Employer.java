package Person;

import java.util.Scanner;

public class Employer extends person {
    //cac thuoc tinh
    public String QueQuan ;
    public String CCCD ;
    public int Luong ;

    //cac phuong thuc
    public Employer()
    {
        //Ten = "Employer" ;
    }
    public void NhapthongtinNV()
    {
        Nhapthongtin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Que Quan : ");
        QueQuan = sc.nextLine();
        System.out.print("CCCD: ");
        CCCD = sc.nextLine() ;
    }
    public void InDiachi()
    {
        Xuatthongtin();
        System.out.println("Can Cuoc Cong Dan: " +CCCD);
        System.out.println("Que Quan: " +QueQuan);
    }
    public void TongLuong()
    {
        System.out.println("Tong Luong = " +Luong);
    }
}
