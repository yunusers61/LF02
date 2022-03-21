public class Konto {
    private Kunde inhaber;
    private double kontostand;
    private double kreditLimit;
    private double zinsGuthaben;

    public Konto(Kunde inhaber, double kontostand, double kreditLimit,double zinsGuthaben){
        this.inhaber=inhaber;
        this.kontostand=kontostand;
        this.kreditLimit=kreditLimit;
        this.zinsGuthaben=zinsGuthaben;
    }
    //Get-Set
    public Kunde getInhaber() {return inhaber;}
    public void setInhaber(Kunde inhaber) {this.inhaber = inhaber;}
    //Get-Set
    public double getKontostand() {return kontostand;}
    public void setKontostand(double kontostand) {this.kontostand = kontostand;}
    //Get-Set
    public double getKreditLimit() {return kreditLimit;}
    public void setKreditLimit(double kreditLimit) {this.kreditLimit = kreditLimit;}
    //Get-Set
    public double getZinsGuthaben() {return zinsGuthaben;}
    public void setZinsGuthaben(double zinsGuthaben) {this.zinsGuthaben = zinsGuthaben;}

    public void einzahlen(double betrag){
        this.kontostand += betrag;}
    public boolean auszahlen(double betrag) {
        if (kontostand + kreditLimit >= betrag) {
            kontostand = kontostand - betrag;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Konto{" +
                "inhaber=" + inhaber +
                ", kontostand=" + kontostand +
                ", kreditLimit=" + kreditLimit +
                ", zinsGuthaben=" + zinsGuthaben +
                '}';
    }
}
