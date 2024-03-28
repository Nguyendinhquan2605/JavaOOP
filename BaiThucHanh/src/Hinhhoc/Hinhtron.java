package Hinhhoc;

import java.util.Scanner;

public class Hinhtron extends Hinhhoc {
    public float Bankinh ;

    //cac phuong thuc
    public Hinhtron()
    {
        ten = "Hinh Tron" ;
    }
    public void nhapBankinh()
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Nhap ban kinh: ");
        Bankinh = sc.nextFloat();
    }
    public void tinhChuvi()
    {
        Chuvi = 2* PI * Bankinh ;
    }
    public void tinhDientich()
    {
        Dientich = PI * Bankinh * Bankinh ;
    }
}
