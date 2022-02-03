package schritt4;

import schritt1.Spieler;
import schritt1.Trainer;
import schritt2.Torwart;

import java.util.ArrayList;

public class Mannschaft2 {
    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spielerliste;
    private int motivation;
    private int staerke;


    public Mannschaft2(String name, Trainer trainer, Torwart torwart, ArrayList<Spieler> spielerliste) {
        this.name = name;
        this.trainer = trainer;
        this.torwart = torwart;
        this.spielerliste = spielerliste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGesamtMotivation() {
        for (Spieler s : spielerliste) {
            motivation += s.getMotivation();
        }
        motivation += torwart.getMotivation();
        int gesamtMotivation = motivation / (spielerliste.size() + 1);
        return gesamtMotivation;
    }

    public int getGesamtStaerke() {
        for (Spieler s : spielerliste) {
            staerke += s.getStaerke();
        }
        staerke += torwart.getStaerke();
        int gesamtStaerke = staerke / (spielerliste.size() + 1);
        return gesamtStaerke;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Torwart getTorwart() {
        return torwart;
    }

    public void setTorwart(Torwart torwart) {
        this.torwart = torwart;
    }

    public ArrayList getSpielerliste() {
        return spielerliste;
    }

    public void setSpielerliste(ArrayList spielerliste) {
        this.spielerliste = spielerliste;
    }

    @Override
    public String toString() {
        return "Mannschaft: " + "\n" +
                "[Name]" + "\n" + name + "\n" +
                "[Trainer]" + trainer + '\n' +
                "[Torwart]" + torwart + '\n' +
                "[Spieler]" + "\n" + getSpielerliste() +
                "\n\n[Gesamt Motivation]" + "\n" + getGesamtMotivation() +
                "\n[Gesamt Stärke]" + "\n" + getGesamtStaerke();
    }
}
