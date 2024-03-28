package Person.Main;

import Person.EmFulltime;
import Person.EmParttime;
import Person.Employer;

public class mainclass {
    public static void main(String[] args) {
    //class Employer
    Employer e1 = new Employer();
    e1.Xuatten("Employer");
    e1.NhapthongtinNV();
    e1.InDiachi();
    

    //class Emparttime
    EmParttime e2 = new EmParttime() ;
    e2.Xuatten("NhanvienParttime");
    e2.NhapthongtinNV();
    e2.InDiachi();
    e2.NhapGiolam();
    e2.TinhluongPT();
    e2.TongLuong();

    //class EmFulltime
    EmFulltime e3 = new EmFulltime() ;
    e3.Xuatten("NhanvienFulltime") ;
    e3.NhapthongtinNV();
    e3.InDiachi();
    e3.Nhapsongaylam();
    e3.TinhLuongFT();
    e3.TongLuong();
    }
}
