package schritt4;

public class Spiel {
    private Mannschaft1 mannschaft1;
    private Mannschaft2 mannschaft2;
    private Ergebnis ergebnis;
    private StringBuilder Spielbericht;

    public Spiel(Mannschaft1 heim, Mannschaft2 gast){
        this.mannschaft1 = heim;
        this.mannschaft2 = gast;
    }

    public Mannschaft1 getHeim() {
        return mannschaft1;
    }

    public Mannschaft1 getGast() { return getGast();}

    public Ergebnis getErgebnis() {
        return ergebnis;
    }

    public StringBuilder getSpielbericht() {
        return Spielbericht;
    }



}
