package Hinhhoc;

import java.util.Scanner;

public class Hinhtru extends Hinhtron {
    public float chieucao ;

    //cac phuong thuc
    public Hinhtru()
    {
        ten = "Hinh tru " ;
    }
    public void Nhapchieucao()
    {
        nhapBankinh();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu cao: ");
        chieucao = sc.nextFloat();
    }
    public void tinhThetich()
    {
        Thetich = (PI *Bankinh *Bankinh) *chieucao ;
    }
}
