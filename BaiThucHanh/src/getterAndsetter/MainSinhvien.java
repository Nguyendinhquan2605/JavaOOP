package getterAndsetter;

public class MainSinhvien {
    public static void main(String[] args) {
        //Khoi tao cac doi tuong sinh vien
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();

        //set thong tin vao cho cac sinh vien
        sv1.setTen("");  //ten khong co
        sv1.setTuoi(23);

        sv2.setTen("Peter");
        sv2.setTuoi(17);

        //in cac thong tin sinh vien
        System.out.println("Sinh vien 1 co ten: " +sv1.getTen()+ ", tuoi: " +sv1.getTuoi());
        System.out.println("Sinh vien 2 co ten: " +sv2.getTen()+ ", tuoi: " +sv2.getTuoi());
    }
}
