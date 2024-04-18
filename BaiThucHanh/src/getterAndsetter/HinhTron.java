package getterAndsetter;

public class HinhTron {
    private final float PI = 3.14f ;
    private float BanKinh ;

    public float getBanKinh()
    {
        return BanKinh ;
    }

    public void setBanKinh(float BanKinh)
    {
        this.BanKinh = BanKinh ;
    }

    public float Tinhchuvi()
    {
        return 2 * BanKinh * PI ;
    }

    public float Tinhdientich()
    {
        return PI * BanKinh * BanKinh ;
    }
}
