package Hinhhoc;

import java.util.Scanner;

public class Hinhvuong extends Hinhchunhat {
    //cac phuong thuc
    public Hinhvuong()
    {
        ten = "Hinh Vuong" ;
    }
    public void nhapCanh()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh: ");
        dai = rong = sc.nextFloat() ;
    }
}
