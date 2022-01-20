package schritt1;

import schritt2.Torwart;

public class Programm {
    public static void main(String[] args) {
    Trainer yunus= new Trainer("Yunus",18,1);
    Spieler yunusjr= new Spieler("Yunus jr",18,10,10,10,100);
    Torwart neuer= new Torwart("neuer",34,8,9,0,10);
        System.out.println(yunus);
        System.out.println(yunusjr);
        System.out.println(neuer);
    }
}
