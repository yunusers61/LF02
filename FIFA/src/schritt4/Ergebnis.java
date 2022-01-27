package schritt4;

public class Ergebnis {
    private int Torheim;
    private int Torgast;

    public Ergebnis(int Torheim, int Torgast) {
        this.Torheim = Torheim;
        this.Torgast = Torgast;

    }
    //get

    public int getTorheim() {
        return Torheim;
    }

    public int getTorgast() {
        return Torgast;
    }

    //set
    public void setTorheim(int torheim) {
        Torheim = torheim;
    }

    public void setTorgast(int torgast) {
        Torgast = torgast;
    }

    //add
    public void addTorheim(int torheim) {
        this.Torheim = Torheim;
    }
}
