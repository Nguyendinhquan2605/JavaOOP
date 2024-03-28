package Person;

import java.util.Scanner;

public class EmFulltime extends Employer {
    //cac thuoc tinh
    public int LuongTB = 250 ;
    public int Ngaylam ;

    //cac phuong thuc
    public EmFulltime()
    {
        //Ten = "Nhan vien Fulltime " ;
    }
    public void Nhapsongaylam()
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Nhap so ngay lam trong 1 thang: ");
        Ngaylam = sc.nextInt();
    }
    public void TinhLuongFT()
    {
        Luong = LuongTB * Ngaylam ;
    }
}
