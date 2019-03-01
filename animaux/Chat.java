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
public class Chat extends Animaux{

    public Chat(String pelage, int age, boolean mechant) {
        super(pelage, age, mechant);
        System.out.println("Création d'un animal avec paramètres");

    }

    public Chat() {
        super();
        System.out.println("Création d'un animal ");

    }
    
    @Override
    public String toString() {
        return "Chat{" + "pelage=" + pelage + ", age=" + age + ", mechant=" + mechant + '}';
    }
    
    public void miauler(){
        System.out.println("Miaouuu!");
    }
    public void manger(){
        System.out.println("Le chat mange des croquettes.");
    }
    public void chasser(){
        System.out.println("Le chat chasse une souris.");
    }
}