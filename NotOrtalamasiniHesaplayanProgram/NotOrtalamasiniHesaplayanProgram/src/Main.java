import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
         *Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan
         * ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
         * */

        //Değişkenler oluşturuldu.
        int mat, fiz, kim, turk, tar, muz;

        //Scanner sınıfımızı oluşturduk.
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerler alındı.
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fiz = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kim = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turk = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tar = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muz = inp.nextInt();

        int toplam = (mat+fiz+kim+turk+tar+muz);
        double ortalama = toplam/6;

        System.out.println("Ortalamanız : " + ortalama);

        String sonuc = (ortalama > 60) ? "Sınıfı Geçti!" : "Sınıfta Kaldı!";

        System.out.println(sonuc);
    }
}
