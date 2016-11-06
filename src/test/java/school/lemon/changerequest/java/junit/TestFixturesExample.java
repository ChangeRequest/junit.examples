package school.lemon.changerequest.java.junit;

import org.junit.*;

/**
 * Created by User on 03.11.2016.
 */
public class TestFixturesExample {
    @BeforeClass
    public static void setupClass() {
        System.out.println("BeforeClass");
    }

    @Before
    public void setup() {
        System.out.println("Before");
    }

    @After
    public void tearDown() {
        System.out.println("After");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("AfterClass");
    }

    @Test
    public void firstTest() {
        System.out.println("FirstTest");
    }

    @Test
    public void secondTest() {
        System.out.println("SecondTest");
    }
}
