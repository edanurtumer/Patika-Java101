import java.util.Scanner;

public class Main {

    public static int usHesabi(int taban, int us){
        return (int) Math.pow(taban, us);
    }

    public static void main(String[] args) {
        int us;
        int taban;

        Scanner input = new Scanner(System.in);

        System.out.print("Taban değerini giriniz : ");
        taban = input.nextInt();

        System.out.print("Üs değerini giriniz : " );
        us = input.nextInt();

        int result = usHesabi(taban, us);
        System.out.println("Sonuç : " + result);

    }
}
