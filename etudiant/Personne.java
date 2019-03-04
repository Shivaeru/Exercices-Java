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
public class Personne {
	protected int id;
	protected String nom;
	protected String prenom;
 
	private static int count;
 
	public Personne(String nom, String prenom) {
		this.id = ++count;
		this.nom = nom;
		this.prenom = prenom;
	}
 
	@Override
	public String toString() {
		return "Je suis " + this.nom.toUpperCase() + " "
				+ this.prenom.substring(0, 1).toUpperCase() + ""
				+ this.prenom.substring(1).toLowerCase();
	}
}
