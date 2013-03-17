/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jappie
 */
public class ChocolateBoilerTest {
	
	public ChocolateBoilerTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}


	/**
	 * Test of getInstance method, of class ChocolateBoiler.
	 */
	@Test
	public void testGetInstance() {
		System.out.println("getInstance");
		ChocolateBoiler expResult = ChocolateBoiler.getInstance();
		ChocolateBoiler result = ChocolateBoiler.getInstance();
		assertEquals(expResult, result);
	}

}
