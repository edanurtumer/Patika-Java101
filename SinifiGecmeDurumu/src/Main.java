import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int maths, physics, turkish, chemical, music;
        int count = 0, total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        maths = input.nextInt();

        if(maths >= 0 && maths <= 100){
            total += maths;
            count++;
        }

        System.out.print("Türkçe Notunuz : ");
        turkish = input.nextInt();

        if(turkish >= 0 && turkish <= 100){
            total += turkish;
            count++;
        }

        System.out.print("Fizik Notunuz : ");
        physics = input.nextInt();

        if(physics >= 0 && physics <= 100){
            total += physics;
            count++;
        }

        System.out.print("Kimya Notunuz : ");
        chemical = input.nextInt();

        if(chemical >= 0 && chemical <= 100){
            total += chemical;
            count++;
        }

        System.out.print("Müzik Notunuz : ");
        music = input.nextInt();

        if(music>= 0 && music <= 100){
            total += music;
            count++;
        }

        double average = total / count;

        if(average <= 55){
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere !");
        }
        else{
            System.out.println("Tebrikler, sınıf geçtiniz !");
        }
        System.out.println("Ortalamanız : " + average);
    }
}
