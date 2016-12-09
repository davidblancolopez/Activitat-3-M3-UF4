
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

    public void setDiagonalMajor(double diagonalMajor) {
        this.diagonalMajor = diagonalMajor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    
    
    
    @Override
    public String toString() {
        return "Rombe{"+ "Nom: " + this.nom + ", diagonalMajor=" + diagonalMajor + ", diagonalMenor=" + diagonalMenor + ", nombreCostats=" + nombreCostats 
                + ", area= " + this.getAreaRombe() +'}';
    }
    
    
    

}
