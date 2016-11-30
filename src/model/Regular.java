
package model;


final public class Regular extends Poligon{
    double midaCostats;
    
    public Regular(String nom, int costats, double costat) {
        super(nom, costats);
        this.costats = costats;
        this.midaCostats = costat;
    }
    
}
