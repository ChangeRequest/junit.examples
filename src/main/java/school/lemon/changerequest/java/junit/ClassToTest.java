package school.lemon.changerequest.java.junit;

import java.util.Random;

public class ClassToTest {
    private final DependencyClass f;

    public ClassToTest(DependencyClass f) {
        this.f = f;
    }

    public boolean doSomething() {
        return f.doStuff() > someVeryLongOperation();
    }

    public int someVeryLongOperation() {
        try {
            Thread.sleep(100000L);
            return new Random().nextInt();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
