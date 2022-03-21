

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class txt {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hallo World");

        String datei = "H:/LF02/Txt.txt";
        PrintWriter writer = new PrintWriter(datei);

        writer.println("Moin,moin!");
        writer.close();
    }
}

