
package model;


final public class Regular extends Poligon{
    double midaCostats;
    
    public Regular(String nom, int costats, double midaCostats) {
        super(nom, costats);
        this.midaCostats = midaCostats;
    }
    
    
    public double getMidaCostats(){
        return this.midaCostats;
    }
    
    public void setMidaCostats(double mida){
        this.midaCostats = mida;
    }

    public double getArea() {
        double angle = 360 / costats;
        double tangent = Math.tan(angle / 2);
        double apotema = midaCostats / tangent;
        double area =( (costats * midaCostats * apotema) /2 );
        return area;
    }
   
    
}
