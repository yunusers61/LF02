public class Kunde extends Mitarbeiter{

    private Mitarbeiter betreuer;

    public Kunde(String Name, String Nachname,Mitarbeiter betreuer) {
        super(Name, Nachname);
        this.betreuer=betreuer;

    }
    //Get-Set
    public Mitarbeiter getBetreuer() {return betreuer;}
    public void setBetreuer(Mitarbeiter betreuer) {this.betreuer = betreuer;}

    @Override
    public String toString() {
        return "Kunde{" +
                "betreuer=" + betreuer +
                '}';
    }
}
