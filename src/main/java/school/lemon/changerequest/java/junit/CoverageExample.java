package school.lemon.changerequest.java.junit;


import java.util.Random;

public class CoverageExample {
    public static final int RANDOM_BOUND = 200;
    private Random random;

    public CoverageExample(Random random) {
        this.random = random;
    }

    public int getRandomWithConditions(Condition condition) {
        if (condition == null) {
            throw new IllegalArgumentException("Condition should not be null");
        }
        switch (condition) {
            case GREATER_THAN_NULL:
                return random.nextInt(RANDOM_BOUND);
            case SMALLER_THAN_NULL:
                return -random.nextInt(RANDOM_BOUND);
            case NULL:
                return 0;
            default:
                throw new IllegalStateException("Uncovered enum value: " + condition);
        }
    }
}
