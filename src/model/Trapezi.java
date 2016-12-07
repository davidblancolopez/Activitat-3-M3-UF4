
package model;


public class Trapezi extends NoRegular{
    double baseMajor, baseMenor, altura;
    int nombreCostats;
    
    public Trapezi(String nom, double BM, double bm, double altura) {
        super(nom);
        this.baseMajor = BM;
        this.baseMenor = bm;
        this.altura = altura;
        this.nombreCostats = 4;
    }
    
    public double getAreaTrapezi(){
        return (( (baseMajor + baseMenor) /2) * altura);
    }

    @Override
    public String toString() {
        return "Trapezi{" + "baseMajor=" + baseMajor + ", baseMenor=" + baseMenor + ", altura=" + altura +
                ", nombreCostats=" + nombreCostats + ", area= " + this.getAreaTrapezi() +'}';
    }
    
    
    
}
