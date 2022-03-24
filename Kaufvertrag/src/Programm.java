import java.io.*;

public class Programm {


    public static void main(String[] args) throws FileNotFoundException {
        Ware ware = new Ware("Laptop", 250.0);
        ware.setBezeichnung("Laptop");
        ware.getBesonderheiten().add("Tasche");
        ware.getMaengel().add("Razer-Maus");
        ware.getMaengel().add("Ladekabel fehlt");
        ware.getMaengel().add("Touchpad defekt");

        Vertragspartner kaeufer = new Vertragspartner("Yunus", "Ersoy");
        kaeufer.setAusweisNr("0123456789");
        kaeufer.setAdresse(new Adresse("Zu Hause", "3a", "28199", "Bremen"));

        Vertragspartner verkaeufer = new Vertragspartner("Joachim", "Bredull");
        verkaeufer.setAusweisNr("9876543210");
        verkaeufer.setAdresse(new Adresse("Auch zu Hause", "7", "28195", "Bremen"));

        Kaufvertrag vertrag = new Kaufvertrag(verkaeufer, kaeufer, ware);
        vertrag.setZahlungsModalitaeten("Privater Barverkauf");

        System.out.println(vertrag);

        String Datei = "H:/LF02/versuch1.txt";
        PrintWriter writer = new PrintWriter(Datei);
        writer.println(vertrag);
        writer.close();
    }
}



