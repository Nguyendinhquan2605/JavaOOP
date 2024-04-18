package Model;

import Model.util.Configs;

public class NhanvienFulltime extends Nhanvien {
    private int ngayLamThem ;
    private int loaiChucvu ;

    public NhanvienFulltime(String ten)
    {
        this.ten = ten ;
    }

    public NhanvienFulltime(String ten , int ngayLamThem)
    {
        this.ten = ten ;
        this.ngayLamThem = ngayLamThem ;
    }

    public int getLoaichucvu()
    {
        return loaiChucvu ;
    }
    public void setLoaichucvu(int loaiChucvu)
    {
        this.loaiChucvu = loaiChucvu ;
    }

    @Override
    public  String loaiNhanVien()
    {
        return "Nhan vien FullTime" ;
    }
    public void tinhLuong()
    {
        if(loaiChucvu == 1){
            luong = Configs.Luong_Nhan_Vien_Fulltime_Sep + Configs.Luong_Lamthemmoingay * ngayLamThem ;
        }
        else if (loaiChucvu == 2) {
            luong = Configs.Luong_Nhan_Vien_Fulltime_Linh + Configs.Luong_Lamthemmoingay * ngayLamThem ;
        }
    }
}
