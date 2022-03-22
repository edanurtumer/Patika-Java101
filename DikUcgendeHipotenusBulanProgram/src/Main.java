import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/* Hipotenüs Bulma
        //Değişkenleri oluşturalım.
        int a, b;
        double c;

        //Kullanıcıdan verilerimizi alalım.
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a = girdi.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : " + c);


 */

        //Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

        int a, b, c;
        double UAlani, u;

        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a = input.nextInt();

        System.out.print("2. Kenarı Giriniz : ");
        b = input.nextInt();

        System.out.print("3. Kenarı Giriniz : ");
        c = input.nextInt();

        u = (a + b + c) / 2;
        UAlani = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Alanı : " + UAlani);

    }
}
