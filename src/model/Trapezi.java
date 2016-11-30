
package model;


public class Trapezi extends NoRegular{
    double baseMajor, baseMenor, altura;
    
    public Trapezi(String nom, int costats, double BM, double bm, double altura) {
        super(nom, costats);
        this.baseMajor = BM;
        this.baseMenor = bm;
        this.altura = altura;
    }
    
    public double getAreaRombe(){
        return (( (baseMajor + baseMenor) /2) * altura);
    }
    
}
