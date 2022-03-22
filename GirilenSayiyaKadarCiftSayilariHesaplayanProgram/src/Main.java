import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int k;
	    Scanner input = new Scanner(System.in);

	    System.out.print("Sayı Giriniz : ");
	    k = input.nextInt();

		//For Döngüsü ile
	    /*for( int i = 0; i <= k; i++){
	        if( i % 2 == 0){
	            System.out.println(i);
            }
        }*/

		//While Döngüsü ile
		/*
		int i = 0;
		while(i <= k){
			if( i % 2 == 0){
				System.out.println(i);
			}
			i++;
		}
		 */

		//3'e ve 4'e tam bülünen sayıların ortalamasını bulan programdır.
		int count = -1, total = 0;
		double average;
		for(int i = 0; i <= k; i++){
			if(i % 3 == 0 && i % 4 == 0) {
				total += i;
				count++;
			}
		}
		average = total / count;
		System.out.print("Ortalama : " + average);

    }
}
