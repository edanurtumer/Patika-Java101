import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int perKm, age, roundTrip;

	    Scanner input = new Scanner(System.in);

	    System.out.print("Mesafeyi km türünden giriniz : ");
	    perKm = input.nextInt();

	    System.out.print("Yaşınızı giriniz : ");
	    age = input.nextInt();

	    System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş - Dönüş) : ");
	    roundTrip = input.nextInt();

	    double normalAmount, ageDiscount, discountedAmount, rountTripDiscount, totalAmount;

	    normalAmount = perKm * 0.10;

	    if(perKm > 0 && age > 0 ){

	    	switch (roundTrip){
				case 1 :
					if(age < 12){
						ageDiscount = normalAmount * 0.50;
						discountedAmount = normalAmount - ageDiscount;
						System.out.print("Toplam Tutar : " + discountedAmount);
					}
					else if(age >= 12 && age < 24){
						ageDiscount = normalAmount * 0.10;
						discountedAmount = normalAmount - ageDiscount;
						System.out.print("Toplam Tutar : " + discountedAmount);
					}
					else if(age > 65){
						ageDiscount = normalAmount * 0.30;
						discountedAmount = normalAmount - ageDiscount;
						System.out.print("Toplam Tutar : " + discountedAmount);

					}
					else{
						System.out.print("Toplam Tutar : " + normalAmount);
					}
					break;
				case 2 :
					if(age < 12){
						ageDiscount = normalAmount * 0.50;
						discountedAmount = normalAmount - ageDiscount;
						rountTripDiscount = discountedAmount * 0.20;
						totalAmount = (discountedAmount - rountTripDiscount) * 2;
						System.out.print("Toplam Tutar : " + totalAmount);

					}
					else if(age >= 12 && age < 24){
						ageDiscount = normalAmount * 0.10;
						discountedAmount = normalAmount - ageDiscount;
						rountTripDiscount = discountedAmount * 0.20;
						totalAmount = (discountedAmount - rountTripDiscount) * 2;
						System.out.print("Toplam Tutar : " + totalAmount);
					}
					else if(age > 65){
						ageDiscount = normalAmount * 0.30;
						discountedAmount = normalAmount - ageDiscount;
						rountTripDiscount = discountedAmount * 0.20;
						totalAmount = (discountedAmount - rountTripDiscount) * 2;
						System.out.print("Toplam Tutar : " + totalAmount);

					}
					else{
						rountTripDiscount = normalAmount * 0.20;
						totalAmount = (normalAmount - rountTripDiscount) * 2;
						System.out.print("Toplam Tutar : " + totalAmount);
					}
					break;
				default :
					System.out.print("Hatalı Veri Girdiniz ! ");
					break;
			}
		}
	    else{
	    	System.out.print("Hatalı Veri Girdiniz ! ");
		}



    }
}
