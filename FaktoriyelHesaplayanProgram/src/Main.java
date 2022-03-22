import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
	    //Faktöriyel Hesaplayan Program
        Scanner input = new Scanner(System.in);

        System.out.print("Faktöriyel Sayısı : ");
        int n = input.nextInt();
        int total = 1;

        for(int i = 1; i <= n; i++){
            total = total * i;
        }
        System.out.println(n + " Sayısının Faktöriyeli : " + total);
         */

        //Kombinasyon Hesaplayan Program
        Scanner input = new Scanner(System.in);

        System.out.println("Kombinasyon Hesaplama ");
        int n, r;

        int totaln = 1;
        int totalr = 1;
        int totalm = 1;

        System.out.println("n sayısını giriniz: ");
        n = input.nextInt();

        for(int i = 1; i <= n; i++){
            totaln = totaln * i;
        }

        System.out.println("r sayısını giriniz: ");
        r = input.nextInt();

        for(int i = 1; i <= r; i++){
            totalr = totalr * i;
        }

        for(int i = 1; i <= n-r; i++){
            totalm = totalm *i;
        }

        int kombinasyon = totaln / (totalr * (totalm));

        System.out.println("Kombinasyon Sonucu : "+ kombinasyon);
    }
}
