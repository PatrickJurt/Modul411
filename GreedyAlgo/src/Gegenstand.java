public class Gegenstand implements Comparable<Gegenstand> {

    private String name;
    private double gewicht;

    public Gegenstand(String name, double gewicht){
        this.name = name;
        this.gewicht = gewicht;
    }

    @Override
    public int compareTo(Gegenstand gegenstand) {
        if (this.getGewicht() < gegenstand.getGewicht()) return -1;
        if (this.getGewicht() == gegenstand.getGewicht()) return 0;
        return 1;
    }

    @Override
    public String toString() {
        return name + ": " + gewicht;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }
}
