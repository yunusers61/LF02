package schritt1;

public class Spieler {
    private String name;
    private int alter;
    private int stärke;
    private int torschuss;
    private int motivation;
    private int tore;
    private int trickonummer;

    public Spieler(String name,int alter, int stärke, int torschuss, int motivation, int tore, int trickonummer) {
        this.name = name;
        this.alter = alter;
        this.stärke = stärke;
        this.torschuss = torschuss;
        this.motivation = motivation;
        this.tore = tore;
        this.trickonummer= trickonummer;
    }

    //get
    public String getName() {return name;}

    public int getAlter() {
        return alter;
    }

    public int getStärke() {
        return stärke;
    }

    public int getTorschuss() {return torschuss;}

    public int getMotivation() {
        return motivation;
    }

    public int getTore() {
        return tore;
    }

    public int getTrickonummer() { return  trickonummer; }

    //Set
    public void setName(String name) {
        this.name = name;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setStärke(int stärke) {
        this.stärke = stärke;
    }

    public void setTorschuss(int torschuss) {
        this.torschuss = torschuss;
    }

    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }

    public void setTore(int tore) {
        this.tore = tore;
    }

    public void setTrickonummer(int trickonummer) {this.trickonummer = trickonummer;}

    @Override
    public String toString() {
        String spieler = " ";
        spieler += "\nName: " + name;
        spieler += "\nAlter: " + alter;
        spieler += "\nStärke: " + stärke;
        spieler += "\nTorschuss: " + torschuss;
        spieler += "\nMotivation: " + motivation;
        spieler += "\nTore: " + tore;
        spieler += "\nTrickonummer: " + trickonummer;
        return spieler;
    }
}
