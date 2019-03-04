/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voiture;

/**
 *
 * @author tsoukalas
 */
public class Voiture {

        //Attribut de l'objet
	private int id;
	private String marque;
	private double vitesse;
	private int puissance;
	
        //Variable de classe
	public static int count = 0;
	
	public Voiture(String marque, double vitesse, int puissance) {
		this.id = ++count;
		this.marque = marque;
		this.vitesse = vitesse;
		this.puissance = puissance;
	}
 
	@Override
	public String toString() {
		return "id=" + id + ", marque=" + marque + ", vitesse=" + vitesse
				+ ", puissance=" + puissance;
	}    
}
