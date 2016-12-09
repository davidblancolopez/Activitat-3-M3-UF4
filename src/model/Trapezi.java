
package model;


public class Trapezi extends NoRegular{
    double baseMajor, baseMenor, altura, diagonal;
    int nombreCostats;
    
    public Trapezi(String nom, double BM, double bm, double altura, double diagonal) {
        super(nom);
        this.baseMajor = BM;
        this.baseMenor = bm;
        this.altura = altura;
        this.diagonal = diagonal;
        this.nombreCostats = 4;
    }
    
    public double getAreaTrapezi(){
        return (( (baseMajor + baseMenor) /2) * altura);
    }

    public void setBaseMajor(double baseMajor) {
        this.baseMajor = baseMajor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }
    
    

    @Override
    public String toString() {
        return "Trapezi{" + "Nom: " + this.nom + ", baseMajor=" + baseMajor + ", baseMenor=" + baseMenor + ", altura=" + altura + ", diagonal= " + diagonal +
                ", nombreCostats=" + nombreCostats + ", area= " + this.getAreaTrapezi() +'}';
    }
    
    
    
}
