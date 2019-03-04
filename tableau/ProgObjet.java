/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableau;

/**
 *
 * @author tsoukalas
 */
public class ProgObjet {
     public static void main(String[] args) {
        /*
         * System.out.println("Veuillez choisir un nombre "); Scanner sc = new
         * Scanner(System.in); int entUs = sc.nextInt(); sc.nextLine();
         * 
         * 

         * System.out.println(tab[i]); } sc.close();
         */


        /*
         * Scanner sc = new Scanner(System.in); int entUs = sc.nextInt(); sc.nextLine();
         * int[] tab = new int[entUs];
         */
        
        ObjetTableau toto = new ObjetTableau();
        toto.affiche();
        toto.changeN();
        toto.remplirTab();
        toto.affiche();
    
    }
}
