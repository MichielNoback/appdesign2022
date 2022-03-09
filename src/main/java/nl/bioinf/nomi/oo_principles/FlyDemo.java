package nl.bioinf.nomi.oo_principles;

import java.util.ArrayList;
import java.util.List;

public class FlyDemo {
    public static void main(String[] args) {
        List<Flyable> fliers = new ArrayList<>();
        fliers.add(new Bird());
        fliers.add(new Plane());
        fliers.add(new Flyable() {
            @Override
            public void fly() {
                System.out.println("UFO!");
            }
        });

        for( Flyable flyable : fliers) {
            System.out.println(flyable.getClass().getSimpleName());
            if (flyable instanceof Bird){
                Bird b = (Bird) flyable;
                b.eatForBreakfast();
                b.reportStatus();

                //String conservationStatus = b.conservationStatus;

            }
            flyable.fly();
        }
    }
}
