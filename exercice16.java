package exercice16;

import java.util.Scanner;

public class exercice16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Entrez une phrase : ");
	 
		 	String mot = sc.next();

		 	// Non obligatoire, on transforme les lettre en min, et on autorise que les lettres
	        String test = mot.toLowerCase();
	        String autorise = "abcdefghijklmnopqrstuvwxyz";
	        
	        String count = "";
	        for (int i = 0; i < test.length(); i++) {
	            char c = test.charAt(i);
	            if (autorise.indexOf(c) != -1) {
	                count += c;
	            }
	        }
	        test = count;
	 
	        // On teste si mot2 est un palindrôme
	        int debut = 0;
	        int fin = test.length() - 1;
	        boolean palindrome=true;
	        while ((debut < fin) && palindrome) {
	            if (test.charAt(debut) != test.charAt(fin)) {
	                palindrome=false;
	            }
	            debut++;
	            fin--;
	        }
	 
	        if (palindrome) {
	            System.out.println("C'est un palindrôme !");
	        } else {
	            System.out.println("Non, ce n'est pas un palindrôme.");
	        }
	    }
	}
