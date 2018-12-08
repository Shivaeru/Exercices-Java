package exercice8;

import java.util.Scanner;

public class exercice8
{

	public static void main(String[] args)
	{ 
		int i = 1;
		int count = 0;
		int nbSaisi = 1;
		Scanner sc = new Scanner(System.in);
				
		while(i <= 20)
			//Le compteur ne s'arrête qu'au bout de 20 âges saisis
		{
	         System.out.println("Rentrez votre âge :");
	  			nbSaisi = sc.nextInt();
	  			if (nbSaisi < 20)
	  			{
	  				count++;
	  			 }
	  			i++;
	  		}
		//Le compteur compte le nombre de chiffres inférieurs à 20
		
	  		System.out.println("Il y a " + count + " personnes de moins de 20 ans.");
	  	}
	  		
	  }
	 
    