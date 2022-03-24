import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Kaufvertrag {
    private Vertragspartner verkaufer;
    private Vertragspartner kaeufer;
    private Ware ware;
    private String zahlungsModalitaeten;

    public Kaufvertrag(Vertragspartner verkaufer,Vertragspartner kaeufer,Ware ware, String zahlungsModalitaeten) throws FileNotFoundException {
        this.verkaufer=verkaufer;
        this.kaeufer=kaeufer;
        this.ware=ware;
        this.zahlungsModalitaeten=zahlungsModalitaeten;
    }

    public Kaufvertrag(Vertragspartner verkaeufer, Vertragspartner kaeufer, Ware ware) {
    }

    public Vertragspartner getVerkaufer() {
        return verkaufer;
    }

    public void setVerkaufer(Vertragspartner verkaufer) {
        this.verkaufer = verkaufer;
    }

    public Vertragspartner getKaeufer() {
        return kaeufer;
    }

    public void setKaeufer(Vertragspartner aeufer) {
        this.kaeufer = kaeufer;
    }

    public Ware getWare() {
        return ware;
    }

    public void setWare(Ware ware) {
        this.ware = ware;
    }

    public String getZahlungsModalitaeten(){
        return zahlungsModalitaeten;
    }

    public void setZahlungsModalitaeten(String zahlungsModalitaeten) {
        this.zahlungsModalitaeten = zahlungsModalitaeten;
    }

    @Override
    public String toString() {
        return "Kaufvertrag{" +
                "verkaufer=" + verkaufer +
                ", kaeufer=" + kaeufer +
                ", ware=" + ware +
                ", zahlungsModalitaeten='" + zahlungsModalitaeten + '\'' +
                '}';
    }
}
