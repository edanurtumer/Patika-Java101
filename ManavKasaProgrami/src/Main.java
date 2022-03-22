import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double pear = 2.14,apple = 3.67, tomato = 1.11, banana = 0.95, aubergine = 5.00;
	    int pearKg, apppleKg, tomatoKg, bananaKg, aubergineKg;
	    double total;

	    Scanner input = new Scanner(System.in);

	    System.out.print("Armut Kaç Kilo ? : ");
	    pearKg = input.nextInt();

        System.out.print("Elma Kaç Kilo ? : ");
        apppleKg = input.nextInt();

        System.out.print("Domates Kaç Kilo ? : ");
        tomatoKg = input.nextInt();

        System.out.print("Muz Kaç Kilo ? : ");
        bananaKg = input.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        aubergineKg = input.nextInt();

        total = (pear * pearKg) + (apple * apppleKg) + (tomato * tomatoKg) + (banana * bananaKg) + (aubergine * aubergineKg);
        System.out.print("Toplam Tutar : " + total);
    }
}
