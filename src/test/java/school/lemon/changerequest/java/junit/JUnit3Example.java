package school.lemon.changerequest.java.junit;

import junit.framework.TestCase;

/**
 * Created by User on 03.11.2016.
 */
public class JUnit3Example extends TestCase {
    public void testReturnTrue() {
        assertTrue(new ClassUnderTest().returnTrue());
    }

    public void testReturnFalse() {
        assertFalse(new ClassUnderTest().returnFalse());
    }

    public void notValidName() {
        assertEquals(false, new ClassUnderTest().returnFalse());
    }
}

