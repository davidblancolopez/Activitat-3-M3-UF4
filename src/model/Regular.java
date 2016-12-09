package model;

final public class Regular extends Poligon {

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

    public double getAreaRegular(double midaCostats) {
        double angle = 360 / costats;
        double tangent = Math.tan(Math.toRadians(angle /2));
        double apotema = midaCostats / (2 * tangent);
        double area = ( (costats * midaCostats * apotema) /2 );
        return area;

    }

    public double getPerimetre() {
        return costats * midaCostats;
    }

    @Override
    public String toString() {
        return "Regular{" + "Nom: " + this.nom + ", midaCostats= " + midaCostats + ", costats= " + costats + ", area= " + this.getAreaRegular(midaCostats) + '}';
    }

}
