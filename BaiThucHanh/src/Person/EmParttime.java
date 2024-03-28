package Person;

import java.util.Scanner;

public class EmParttime extends Employer {
    //cac phuong thuc
    //public double LuongParttime ;
    public int Giolam ;
    public final int Cong = 150 ;

    //cac thuoc tinh
    public EmParttime()
    {
        //Ten = "Nhan vien Parttime" ;
    }

    public void NhapGiolam()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so gio lam trong 1 ngay: ");
        Giolam = sc.nextInt();
    }

    public void TinhluongPT()
    {
        Luong = Cong * Giolam ;
    }
}
