package exercice15;

import java.util.Scanner;

public class exercice15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un mot : ");
		String mot = sc.nextLine();
		
		if (mot.length() >= 5) {
			
			String troislettres = mot.substring(mot.length() - 3);

			System.out.println(troislettres);
			
			String sanscarac = mot.substring(2, mot.length() -3);
			
			System.out.println(sanscarac);

		}

		else
			System.out.println("Votre mot doit contenir au moins 6 caractères!");
	}

}
