package school.lemon.changerequest.java.junit;

import java.util.Random;

public class DependencyClass {
    public int doStuff() {
        return new Random().nextInt();
    }
}
