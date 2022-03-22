import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int number, i = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Sınır sayısını giriniz : ");
        number = input.nextInt();
        int fourFloor = 1, fiveFloor =1;
        do{
            fourFloor *= 4;
            System.out.println(fourFloor);
            fiveFloor *= 5;
            System.out.println(fiveFloor);
            i++;
        }while(i <= number);

    }
}
