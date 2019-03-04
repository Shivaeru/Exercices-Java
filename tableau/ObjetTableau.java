/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableau;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tsoukalas
 */
public class ObjetTableau {
     private int nombre;
    private int[] tab;

    
    public int[] getTab() {
        return tab;
    }

    public void setTab(int[] tab) {
        this.tab = tab;
    }

    public int getN() {
        return nombre;
    }

    public void setN(int n) {
        this.nombre = n;
    }

    public void affiche() {
        System.out.println("affichage d'un objet");
        System.out.println("n vaut "+ this.nombre);
        System.out.println(Arrays.toString(this.tab));
        /*
         * if(this.tab.equals(null)) 3{ System.out.print("[]"); }else { for (int i = 0; i
         * < this.tab.length; i++){ System.out.print(this.tab[i]+" * "); } }
         */
        System.out.println("");
    }


    public void remplirTab() {
        int[] newTab = new int[this.getN()]; 
        for (int i =0; i< newTab.length; i++) {
            newTab[i] = i +1;
        }
        this.setTab(newTab);
    }

    public void changeN() {


        System.out.println("Veuillez choisir un nombre ");
        Scanner sc = new Scanner(System.in);
        int entUs = sc.nextInt();
        this.setN(entUs);
        sc.nextLine();
    }         
}

