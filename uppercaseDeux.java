package uppercaseDeux;

import java.util.Scanner;

public class uppercaseDeux {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez votre nom : ");
		String nom = sc.nextLine();
		System.out.println("Entrez votre prénom : ");
		String prenom = sc.nextLine();
		
		System.out.println(nom +" "+prenom);
		
		System.out.println(nom.toUpperCase() );
		System.out.println(Character.toString(prenom.charAt(0)).toUpperCase()+prenom.substring(1));


		
		
	}

}
