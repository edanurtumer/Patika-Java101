import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int N, number, min = 0, max = 0, temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz? : " );
        N = input.nextInt();

        for(int i = 1; i <= N; i++){
            System.out.print(i +". sayıyı giriniz : ");
            number = input.nextInt();
            if(number < min){
                min = number;
            }else if(number > max){
                max = number;
            }
        }
        System.out.print("En büyük sayı : " + max);
        System.out.println();
        System.out.print("En küçük sayı : " + min);
    }
}
