    package Model.Main;

import Model.NhanVienPartTime;
import Model.Nhanvien;
import Model.NhanvienFulltime;

/**
     * Main
     */
    public class Main {
        public static void main(String[] args) {
            //cong ty co 3 nhan vien toan thoi gian , trong do co 1 sep ,trong do sep khong lam them ngay nao
            NhanvienFulltime sep = new NhanvienFulltime("Nguyen Hoang Son") ;
            sep.setLoaichucvu(1);
            NhanvienFulltime linh1 = new NhanvienFulltime("Nguyen Tien Thinh");
            linh1.setLoaichucvu(2);
            NhanvienFulltime linh2 = new NhanvienFulltime("Nguyen Dinh Quan" , 3) ;
            linh2.setLoaichucvu(2);

            //Cong ty dang thue 1 nhan vien thoi vu
            NhanVienPartTime thoivu = new NhanVienPartTime("Nguyen Van A",100) ;
            //Tinh luong
            sep.tinhLuong();
            linh1.tinhLuong();
            linh2.tinhLuong();
            thoivu.tinhLuong();
            //in thong tin nhan vien
            sep.XuatThongTin();
            linh1.XuatThongTin();
            linh2.XuatThongTin();
            thoivu.XuatThongTin();
        }
    }