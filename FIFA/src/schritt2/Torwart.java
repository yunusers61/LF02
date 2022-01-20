package schritt2;

import schritt1.Spieler;

public class Torwart extends Spieler {
    private int reaktion;

    public Torwart(String name, int alter, int stärke, int motivation, int tore, int reaktion) {
        super(name, alter, stärke, 0 , motivation, 0 , 1);
        this.reaktion= reaktion;
    }

    public int getReaktion() {
        return reaktion;
    }

    public void setReaktion(int reaktion) {
        this.reaktion = reaktion;
    }

    @Override
    public String toString() {
        String torwart = super.toString();
        torwart += "\nreaktion: " + reaktion;
        return torwart;
    }
}
