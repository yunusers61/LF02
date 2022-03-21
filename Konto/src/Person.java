public class Person {
    private String Name;
    private String Nachname;
    private Adresse Adresse;

    public Person(String Name,String Nachname){
        this.Adresse=Adresse;
        this.Nachname=Nachname;
        this.Name=Name;
    }
    //Get-Set
    public String getName() {return Name;}
    public void setName(String name) {Name = name;}
    //Get-Set
    public String getNachname() {return Nachname;}
    public void setNachname(String nachname) {Nachname = nachname;}
    //Get-Set
    public Adresse getAdresse() {return Adresse;}
    public void setAdresse(Adresse adresse) {Adresse = adresse;}

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Nachname='" + Nachname + '\'' +
                ", Adresse=" + Adresse +
                '}';
    }
}
