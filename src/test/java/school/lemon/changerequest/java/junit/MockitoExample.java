package school.lemon.changerequest.java.junit;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Random;

@RunWith(MockitoJUnitRunner.class)
public class MockitoExample {
    @Mock DependencyClass f;
    @Spy @InjectMocks ClassToTest t;
    @Test
    public void testDoSomethingReturnsFalse() {
        Mockito.when(f.doStuff()).thenReturn(10);
        Mockito.doReturn(20).when(t).someVeryLongOperation();
        Assert.assertFalse(t.doSomething());
    }
    @Test
    public void testDoSomethingReturnsTrue() {
        Mockito.when(f.doStuff()).thenReturn(35);
        Mockito.doReturn(20).when(t).someVeryLongOperation();
        Assert.assertTrue(t.doSomething());
        Mockito.verify(f, Mockito.times(1)).doStuff();
    }
}

