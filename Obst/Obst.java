/**
 * Klasse obstMA21.Obst, die also Oberklasse/Superklasse der Klassen
 * obstMA21.Apfel, obstMA21.Banane, Weintrauben dienen soll.
 *
 * Wurde als ABSTRAKTE KLASSE deklariert, weil sie nur für
 * die Vererbung dienen soll. Objekte/Instanzen hingegen
 * sollen von dieser Klasse nicht erstellt werden können.
 */
public abstract class Obst {

    /**
     * nicht-öffentliche, d. h. private Klassenattribute
     * a) Klassenattribute: in allen Methoden der Klasse verwendbare Attribute
     * b) nicht-öffentlich: wegen des Zugriffsmodifizierers private,
     * somit nicht von außerhalb der Klasse lesbar oder veränderbar
     */
    private String name;
    private String farbe;
    private double gewicht;
    private boolean reif;

    /**
     * Konstruktor der Klasse
     * a) Ist eine Methode der Klasse, aber eine besondere Methode.
     * b) Wird außerhalb der Klasse benötigt, um Instanzen/Objekte der Klasse
     * zu erstellen.
     * c) Bestimmt, für welche Attribute die Instanzen/Objekte der Klasse
     * einen Wert erhalten müssen:
     * c1) Die entsprechenden Attribute sind in als Parameter in der Klammer
     * deklariert und werden innerhalb der Konstruktormethode an die
     * Klassenattribute (erkennbar am this.) weitergereicht.
     * d) Der Konstruktor muss exakt so heißen wie die Klasse selbst.
     * e) Ein Konstruktor hat KEINEN Rückgabetyp (KEIN void, int, String, double, boolean etc.)!
     */
    public Obst(String name) {
        this.name = name;
    }

    /**
     * öffentliche Methode, die das Klassenattribut name zurückgibt/liefert
     * a) öffentlich wegen public
     * b) Datentyp der Methode muss dem Datentyp des Attributs entsprechen,
     * das zurückgegeben wird (hier: String --> Wenn diese Methode
     * aufgerufen wird, liefert sie einen String zurück)
     * c) Ist dazu da, um von außerhalb der Klasse den Wert des
     * Klassenattributs name lesen/auslesen zu können.
     * d) Da die Methode den Wert eines Klassenattributs zurückgibt,
     * ist sie ein sogenannter GETTER
     * e) An die Methode werden keine Parameter übergeben. Die Klammer
     * ist aber trotzdem notwendig, damit erkennbar ist, dass es sich
     * hier um eine Methode handelt.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    public double getGewicht() {
        return gewicht;
    }

    public String getFarbe() {
        return farbe;
    }

    public boolean isReif() {
        return reif;
    }

    /**
     * öffentliche Methode, mit der das Klassenattribut gewicht
     * überschrieben, also geändert werden kann
     * a) Datentyp der Methode = void = sogenannter "leerer" Datentyp
     * (Die Methode gibt keine Daten zurück!)
     * b) Ist dazu da, um von außerhalb der Klasse den Wert des
     * Klassenattributs gewicht überschreiben, also verändern, sprich
     * neu setzen zu können.
     * c) Da die Methode den Wert eines Klassenattributs neu setzt
     * ist sie ein sogenannter SETTER.
     * d) Bei Aufruf der Methode muss in Klammern ein Wert mitgegeben werden,
     * der zunächst in der lokalen Variable gewicht gespeichert und
     * dann an das Klassenattribut (erkennbar am this.) gewicht
     * weitergereicht wird.
     */
    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public void setReif(boolean reif) {
        this.reif = reif;
    }

    @Override
    public String toString() {
        String text = "Name = " + name;
        text += "\n\tFarbe = " + farbe;
        text += "\n\tGewicht = " + gewicht;
        text += "\n\treif = " + reif;

        return text;
    }

}
