package Model;

import java.io.ObjectInputFilter.Config;

import Model.util.Configs;

public class NhanVienPartTime extends Nhanvien {
    private int gioLamviec ; 

    public NhanVienPartTime(String ten , int gioLamviec)
    {
        this.ten = ten ;
        this.gioLamviec = gioLamviec ;
    }

    @Override
    public String loaiNhanVien()
    {
        return "Nhan vien thoi vu" ;
    }

    public void tinhLuong()
    {
        luong = Configs.Luong_Nhan_Vien_PartTime_MoiGio *gioLamviec ;
    }
}
