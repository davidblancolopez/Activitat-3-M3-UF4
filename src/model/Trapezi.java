
package model;


public class Trapezi extends NoRegular{
    double baseMajor, baseMenor, altura;
    
    public Trapezi(String nom, double BM, double bm, double altura) {
        super(nom);
        this.baseMajor = BM;
        this.baseMenor = bm;
        this.altura = altura;
    }
    
    public double getAreaRombe(){
        return (( (baseMajor + baseMenor) /2) * altura);
    }
    
}
