package domain;

public class Lizard extends Predator {

    private String kind;

    public Lizard(String name, int weight, String kind) {
        this.name=name;
        this.weight=weight;
        this.kind=kind;
    }

    public Lizard() {
        this("Scaly",1,"just a lizard");
    }

    public Lizard(String name) {
        this(name,1,"just a lizard");
    }
        

    public void recommendedTemp() {
        System.out.println("lizard recommended temperatur is 28-30°C...");
    }

    @Override
    public void hunt() {
        System.out.println("lizard hunting for a insect...");
    }

    @Override
    public String toString() {
        return super.toString()+"\nKind:\t"+this.kind+"\n\nThis is lizard!";
    }

    @Override
    public void eat() {
        System.out.println("lizard eats insect...");
    }
    
    
}
