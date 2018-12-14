package exercice18;

import java.util.Scanner;

public class exercice18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un entier compris entre 0 et 256 : ");
		int entier = sc.nextInt();
				
		if (entier >= 256 || entier <= 0)
		{
			System.out.println("Nombre invalide!");
		}
			
			else 
				System.out.println(Character.toChars(entier));

	}

}
