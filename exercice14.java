package exercice14;

import java.util.Scanner;

public class exercice14 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez écrire un mot : ");
		
		String mot = sc.nextLine();

		System.out.println(mot.toUpperCase() );
		
		System.out.println(Character.toString(mot.charAt(0)).toUpperCase()+mot.substring(1));
	}

}
