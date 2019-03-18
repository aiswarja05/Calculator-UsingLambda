package CalculationUsingLAMBDA.Lambda_cal;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;


public class TestingLambda {

	@Test
	public void test() {
		Calculation add = (a,b)-> {
    		int c=a+b;
    		return c;
    		
    	};
    	int result=add.cal(10,5);
    	assertTrue(result==15);
    	
    	Calculation substraction = (a,b)-> {
    		int d=a-b;
			return d;
    	};
    	result=substraction.cal(10,5);
    	assertTrue(result==5);
    	
    	Calculation multiplication = (a,b)-> {
    		int e=a*b;
    		return e;
    	};
    	result=multiplication.cal(10,5);
    	assertTrue(result==50);
    	
    	try {
    	Calculation division = (a,b)-> {
    		int f=a/b;
    		return f;
    	};

    	result=division.cal(10,0);   //Divided by zero(Exception handling)
    	
    	
    	result=division.cal(10,5);
    	assertTrue(result==2);
    	
    	}
    	catch(ArithmeticException e)
    	{
    		assertThat(e.getMessage(), containsString("/ by zero"));
    		assertThat(e, instanceOf(ArithmeticException.class));
    	}
	}

}
