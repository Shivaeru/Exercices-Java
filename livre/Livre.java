/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livre;

/**
 *
 * @author tsoukalas
 */
public class Livre {

	private int id;
	private String titre;
	private String auteur;
	private int prix;
	public static int count;
 
	public Livre(String titre, String auteur, int prix) {
		this.id = ++count;
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
	}
 
	public int getId() {
		return id;
	}
 
	public void setId(int id) {
		this.id = id;
	}
 
	public String getTitre() {
		return titre;
	}
 
	public void setTitre(String titre) {
		this.titre = titre;
	}
 
	public String getAuteur() {
		return auteur;
	}
 
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
 
	public int getPrix() {
		return prix;
	}
 
	public void setPrix(int prix) {
		this.prix = prix;
	}
 
	@Override
	public String toString() {
		return "Le prix du livre " + this.titre + " de l'auteur " + this.auteur
				+ " est :" + this.prix + " euro";
	}
 
}
   
