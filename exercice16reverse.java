package exercice16reverse;

import java.util.Scanner;

public class exercice16reverse {

		public static void main(String args[])
	       {
	          String mot, reverse = ""; // Entrée vide pour le reverse
	          Scanner sc = new Scanner(System.in);

	          System.out.println("Entrer un mot :");//question
	          mot = sc.nextLine();//reponse utilisateur

	          int lect = mot.length();//initialise ma variable de lecture

	          for (int i = lect - 1; i >= 0; i--)//boucle de lecture partant de la fin du mot
	             reverse = reverse + mot.charAt(i);//on entre les char du mot dans reverse mais à l'envers

	          if (mot.equals(reverse))//Méthode pour comparer les lettres du mot de l'utilisateur
	             System.out.println("Le mot est un palindrome.");
	          else//sinon
	             System.out.println("Le mot n'est pas un palindrome");
	         sc.close();
	       }
	    }
