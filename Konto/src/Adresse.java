public class Adresse {
    private String strasse;
    private String hausNr;
    private String plz;
    private String ort;

    public Adresse(String strasse, String hausNr,String plz, String ort){
        this.strasse=strasse;
        this.hausNr=hausNr;
        this.plz=plz;
        this.ort=ort;
    }
    //Get-set
    public String getHausNr() {return hausNr;}
    public void setHausNr(String hausNr) {this.hausNr = hausNr;}
    //Get-set
    public String getStrasse() {return strasse;}
    public void setStrasse(String strasse) {this.strasse = strasse;}
    //Get-set
    public String getPlz() {return plz;}
    public void setPlz(String plz) {this.plz = plz;}
    //Get-set
    public String getOrt() {return ort;}
    public void setOrt(String ort) {this.ort = ort;}

    @Override
    public String toString() {
        return "Adresse{" +
                "strasse='" + strasse + '\'' +
                ", hausNr='" + hausNr + '\'' +
                ", plz='" + plz + '\'' +
                ", ort='" + ort + '\'' +
                '}';
    }
}
