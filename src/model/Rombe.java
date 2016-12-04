
package model;


public class Rombe extends NoRegular{
    double diagonalMajor, diagonalMenor;
    int nombreCostats;
    
    public Rombe(String nom, double DM, double dm) {
        super(nom);
        this.diagonalMajor = DM;
        this.diagonalMenor = dm;
        this.nombreCostats = 4;
    }
    
    public double getAreaRombe(){
        return ((diagonalMajor * diagonalMenor) /2);
    }

}
