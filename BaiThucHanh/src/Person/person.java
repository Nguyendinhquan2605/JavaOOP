package Person;

import java.util.Scanner;

public class person {
    //cac thuoc tinh
    public String Fullname,MaNV,Ten;
    public int Age ;

    //cac phuong thuc
    public void Xuatten(String n )
    {
        //System.out.println("\n\n====" +Ten+"====");
        Ten = n ;
        System.out.println("\n\n===="+Ten+"====");
    }
    public void Nhapthongtin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fullname: ");
        Fullname = sc.nextLine();

        System.out.print("MaNV: ");
        MaNV = sc.nextLine();

        System.out.print("Age: ");
        Age = sc.nextInt();
    }

    public void Xuatthongtin()
    {
        System.out.println(Fullname+"-"+Age+"-"+MaNV);
    }
}
