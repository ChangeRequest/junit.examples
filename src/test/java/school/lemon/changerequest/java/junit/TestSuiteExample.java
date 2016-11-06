package school.lemon.changerequest.java.junit;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;

import java.util.Arrays;
import java.util.Collection;

@Ignore
@RunWith(Suite.class)
@Suite.SuiteClasses({FirstTest.class, SecondTest.class})
public class TestSuiteExample {
}

class FirstTest {
    // тесты
}

class SecondTest {
    // тесты
}

@Ignore
@RunWith(value = Parameterized.class)
class NumberTest {
    private int number;

    public NumberTest(int number) {
        this.number = number;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{1}, {2}, {3}, {4}};
        return Arrays.asList(data);
    }

    @Test
    public void pushTest() {
        System.out.println("Parameterized Number is : " + number);
    }
}
