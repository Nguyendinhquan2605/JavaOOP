package Hinhhoc;

import java.util.Scanner;

public class Hinhchunhat extends Hinhhoc {
    public float dai, rong ;

    //cac phuong thuc
    public Hinhchunhat()
    {
        ten = "HInh chu nhat " ;
    }
    public void Nhapchieudai()
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Nhap chieu dai: ");
        dai = sc.nextFloat();
    }
    public void Nhapchieurong()
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Nhap chieu rong: ");
        rong = sc.nextFloat();
    }
    public void tinhChuvi()
    {
        Chuvi = (dai + rong) * 2 ;
    }
    public void tinhDientich()
    {
        Dientich = dai * rong ;
    }
}
