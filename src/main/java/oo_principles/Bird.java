package oo_principles;

public class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Using wings to fly");
    }

    void eatForBreakfast() {
        System.out.println("Yummie");
    }
}
