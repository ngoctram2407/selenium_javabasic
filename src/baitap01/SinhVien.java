package baitap01;

public class SinhVien {

    public static String company ="KMS Technology";
    public static String address ="Quảng Nam";
    public static String phone ="0395119145";

    String firstName = "Tram";
    String lastName =" Nguyen";

    public void sayHello(){
        int number = 10;
        System.out.println("Giá trị của n là: " + number);

    }


    public static void main(String[] args){

        SinhVien bienLocal = new SinhVien();
        bienLocal.sayHello();

        System.out.println("Giá trị của firstName là: " + bienLocal.firstName);
        System.out.println("Giá trị của lastName là: " + bienLocal.lastName);

        System.out.println("Giá trị của company là: " +company);
        System.out.println("Giá trị của address là: " + address);
        System.out.println("Giá trị của phone là: " +phone);
        System.out.println("Giá trị của lop là: " + ThongTin.lop);
        System.out.println("Giá trị của school là: " +ThongTin.school);

    }
}
