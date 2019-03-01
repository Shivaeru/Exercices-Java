/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livre;

import java.util.Scanner;

/**
 *
 * @author tsoukalas
 */
public class MainClass {
    	public static void main(String[] args) {
		Livre[] livres = new Livre[3];
		Scanner sc = null;
		for (int i = 0; i < livres.length; i++) {
			sc = new Scanner(System.in);
			System.out.print("Donner le titre du livre n°  " + (i + 1) + " :");
			String titre = sc.nextLine();
			System.out.print("Donner l'auteur du livre n°  " + (i + 1) + " :");
			String auteur = sc.nextLine();
			System.out.print("Donner le prix du livre n°  " + (i + 1) + " :");
			int prix = sc.nextInt();
			livres[i] = new Livre(titre, auteur, prix);
		}
		sc.close();
		for (Livre l : livres)
			System.out.println(l);
 
		System.out.println("Le nombre de livres est " + Livre.count);
	}
 
}
