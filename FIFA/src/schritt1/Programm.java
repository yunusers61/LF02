package schritt1;

import schritt2.Torwart;
import schritt4.Ergebnis;
import schritt4.Mannschaft2;
import schritt4.Mannschaft1;
import schritt4.Spiel;
import schritt5.Gameplay;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {
    Trainer yunus= new Trainer("Yunus",18,10);
    Spieler Nikica=new Spieler("Nikica",17,10,10,10,100);
    Spieler Atilla=new Spieler("Atilla",16,10,10,10,100);
    Spieler Neco=new Spieler("Neco",50,10,10,10,100);
    Spieler yunusjr= new Spieler("Yunus jr",18,10,10,10,100000);
    Spieler Umut= new Spieler("umut",19,10,10,10,1);
    Spieler YeChan= new Spieler("Yechan",22,10,10,10,101);
    Spieler Yunusjrmessi = new Spieler("messi",34,10,10,10,999);
    Spieler ronaldojr = new Spieler("ronaldojr",10,10,10,10,0);
    Spieler vandijk = new Spieler("vandijk",30,10,10,10,10);
    Spieler Iniesta = new Spieler("iniesta",55,10,10,10,100);
    Torwart neuer= new Torwart("neuer",11,10,10,10);


    Trainer zidane= new Trainer("Zidane",40,1);
    Spieler penaldo= new Spieler("Penaldo",35,8,0,2,0);
    Spieler benzema= new Spieler("Benzema",35,1,0,2,2);
    Spieler bale= new Spieler("Bale",32,2,1,1,0);
    Spieler casemiro= new Spieler("Casemiro",1,1,1,1,1);
    Spieler modric= new Spieler("Modric",38,3,3,7,1);
    Spieler marcelo= new Spieler("Marcelo",1,1,1,1,1);
    Spieler ramos= new Spieler("Ramos",36,6,0,0,0);
    Spieler pepe= new Spieler("Pepe",36,0,0,0,0);
    Spieler carvalho= new Spieler("carvalho",0,0,0,0,0);
    Spieler dimaria=new Spieler("Di Maria",36,3,0,0,0);
    Spieler kaka=new Spieler("kaka",42,1,0,0,0);
    Torwart casillas=new Torwart("casillas",45,10,10,7);

        //Heimmannschaft yunuscelona
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

        //Gastmannschaft noobmadrid
        ArrayList<Spieler> noobmadrid = new ArrayList<>();
        noobmadrid.add(penaldo);
        noobmadrid.add(benzema);
        noobmadrid.add(bale);
        noobmadrid.add(casemiro);
        noobmadrid.add(modric);
        noobmadrid.add(marcelo);
        noobmadrid.add(ramos);
        noobmadrid.add(pepe);
        noobmadrid.add(carvalho);
        noobmadrid.add(dimaria);
        noobmadrid.add(kaka);
        noobmadrid.add(casillas);


        Mannschaft1 yunuscelonaa= new Mannschaft1("yunuscelona",yunus,neuer,yunuscelona);
        System.out.println(yunuscelonaa);

        Mannschaft2 realnoobmadrid= new Mannschaft2("real noobmadrid",yunus,neuer,noobmadrid);
        System.out.println(noobmadrid);

        System.out.print(yunuscelona);
        System.out.print(realnoobmadrid);

    }
}
