import java.util.Scanner;

public class Main {

    public static void primeNumber(int n){
        int counter = 0;
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                counter++;
            }
        }
        if(counter == 2){
            System.out.println(n + " sayısı ASALDIR!");
        }
        else{
            System.out.println(n + " sayısı ASAL değildir!");
        }
    }

    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        number = input.nextInt();

        primeNumber(number);

    }
}
