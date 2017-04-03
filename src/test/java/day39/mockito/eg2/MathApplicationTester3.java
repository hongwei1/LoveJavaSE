package day39.mockito.eg2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

import static org.mockito.Mockito.spy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

//TODO 7 Mockito provides option to create spy on real objects. When spy is called, then actual method of real object is called.
// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester3 {

    private MathApplication mathApplication;
    private CalculatorService calcService;

    @Before
    public void setUp() {
        mathApplication = new MathApplication();
        Calculator calculator = new Calculator();
        calcService = spy(calculator);
        mathApplication.setCalculatorService(calcService);
    }

    @Test
    public void testAdd() {

        //perform operation on real object
        //test the add functionality
        Assert.assertEquals(mathApplication.add(20.0, 10.0), 30.0, 0);

        
        // spy can call real object, also can call the mock object, both can work.
        //add the behavior to add numbers
        when(calcService.add(20.0,10.0)).thenReturn(40.0);

        //test the add functionality
        Assert.assertEquals(mathApplication.add(20.0, 10.0),40.0,0);

        //reset the mock	  
        reset(calcService);

        //test the add functionality after resetting the mock
        Assert.assertEquals(mathApplication.add(20.0, 10.0),30.0,0);
    }

    class Calculator implements CalculatorService {
        @Override
        public double add(double input1, double input2) {
            return input1 + input2;
        }

        @Override
        public double subtract(double input1, double input2) {
            throw new UnsupportedOperationException("Method not implemented yet!");
        }

        @Override
        public double multiply(double input1, double input2) {
            throw new UnsupportedOperationException("Method not implemented yet!");
        }

        @Override
        public double divide(double input1, double input2) {
            throw new UnsupportedOperationException("Method not implemented yet!");
        }
    }

    //TODO 8 BDD -- use given, when and then
//    Behavior Driven Development is a style of writing tests 
//    uses given, when and then format as test methods. 
//    Mockito provides special methods to do so. 
//    Take a look at the following code snippet.
    @Test
    public void testAddBDD(){

        //Given
        given(calcService.add(20.0,10.0)).willReturn(30.0);

        //when
        double result = calcService.add(20.0,10.0);

        //then
        Assert.assertEquals(result,30.0,0);

        verify(calcService, timeout(100).times(1)).add(20.0,30.0);
    }
}