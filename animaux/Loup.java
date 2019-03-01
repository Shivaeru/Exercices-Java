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
public class Loup extends Animaux{

    public Loup(String pelage, int age, boolean mechant) {
        super(pelage, age, mechant);
        System.out.println("Création d'un animal avec paramètres");

    }

    public Loup() {
        super();
        System.out.println("Création d'un animal");

    }

    @Override
    public String toString() {
        return "Loup{" + "pelage=" + pelage + ", age=" + age + ", mechant=" + mechant + '}';
    }
    
    public void hurler(){
        System.out.println("Ahouuuuuuu!");
    }
    public void manger(){
        System.out.println("Le loup manger un mouton.");
    }
    public void chasser(){
        System.out.println("Le loup chasse un lapin.");
    }
}