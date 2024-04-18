package getterAndsetter;

public class Mainclass {
    public static void main(String[] args) {
        //Khoi tao doi tuong tu lop hinh tron
        HinhTron hinhTron = new HinhTron() ;

        //set ban kinh cho hinh tron thong qua phuong thuc setter
        hinhTron.setBanKinh(20);

        //cac tinh toan khac
        float chuvi = hinhTron.Tinhchuvi();
        float dientich = hinhTron.Tinhdientich();
        System.out.println("Chu vi hinh tron: " +chuvi + " - Dien tich Hinh tron: " +dientich);
    }
}
