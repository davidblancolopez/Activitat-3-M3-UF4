
package model;


final public class Cercle extends Figura{
    double radi;
    final double pi = 3.14;
    
    public Cercle(String nom, double radi) {
        super(nom);
        this.radi = radi;
    }
    
    public String getNom(){
        return nom;
    }
    
   

}
