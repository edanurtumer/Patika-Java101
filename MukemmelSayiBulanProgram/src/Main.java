import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int total = 0;
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for( int i = 2; i < number/2; i++){
            if(number % i == 0){
                total += i;
            }
        }
        if(total == number){
            System.out.print(number + " Mükemmel Sayıdır.");
        }
        else{
            System.out.print(number + " Mükemmel Sayı Değildir.");
        }
    }
}
