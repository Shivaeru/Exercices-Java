package exercice7;

import java.util.Scanner;

public class exercice7
{

	public static void main(String[] args)
	{
		
		 Scanner sc=new Scanner(System.in);
			
         System.out.println("Entrez un nombre à multiplier :");
         int n = sc.nextInt();
         //On demande à l'user d'entrer un nb à multiplier
         System.out.println("Entrez le nombre de fois dont vous voulez le multiplier :");
         int x = sc.nextInt();
         //On demande à l'user d'entrer jusqu'à cb il souhaite multiplier ce nb
         
         System.out.println("Les multiples sont: ");
         //J'imprime cette phrase avant le calcul car sinon il est compris dans la boucle et la phrase se repète autant de x
         
         for (int i = 1; i <= x; i++) 
         // methode qui permet de faire une boucle de 1 jusqu'à atteindre le nombre X
         {
        	
			System.out.println(n*i);
         }
    }
}
