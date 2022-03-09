package nl.bioinf.nomi.oo_principles;

public class Bird implements Flyable {
    private String conservationStatus;


    public void reportStatus() {
        System.out.println("my status is " + this.conservationStatus);
    }

    public void reportOtherBird(Bird other) {
        String cs = other.conservationStatus;
    }


    @Override
    public void fly() {
        System.out.println("Using wings to fly");
    }

    void eatForBreakfast() {
        System.out.println("Yummie");
    }
}
