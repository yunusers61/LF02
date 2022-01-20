package schritt1;

public class Trainer {
    private String name;
    private int alter;
    private int erfahrung;

    public Trainer(String name, int alter, int erfahrung) {
        this.name = name;
        this.alter= alter;
        this.erfahrung=erfahrung;
    }
    public String getName(){
        return name;
    }
    public int getAlter() {
        return alter;
    }

    public int getErfahrung() {return erfahrung;}

    public void setName(String name) {
        this.name = name;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setErfahrung(int erfahrung) {
        this.erfahrung= erfahrung;
    }

    @Override
    public String toString() {
        String trainer = " ";
        trainer += "\nName: " + name;
        trainer += "\nAlter: " + alter;
        trainer += "\nErfahrung: " + erfahrung;
        return trainer;
    }
}