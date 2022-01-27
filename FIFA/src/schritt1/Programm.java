package schritt1;

import schritt2.Torwart;
import schritt4.Mannschaft;

import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {
    Trainer yunus= new Trainer("Yunus",18,10);
    Spieler Nikica=new Spieler("Nikica",17,10,10,10,100,2);
    Spieler Atilla=new Spieler("Atilla",16,10,10,10,100,15);
    Spieler Neco=new Spieler("Neco",50,10,10,10,100,61);
    Spieler yunusjr= new Spieler("Yunus jr",18,10,10,10,100000,10);
    Spieler Umut= new Spieler("umut",19,10,10,10,1,62);
    Spieler YeChan= new Spieler("Yechan",22,10,10,10,101,14);
    Spieler Yunusjrmessi = new Spieler("messi",34,10,10,01,999,99);
    Spieler ronaldojr = new Spieler("ronaldojr",10,10,10,10,0,66);
    Spieler vandijk = new Spieler("vandijk",30,10,10,10,10,81);
    Spieler Iniesta = new Spieler("iniesta",55,10,10,10,100,8);
    Torwart neuer= new Torwart("neuer",11,10,10,10,10);

        ArrayList<Spieler> yunuscelona = new ArrayList<>();
        yunuscelona.add(Nikica);
        yunuscelona.add(Atilla);
        yunuscelona.add(Neco);
        yunuscelona.add(yunusjr);
        yunuscelona.add(neuer);
        yunuscelona.add(Umut);
        yunuscelona.add(YeChan);
        yunuscelona.add(Yunusjrmessi);
        yunuscelona.add(ronaldojr);
        yunuscelona.add(vandijk);
        yunuscelona.add(Iniesta);

        Mannschaft yunuscelonaa= new Mannschaft("yunuscelona",yunus,neuer,yunuscelona);
        System.out.println(yunuscelonaa);

    }
}
