import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year;
        boolean leapYear = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        year = input.nextInt();

        if(year % 4 == 0) {
            if( year % 100 == 0) {
                if ( year % 400 == 0) {
                    leapYear = true;
                }
                else {
                    leapYear = false;
                }
            }
            else{
                leapYear = true;
            }

        }
        else{
            leapYear = false;
        }

        if(leapYear) {
            System.out.println(year + " bir artık yıldır ! ");
        }
        else {
            System.out.println(year + " bir artık yıl değildir ! ");
        }
    }
}
