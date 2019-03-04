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
public class Test {
        
    public static void main(String[] args) {
    
    		Voiture[] voitures = new Voiture[3];
		voitures[0] = new Voiture("Audi", 240, 8);
		voitures[1] = new Voiture("Renault", 180, 5);
		voitures[2] = new Voiture("Mercedes", 200, 8);
 
		for (Voiture v : voitures) {
			System.out.println(v);
		}
 
		// Pour y accéder à une variable de classe,
		// il faut utiliser non pas un identificateur
		// d'objet mais le nom de la classe
 
		System.out.println("Il y a " + Voiture.count + " voitures");
 
	}
}

