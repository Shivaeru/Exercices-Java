package sommeUn;

import java.util.Scanner;

public class sommeUn {
	
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez choisir un nombre : ");
		
		try {
		int chiffreUn=sc.nextInt();
		
		System.out.println("Veuillez choisir un second nombre : ");
		int chiffreDeux=sc.nextInt();
		
		int resultat= chiffreUn+chiffreDeux;

		
		System.out.println(chiffreUn+" + "+chiffreDeux+ " = "+ resultat);
		}
		
		catch (Exception e) {
			System.err.println("Vous devez entrer un chiffre!");
		}
		
		sc.close();
		

		
	}

}
