package exercice13;

import java.util.Scanner;

public class exercice13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int count = 0;


		System.out.println("Veuillez écrire une phrase : ");
        String phrase = sc.nextLine();

        System.out.println("Veuillez choisir une lettre se trouvant dans votre phrase : ");
        String lettre = sc.nextLine();
        
        
        
        for (int i=0; i< phrase.length(); i++) {
        if (phrase.charAt(i)== lettre.charAt(0)) {
        	count++;
        }     		
        }
        
		System.out.println(count);
	}	
}
