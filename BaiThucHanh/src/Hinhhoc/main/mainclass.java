package Hinhhoc.main;

import Hinhhoc.Hinhchunhat;
import Hinhhoc.Hinhtron;
import Hinhhoc.Hinhtru;
import Hinhhoc.Hinhvuong;

public class mainclass {
    public static void main(String[] args) {
        //Lop hinh tron
        Hinhtron ht = new Hinhtron() ;
        ht.Xuatten();
        ht.nhapBankinh();
        ht.tinhChuvi();
        ht.tinhDientich();
        ht.inChuvi();
        ht.inDientich();

        //Lop hinh chu nhat
        Hinhchunhat hcn = new Hinhchunhat();
        hcn.Xuatten();
        hcn.Nhapchieudai();
        hcn.Nhapchieurong();
        hcn.tinhChuvi();
        hcn.tinhDientich();
        hcn.inChuvi();
        hcn.inDientich();

        //lop hinh tru
        Hinhtru htru = new Hinhtru();
        htru.Xuatten();
        htru.Nhapchieucao();
        htru.tinhThetich();
        htru.inThetich();

        //lop hinh vuong
        Hinhvuong hv = new Hinhvuong();
        hv.Xuatten();
        hv.nhapCanh();
        hv.tinhChuvi();
        hv.tinhDientich();
        hv.inChuvi();
        hv.inDientich();
    }
}
