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

    public double getAngle() {
        return (360 / this.costats);
    }

    public double getApotema() {
        return this.midaCostats / (Math.tan(Math.toRadians(getAngle() / 2)) * 2);
    }

    public double getAreaRegular() {
        area = ((getPerimetre() * getApotema()) / 2);
        df.format(area);
        return area;
    }

    public double getPerimetre() {
        return costats * midaCostats;
    }

    @Override
    public String toString() {
        return "Regular{" + "Nom: " + this.nom + ", midaCostats= " + midaCostats + ", costats= " + costats + ", area= " + this.getAreaRegular() + ", perimetre= " + getPerimetre() +'}';
    }

}
