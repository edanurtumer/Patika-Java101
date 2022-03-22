import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int n, k;
	    Scanner input = new Scanner(System.in);
	    System.out.print("Üssü Alınacak Sayı : ");
	    n = input.nextInt();
	    System.out.print("Üs Alınacak Sayı : ");
	    k = input.nextInt();

	    int total = 1;

	    //While döngüsü ile
		/*
	    int i = 1;
	    while(i <= k){
	        total *= n;
	        i++;
        }
        */
		for( int i = 1; i <= k; i++){
			total *= n;
		}


	    System.out.println("Cevap : " + total);
    }
}
