package schritt4;

import schritt1.Spieler;
import schritt1.Trainer;
import schritt2.Torwart;

import java.util.ArrayList;

public class Mannschaft {
    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spielerliste;


    public Mannschaft(String name, Trainer trainer, Torwart torwart,ArrayList<Spieler> spielerliste){
        this.name =name;
        this.spielerliste=spielerliste;
        this.trainer=trainer;
        this.torwart=torwart;
    }
    //get
    public String getName() {return name;}
    public Trainer getTrainer() {return trainer;}
    public Torwart getTorwart() {return torwart;}
    public ArrayList<Spieler> getSpielerliste() {return spielerliste;}


    //set
    public void setName(String name) {this.name = name;}
    public void setTrainer(Trainer trainer) {this.trainer = trainer;}
    public void setTorwart(Torwart torwart) {this.torwart = torwart;}
    public void setSpielerliste(ArrayList<Spieler> spielerliste) {this.spielerliste = spielerliste;}

    //arrays
    public double getMotivation() {
        int motivationSumme = 0;
        int motivationdurchschnitt = 0;
        for (int i = 0;i <spielerliste.size(); i++) {
            motivationdurchschnitt += spielerliste.get(i).getMotivation();}
            motivationSumme = motivationdurchschnitt / spielerliste.size();
            return motivationdurchschnitt;
    }
    public double getstärke(){
        int motivationSumme= 0;
        int motivationdurchschnitt= 0;
        for (int i = 0;i < spielerliste.size();i++){
            motivationdurchschnitt += spielerliste.get(i).getStärke();
        }
        motivationSumme = motivationdurchschnitt / spielerliste.size();
        return motivationSumme;
    }
    public String toString() {
        String mannschaft = " ";
        mannschaft += "\nName: " + getName();
        mannschaft += "\nTrainer: " + getTrainer();
        mannschaft += "\nTorwart: " + getTorwart();

        mannschaft += "\nSpieler: " ;
        for (int i=0; i<spielerliste.size();i++){
            mannschaft +="\n"+ spielerliste.get(i).toString();
        }
        mannschaft += "\nMotivation: "+ getMotivation();
        mannschaft += "\nStärke: "+ getstärke();

        return mannschaft;
    }
}

