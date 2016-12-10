package model;

final public class Cercle extends Figura {

    double radi;

    public Cercle(String nom, double radi) {
        super(nom);
        this.radi = radi;
    }

    public String getNom() {
        return nom;
    }

    
    public double getRadi(){
        return this.radi;
    }
    
    public void setRadi(double radi) {
        this.radi = radi;
    }

    public double getAreaCercle(){
        return (Math.PI * Math.pow(radi, 2));
    }
    
    public double getPerimetreCercle(){
        return (2 *  Math.PI * radi);
    }

    @Override
    public String toString() {
        return "Cercle{" + "nom= " + nom + " radi= " + radi + ", area= " + this.getAreaCercle() +'}';
    }
    
    
}
