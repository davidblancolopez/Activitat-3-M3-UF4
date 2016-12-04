
package model;


public class Rombe extends NoRegular{
    double diagonalMajor, diagonalMenor;
    
    public Rombe(String nom, double DM, double dm) {
        super(nom);
        this.diagonalMajor = DM;
        this.diagonalMenor = dm;
    }
    
    public double areaRombe(){
        return ((diagonalMajor * diagonalMenor) /2);
    }

}
