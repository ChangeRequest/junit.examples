package school.lemon.changerequest.java.junit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class JUnit4Example {
    @Test
    public void returnTrue() {
        Assert.assertTrue(new ClassUnderTest().returnTrue());
    }

    @Test
    public void returnFalse() {
        Assert.assertFalse(new ClassUnderTest().returnFalse());
    }

    @Ignore
    @Test
    public void someInvalidTest() {
        Assert.assertTrue(new ClassUnderTest().returnFalse());
    }

    @Ignore
    @Test(timeout = 10, expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionIn10Milliseconds() {
        // do something
    }
}
