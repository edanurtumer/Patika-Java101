import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int r, a;
	    double pi = 3.14, alan, cevre;

	    Scanner input = new Scanner(System.in);

	    System.out.print("Dairenin yarı çapını giriniz : ");
	    r = input.nextInt();

	    System.out.print("Merkez açısının ölçüsünü giriniz : ");
	    a = input.nextInt();

	    /*
	    alan = pi * r * r;
	    cevre = 2 * pi * r;

	    System.out.println("Dairenin Alanı : " + alan);
	    System.out.println("Dairenin Çevresi : " + cevre);
	     */

		alan = (pi * (r * r) * a)/360;
		System.out.print("Dairenin Alanı : " + alan);

    }
}
