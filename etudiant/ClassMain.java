/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant;

/**
 *
 * @author tsoukalas
 */
public class ClassMain {
    	public static void main(String[] main) {
		Employe[] employes = new Employe[2];
		employes[0] = new Employe("Pourcelot", "Sabrina", 23);
		employes[1] = new Employe("Jahan", "Eric", 12);
		System.out.println("La liste des employes : ");
		for (Employe e : employes)
			System.out.println("\t" + e);
 
		Etudiant[] etudiants = new Etudiant[2];
		etudiants[0] = new Etudiant("Tsoukalas", "Ioanna", "1234");
		etudiants[1] = new Etudiant("Lobert", "Justine", "3456");
		System.out.println("La liste des étudiants : ");
		for (Etudiant e : etudiants)
			System.out.println("\t" + e);
 
		Professeur[] professeurs = new Professeur[2];
		professeurs[0] = new Professeur("Courde", "Agnès", 2500, "JAVA");
		professeurs[1] = new Professeur("Pailha", "Géna", 2000,
				"Javascript");
		System.out.println("La liste des professeurs : ");
		for (Professeur p : professeurs)
			System.out.println("\t" + p);
	}
}

