
package model;


public abstract class Figura {
    double area;
    double perimetre;
    String nom;
    
    /**
     * Metodes constructor getters i setters
     */
    
    public Figura (String nom){
        this.nom = nom; 
    }

    @Override
    public String toString() {
        return  (nom + " : ");
    }

    public String getNom() {
        return nom;
    }


    
    
    
}
