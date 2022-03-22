import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String userName, password;
	    int decide;

	    Scanner input = new Scanner(System.in);

	    System.out.print("Kullanıcı Adınız : ");
	    userName = input.nextLine();

	    System.out.print("Şifreniz : ");
	    password = input.nextLine();

	    if(userName.equals("edanur") && password.equals("edanur06")){
	        System.out.println("Giriş Yaptınız !");
        }
	    else{
	        System.out.println("Bilgileriniz Yanlış !");
	        System.out.println("Şifrenizi Sıfırlamak İster Misiniz ?\n Yeni şifre oluşturmak için 1'e basınız, çıkmak için 2'ya basınız.");
	        decide = input.nextInt();
	        switch(decide){
				case 1:
					System.out.print("Yeni şifrenizi oluşturabilirsiniz : ");
					Scanner input1 = new Scanner(System.in);
					String newPassword = input1.nextLine();

					if(newPassword.equals("edanur06")){
						System.out.println("Şifre oluşturulamadı. Lütfen başka şifre giriniz.");
					}else{
						password = newPassword;
						System.out.println("Yeni şifreniz oluşturuldu.");
					}
					break;
				case 2:
					System.out.println("Çıkış Yaptınız !");
					break;
				default:
					System.out.println("Hatalı işlem yaptınız !");
					break;

			}
	    }
    }
}
