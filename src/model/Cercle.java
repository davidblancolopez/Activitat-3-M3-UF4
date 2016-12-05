package model;

final public class Cercle extends Figura {

    double radi;
    final double pi = 3.14;

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
        return (pi * Math.pow(radi, radi));
    }
    
    public double getPerimetreCercle(){
        return (2 *  pi * radi);
    }

    @Override
    public String toString() {
        return "Cercle{" + "radi=" + radi + '}';
    }
    
    
}
