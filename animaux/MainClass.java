/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaux;

/**
 *
 * @author tsoukalas
 */
public class MainClass {

    public static void main(String[] args) {
        
        Loup crocBlanc = new Loup();
        
        crocBlanc.setPelage("Blanc");
        crocBlanc.setAge(5);
        crocBlanc.setMechant(false);
        System.out.println(crocBlanc);
        
        Chat chatoune = new Chat();
        chatoune.setPelage("Gris");
        chatoune.setAge(3);
        chatoune.setMechant(true);
        System.out.println(chatoune);
        
        Chat mimine = new Chat("Grise et blanche", 50, false);
        System.out.println(mimine);
        
        Chien galak = new Chien("Blanc et marron", 8, false);
        System.out.println(galak);
    }
}
