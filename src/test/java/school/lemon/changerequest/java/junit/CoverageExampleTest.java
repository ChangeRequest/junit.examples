package school.lemon.changerequest.java.junit;

import org.hamcrest.CustomTypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Random;

@RunWith(MockitoJUnitRunner.class)
public class CoverageExampleTest {
    @Spy
    Random random;
    @InjectMocks
    CoverageExample coverageExample;

    @Test
    public void getRandomWithConditionsShouldReturnPositiveIntegerSmallerThanRandomBound() {
        Assert.assertThat(coverageExample.getRandomWithConditions(Condition.GREATER_THAN_NULL),
                new CustomTypeSafeMatcher<Integer>("PositiveIntegerWithBound") {
                    @Override
                    protected boolean matchesSafely(Integer item) {
                        return item != null && item < CoverageExample.RANDOM_BOUND && item >= 0;
                    }
                });
    }

    @Test
    public void getRandomWithConditionsShouldReturnNegativeIntegerBiggerThanNegativeRandomBound() {
        int result = coverageExample.getRandomWithConditions(Condition.SMALLER_THAN_NULL);
        Assert.assertTrue(result > -CoverageExample.RANDOM_BOUND && result <= 0);
    }

    @Test
    public void getRandomWithConditionsShouldReturnZero() {
        Assert.assertEquals(0, coverageExample.getRandomWithConditions(Condition.NULL));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getRandomWithConditionsShouldThrowIllegalArgumentExceptionForNullParameter() {
        coverageExample.getRandomWithConditions(null);
    }

    @Test
    public void getRandomWithConditionsShouldThrowIllegalArgumentExceptionForNullParameter2() {
        try {
            coverageExample.getRandomWithConditions(null);
            Assert.fail("Expecting IllegalArgumentException.");
        } catch (IllegalArgumentException e) {
            Assert.assertThat(e, new IsInstanceOf(IllegalArgumentException.class));
            Assert.assertEquals("Condition should not be null", e.getMessage());
        }
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test()
    public void getRandomWithConditionsShouldThrowIllegalArgumentExceptionForNullParameter3() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Condition should not be null");
        coverageExample.getRandomWithConditions(null);
    }

}
