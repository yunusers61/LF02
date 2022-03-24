import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
public class CSV {
    public static void main(String[] args) throws FileNotFoundException {
        String datei = "H:/LF02/versuch1.csv";
        BufferedReader br = new BufferedReader(new FileReader(datei));
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
        System.out.println(verkaeufer);
        System.out.println(ware);
        System.out.println(kaeufer);
        PrintWriter writer = new PrintWriter(datei);
    }
}