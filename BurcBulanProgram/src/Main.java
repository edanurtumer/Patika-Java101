import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int month, day;

	    Scanner input = new Scanner(System.in);

	    System.out.print("Doğduğunuz Ay : ");
	    month = input.nextInt();

	    System.out.print("Doğduğunuz Gün : ");
	    day = input.nextInt();

        if(month == 1){
            if(day >= 1 && day <= 31){
                if(day < 22){
                    System.out.print("Oğlak Burcu");
                }
                else{
                    System.out.print("Kova Burcu");
                }
            }
            else{
                System.out.print("Geçersiz Bir Gün Girdiniz !");
            }

        }
        else if( month == 2){
            if(day >= 1 && day <= 28){
                if(day < 20){
                    System.out.print("Kova Burcu");
                }
                else{
                    System.out.print("Balık Burcu");
                }
            }
            else{
                System.out.print("Geçersiz Bir Gün Girdiniz !");
            }
        }
        else if( month == 3){
            if(day >= 1 && day <= 31){
                if(day < 21){
                    System.out.print("Balık Burcu");
                }
                else{
                    System.out.print("Koç Burcu");
                }
            }
            else{
                System.out.print("Geçersiz Bir Gün Girdiniz !");
            }
        }
        else if( month == 4){
            if(day >= 1 && day <= 30){
                if(day < 21){
                    System.out.print("Koç Burcu");
                }
                else{
                    System.out.print("Boğa Burcu");
                }
            }
            else{
                System.out.print("Geçersiz Bir Gün Girdiniz !");
            }
        }
        else if( month == 5){
            if(day >= 1 && day <= 31){
                if(day < 22){
                    System.out.print("Boğa Burcu");
                }
                else{
                    System.out.print("İkizler Burcu");
                }
            }
            else{
                System.out.print("Geçersiz Bir Gün Girdiniz !");
            }
        }
        else if( month == 6){
            if(day >= 1 && day <= 30){
                if(day < 23){
                    System.out.print("İkizler Burcu");
                }
                else{
                    System.out.print("Yengeç Burcu");
                }
            }
            else{
                System.out.print("Geçersiz Bir Gün Girdiniz !");
            }
        }
        else if( month == 7){
            if(day >= 1 && day <= 31){
                if(day < 23){
                    System.out.print("Yengeç Burcu");
                }
                else{
                    System.out.print("Aslan Burcu");
                }
            }
            else{
                System.out.print("Geçersiz Bir Gün Girdiniz !");
            }
        }
        else if( month == 8){
            if(day >= 1 && day <= 31){
                if(day < 23){
                    System.out.print("Aslan Burcu");
                }
                else{
                    System.out.print("Başak Burcu");
                }
            }
            else{
                System.out.print("Geçersiz Bir Gün Girdiniz !");
            }
        }
        else if( month == 9){
            if(day >= 1 && day <= 30){
                if(day < 23){
                    System.out.print("Başak Burcu");
                }
                else{
                    System.out.print("Terazi Burcu");
                }
            }
            else{
                System.out.print("Geçersiz Bir Gün Girdiniz !");
            }
        }
        else if( month == 10){
            if(day >= 1 && day <= 31){
                if(day < 23){
                    System.out.print("Terazi Burcu");
                }
                else{
                    System.out.print("Akrep Burcu");
                }
            }
            else{
                System.out.print("Geçersiz Bir Gün Girdiniz !");
            }
        }
        else if( month == 11){
            if(day >= 1 && day <= 30){
                if(day < 22){
                    System.out.print("Akrep Burcu");
                }
                else{
                    System.out.print("Yay Burcu");
                }
            }
            else{
                System.out.print("Geçersiz Bir Gün Girdiniz !");
            }
        }
        else if( month == 12){
            if(day >= 1 && day <= 31){
                if(day < 22){
                    System.out.print("Yay Burcu");
                }
                else{
                    System.out.print("Oğlak Burcu");
                }
            }
            else{
                System.out.print("Geçersiz Bir Gün Girdiniz !");
            }
        }
        else{
            System.out.print("Hatalı ay girişi yaptınız !");
        }

    }
}
