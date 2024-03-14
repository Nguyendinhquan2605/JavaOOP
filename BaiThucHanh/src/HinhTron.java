import java.security.PublicKey;
import java.util.Scanner;

public class HinhTron {
    public static void main(String[] args) {
        InnerHinhTron ht = new HinhTron(). new InnerHinhTron() ;
        //ht.NhapBanKinh();
        ht.NhapBanKinh();
        ht.TinhChuVi();
        ht.TinhDienTich();
        ht.Inchuvi();
        ht.Indientich();
    }
    /**
     * InnerHinhTron
     */
    public class InnerHinhTron {
    
    final float PI = 3.14f ;
    
    float r ;
    float dt ;
    float cv ;

    void NhapBanKinh()
    {
        System.out.print("Nhap ban kinh hinh tron: ");
        Scanner sc = new Scanner(System.in) ;
        r = sc.nextFloat() ;
    }
    void TinhChuVi()
    {
        cv = 2 * PI * r ;
    }
    void TinhDienTich()
    {
        dt = PI * r*r ;
    }
    void Inchuvi()
    {
        System.out.println("Chu vi hinh tron la: " +cv);
    }
    void Indientich()
    {
        System.out.println("Dien tich hinh tron la: " +dt);
    }
    }

}
