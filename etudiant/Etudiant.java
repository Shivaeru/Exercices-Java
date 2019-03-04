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
public class Etudiant extends Personne {
    	private String identifiant;
 
	public Etudiant(String nom, String prenom, String identifiant) {
		super(nom, prenom);
		this.identifiant= identifiant;
	}
 
	@Override
	public String toString() {
		return super.toString() + " mon identifiant est: " + this.identifiant;
	}    
}
