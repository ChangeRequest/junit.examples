package school.lemon.changerequest.java.junit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RulesExample {
    @Rule
    public TestName testName = new TestName();

    @Test
    public void testSomething() {
        System.out.println("Name of this test is: " + testName.getMethodName());
    }
}

class MyTestRunner {
    public static void main(String[] args) {
        Result result =
                JUnitCore.runClasses(RulesExample.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
}
