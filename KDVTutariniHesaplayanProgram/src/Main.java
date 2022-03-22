import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double tutar  , kdvOrani, kdvTutari, kdvliFiyat;

        Scanner input = new Scanner(System.in);

        System.out.print("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();

        kdvOrani = (tutar >= 1000) ? 0.08 : 0.18;

        kdvTutari = tutar * kdvOrani;
        kdvliFiyat = tutar + kdvTutari;

        System.out.println("KDV Tutarınız: "+kdvTutari);
        System.out.println("KDV'li Fiyatınız: "+kdvliFiyat);


    }
}
