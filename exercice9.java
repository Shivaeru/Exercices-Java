package exercice9;

import java.util.Scanner;

public class exercice9
{

	public static void main(String[] args)
	{ 
		int i = 1;
		int count0_20 = 0;
		int count21_40 = 0;
		int count41_100 = 0;
		int nbSaisi = 1;
		Scanner sc = new Scanner(System.in);
		while(i <= 20)
	    {
			System.out.println("Rentrez votre âge :");
			nbSaisi = sc.nextInt();
			
			if (nbSaisi < 100)
			{
	  
				if((nbSaisi > 0) && (nbSaisi <= 20))
				{
					count0_20++;
				}
				else if((nbSaisi >= 21) && (nbSaisi <= 40))
				{
					count21_40++;
				}
				else if((nbSaisi >= 41) && (nbSaisi <= 100))
				{
					count41_100++;
				}
			}
			else
			{	         
				System.out.println("Nombre trop élevé!");
				break;
			}
			i++;
	    }
	    	System.out.println("Il y a " + count0_20 + "personnes de moins de 20 ans, " + count21_40 + "personnes qui ont entre 21 et 40 ans et " + count41_100 + "personnes qui ont entre 41 et 100 ans.");
	}
}

