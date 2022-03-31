import java.util.Scanner;

public class Main {
    
    public static void deseneGoreMetotOlusturma(int n, int temporary, boolean mode){
        int next;

        System.out.print(" " + temporary);

        if(temporary <= 0){
            mode = false;
        }

        next = mode ? temporary-5 : temporary+5;
        if(next <= n){
            deseneGoreMetotOlusturma(n, next, mode);
        }

    }

    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

	    System.out.print(" N sayısı : " );
	    number = input.nextInt();

	    deseneGoreMetotOlusturma(number, number, true);

    }
}
