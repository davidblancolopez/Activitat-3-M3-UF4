package model;

import java.text.DecimalFormat;

final public class Regular extends Poligon {

    DecimalFormat df = new DecimalFormat("#.##");
    double midaCostats;
    int costats;

    public Regular(String nom, int costats, double midaCostats) {
        super(nom);
        this.costats = costats;
        this.midaCostats = midaCostats;
    }

    public double getMidaCostats() {
        return this.midaCostats;
    }

    public void setMidaCostats(double mida) {
        this.midaCostats = mida;
    }

    public double getAreaRegular() {
        double angle = 360 / costats;
        double apotema = (2*Math.tan(Math.toRadians(360/costats)));
        double area = ( (getPerimetre() * apotema) /2);
        df.format(area);
        return area;

    }

    public double getPerimetre() {
        return costats * midaCostats;
    }

    @Override
    public String toString() {
        return "Regular{" + "Nom: " + this.nom + ", midaCostats= " + midaCostats + ", costats= " + costats + ", area= " + this.getAreaRegular() + '}';
    }

}
