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
public class Animaux {

    @Override
    public String toString() {
        return "Animaux{" + "pelage=" + pelage + ", age=" + age + ", mechant=" + mechant + '}';
    }
    
    protected String pelage;
    protected int age;
    protected boolean mechant = false;

    public Animaux(String pelage, int age, boolean mechant) {
        System.out.println("Création d'un animal avec paramètres");
        this.pelage = pelage;
        this.age = age;
        this.mechant = mechant;
    }

    public Animaux() {
        System.out.println("Création d'un animal");
    }   

    public String getPelage() {
        return pelage;
    }

    public void setPelage(String pelage) {
        this.pelage = pelage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMechant() {
        return mechant;
    }

    public void setMechant(boolean mechant) {
        this.mechant = mechant;
    }
    
}
