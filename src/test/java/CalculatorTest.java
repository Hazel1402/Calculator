import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class CalculatorTest {

	Operations test = new Operations();
	
	@Test
	public void testaddition()
	{
		float result = Operations.addition(10, 10);
		Assertions.assertEquals(20,result);
	}
	
	@Test
	public void testsubtraction()
	{
		float result = Operations.subtraction(12, 10);
		Assertions.assertEquals(2,result);
	}

	@Test
	public void testmultiplication()
	{
		float result = Operations.multiplication(10, 10);
		Assertions.assertEquals(100,result);
	}
	
	@Test
	public void testdivision()
	{
		float result = Operations.division(3, 2);
		Assertions.assertEquals(1.5,result);
	}
}

