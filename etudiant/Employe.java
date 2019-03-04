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
public class Employe extends Personne {
    
    	protected double salaire;
 
	public Employe(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaire = salaire;
	}
 
	public String toString() {
		return super.toString() + " mon salaire est: " + this.salaire + " euros";
	}
 
}
   
