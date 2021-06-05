package spiel;


import  java.util.Random;
import  java.util.Scanner;


public class rat {



	public static void main(String[] args) {
		Random zufall = new Random();
		Scanner sc = new Scanner(System.in);

		int n = zufall.nextInt(101);

		System.out.println("Tippen Sie Ihre Vermutung ein! ");
		while(true) {     
			int ratezahl = sc.nextInt();
//			sc.close();
			if( ratezahl == n) {
				System.out.println("Korrekt! Sie haben gewonnen!");
				break;
			}
			else if( ratezahl<n) {
				System.out.println("Ihre Zahl ist niedriger. Bitte raten Sie noch einmal!");
			}
////						if(ratezahl >n) {
////							System.out.println (" Nope the number is lower. Try Again");
//						}
			else{
				System.out.println("Ihre Zahl ist höher. Bitte raten Sie noch einmal!");
			}
		}
	}

}

