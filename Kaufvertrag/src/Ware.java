import java.util.List;

public class Ware {
    private String bezeichnung;
    private double preis;
    private List<String> besonderheiten;
    private List<String> maengel;
    public Ware(String bezeichnung,double preis,List<String> besonderheiten, List<String> maengel){
        this.bezeichnung=bezeichnung;
        this.preis=preis;
        this.besonderheiten=besonderheiten;
        this.maengel=maengel;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public double getPreis() {
        return preis;
    }

    public List<String> getBesonderheiten() {
        return besonderheiten;
    }

    public List<String> getMaengel() {
        return maengel;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public void setBesonderheiten(List<String> besonderheiten) {
        this.besonderheiten = besonderheiten;
    }

    public void setMaengel(List<String> maengel) {
        this.maengel = maengel;
    }

    @Override
    public String toString() {
        return "Ware{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", preis=" + preis +
                ", besonderheiten=" + besonderheiten +
                ", maengel=" + maengel +
                '}';
    }
}