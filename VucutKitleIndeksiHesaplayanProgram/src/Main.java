import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int  weight;
	    double size, bodyMassIndex;

	    Scanner input = new Scanner(System.in);

	    System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
	    size = input.nextDouble();

	    System.out.print("Lütfen kilonuzu giriniz : ");
	    weight = input.nextInt();

	    bodyMassIndex = weight / (size * size);
	    System.out.print("Vücut Kitle İndeksiniz : " + bodyMassIndex);
    }
}
