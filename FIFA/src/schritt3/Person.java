package schritt3;

public class Person {
    private String name;
    private int alter;

    public Person(String name, int alter){
        this.name= name;
        this.alter= alter;
    }
    //get
    public String getName() {return name;}
    public int getAlter() {
        return alter;
    }
    //set
    public void setName(String name) {
        this.name = name;
    }
    public void setAlter(int alter) {
        this.alter = alter;
    }

    @Override
    public String toString() {
        String person = super.toString();
        person += "\nName: " + name;
        person += "\nAlter: " + alter;
        return person;
    }
}




