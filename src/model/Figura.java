
package model;


public class Figura {
    double area;
    double perimetre;
    String nom;
    
    public Figura (String nom){
        this.nom = nom; 
    }

    @Override
    public String toString() {
        return  (nom + " : ");
    }
    
    
}
