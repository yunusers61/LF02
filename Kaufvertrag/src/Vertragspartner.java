public class Vertragspartner {
    private String vorname;
    private String nachname;
    private String ausweisNr;
    private Adresse adresse;

    public Vertragspartner(String vorname, String nachname, String ausweisNr, String Adresse) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.ausweisNr = ausweisNr;
        this.adresse = adresse;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getAusweisNr() {
        return ausweisNr;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setAusweisNr(String ausweisNr) {
        this.ausweisNr = ausweisNr;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Vertragspartner{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", ausweisNr='" + ausweisNr + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
