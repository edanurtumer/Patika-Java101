import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int minNum, maxNum, ebob, ekok;

	    Scanner input = new Scanner(System.in);

	    System.out.print("n1 sayısını giriniz : ");
	    int n1 = input.nextInt();

	    System.out.print("n2 sayısını giriniz : ");
	    int n2 = input.nextInt();

	    if(n1 < n2){
	        minNum = n1;
	        maxNum = n2;
        }
	    else{
            minNum = n2;
            maxNum = n1;
        }

	    //18,24
		//birim maliyeti 18 döngü
	    for(int i = 1; i <= minNum; i++){
	        if(n1%i == 0 && n2%i == 0 ){
				System.out.println(i);
	            ebob = i;
            }
        }
	    System.out.println("------------");

	    //18,24 -> birim maliyeti 14 döngü
	    for(int k = minNum; k >= 1; k--){
			if(n1%k == 0 && n2%k == 0 ){
				ebob = k;
				System.out.println(k);
				break;
			}
		}

	    System.out.println("------------");
	    //Ebob - While döngüsü
		while(minNum >= 1){
			if(n1%minNum == 0 && n2%minNum == 0 ){
				ebob = minNum;
				System.out.println(minNum);
				break;
			}
			minNum--;
		}
		System.out.println("------------");

		for(int i = 1; i <= (n1*n2); i++){
			if(i % n1 == 0 && i % n2 == 0){
				System.out.println(i);
				break;
			}
		}
		System.out.println("------------");
		//Ekok , While Döngüsü
		int k = 1;
		while(k <= (n1*n2)){
			if(k % n1 == 0 && k % n2 == 0){
				System.out.println(k);
				break;
			}
			k++;
		}
    }
}
