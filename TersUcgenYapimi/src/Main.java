import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısı : ");
        n = input.nextInt();

        for( int i = n; i > 0; i--){
            for(int j = 0; j < n-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < (i*2)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
