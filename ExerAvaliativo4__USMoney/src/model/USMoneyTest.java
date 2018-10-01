package model;

import org.junit.Test;
import junit.framework.TestCase;

public class USMoneyTest extends TestCase{
	
	@Test
	public void testPlus() {
		int dollar = 100;
		int cents = 150;
		
		String expResult = "";
		String result = "";
		
		USMoney instance1 = new USMoney(dollar, cents);
		USMoney instance2 = new USMoney(dollar);
		USMoney instance3 = new USMoney();
		USMoney instance4 = new USMoney(0, 0);
		
		result = instance1.plus(instance1).toString();
		expResult = "U$ 203.00";
		assertEquals(expResult, result);
		result = instance1.plus(instance2).toString();
		expResult = "U$ 201.50";
		assertEquals(expResult, result);
		result = instance1.plus(instance3).toString();
		expResult = "U$ 101.50";
		assertEquals(expResult, result);
		result = instance2.plus(instance2).toString();
		expResult = "U$ 200.00";
		//Caso Problemático
		assertEquals(expResult, result);
		result = instance2.plus(instance3).toString();
		expResult = "U$ 100.00";
		//Caso problemático
		assertEquals(expResult, result);
		result = instance3.plus(instance2).toString();
		expResult = "U$ 100.00";
		//Caso problemático
		assertEquals(expResult, result);
		result = instance3.plus(instance3).toString();
		expResult = "U$ 0.00";
		assertEquals(expResult, result);
	}
}
