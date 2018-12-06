package exercice6;

import java.util.Scanner;

public class exercice6 {
	
	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		
         System.out.println("Entrez le premier nombre :");
         int x = sc.nextInt();
         System.out.println("Entrez le second nombre :");
         int y = sc.nextInt();
         System.out.println("Choisir l'opération à effectuer + - / ou *");
         sc.nextLine();
         String operateur = sc.nextLine();
	
         
         if ((x >= -1000) && (x <= 1000) && (y >= -1000) && (y <= 1000)) {
        	 
         switch (operateur) {

         case "+":
         System.out.println(x+y);
         break;
         case "-":
         System.out.println(x-y);
         break;
         case "*":
         System.out.println(x*y);
         break;
         case "/":
         if ((x !=0) && (y !=0)) {
        	 System.out.println(x/y);
         }
         else {
        	 System.out.println("Impossible de diviser par 0!");
         }
        break;
        default: System.out.println("Erreur!");
        System.out.println(x+y);
        break;
         }
         }
        else {
        	System.out.println("Erreur!");
        	
        }
        }
}
