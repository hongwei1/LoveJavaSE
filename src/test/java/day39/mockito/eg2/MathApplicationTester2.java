package day39.mockito.eg2;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester2 {

    private MathApplication mathApplication;
    private CalculatorService calcService;

    @Before
    public void setUp(){
        //TODO 4 different way to mock object
        mathApplication = new MathApplication();
        calcService = mock(CalculatorService.class);
        mathApplication.setCalculatorService(calcService);
    }

    @Test
    public void testAddAndSubtract(){

        //add the behavior to add numbers
        when(calcService.add(20.0,10.0)).thenReturn(30.0);

        //subtract the behavior to subtract numbers
        when(calcService.subtract(20.0,10.0)).thenReturn(10.0);

        //test the subtract functionality
        Assert.assertEquals(mathApplication.subtract(20.0, 10.0),10.0,0);

        //test the add functionality
        Assert.assertEquals(mathApplication.add(20.0, 10.0),30.0,0);

        //verify call to calcService is made or not
        verify(calcService).add(20.0,10.0);
        verify(calcService).subtract(20.0,10.0);

        //TODO 5 InOrder is not working now 
        //create an inOrder verifier for a single mock
//        InOrder inOrder = InOrder(calcService);
//        following will make sure that add is first called then subtract is called.
//        inOrder.verify(calcService).subtract(20.0,10.0);
//        inOrder.verify(calcService).add(20.0,10.0);
    }

    //TODO 6 Mockito provides a Answer interface which allows stubbing with generic interface.
    @Test
    public void testAdd() {

        //add the behavior to add numbers
        when(calcService.add(20.0, 10.0)).thenAnswer(new Answer<Double>() {

            @Override
            public Double answer(InvocationOnMock invocation) throws Throwable {
                //get the arguments passed to mock
                Object[] args = invocation.getArguments();

                //get the mock 
                Object mock = invocation.getMock();

                //return the result
                return 30.0;
            }
        });

        //test the add functionality
        Assert.assertEquals(mathApplication.add(20.0, 10.0), 30.0, 0);
    }
}