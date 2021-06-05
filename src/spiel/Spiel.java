package spiel;
import java.util.Random;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Spiel {
	public static void main(String[] args) {
		Random zufall = new Random();
		Scanner sc = new Scanner(System.in);

		int n = zufall.nextInt(200) + 1; //Zahl zwischen 1 und 100
	//
	JOptionPane.showMessageDialog(null, "Rate die Zahl zwischen 1 und 100");

		//System.out.println(n);
		String s = JOptionPane.showInputDialog("Zahl zwischen 1 und 100");
		int ratezahl = Integer.parseInt(s);
		//System.out.println("Rate die Zahl zwischen 1 und 100!");
		JOptionPane.showMessageDialog(null, "Rate die Zahl zwischen 1 und 100!");

		//int ratezahl = sc.nextInt();

		while (n != ratezahl) {
			if(n > ratezahl) {
				//System.out.println("Zu klein!");
				JOptionPane.showMessageDialog(null, "Zu klein!");
			}
			else {
				//System.out.println("Zu groß!");
				JOptionPane.showMessageDialog(null, "Zu groß!");
			}
			s= JOptionPane.showInputDialog("Zahl zwischen 1 und 100!");
			ratezahl = Integer.parseInt(s);
			//ratezahl = sc.nextInt();
		}
		//System.out.println("Richtig!");
		JOptionPane.showMessageDialog(null, "Richtig!");
	}
}


