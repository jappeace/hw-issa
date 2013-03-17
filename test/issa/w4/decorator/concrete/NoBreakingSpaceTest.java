/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w4.decorator.concrete;

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
public class NoBreakingSpaceTest {
	
	public NoBreakingSpaceTest() {
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
	 * Test of Print method, of class NoBreakingSpace.
	 */
	@Test
	public void testPrint() {
		System.out.println("Print no breaking space test");
		NoBreakingSpace instance = new NoBreakingSpace();
		String expResult = "&nbsp;";
		String result = instance.Print();
		assertEquals(expResult, result);
	}
}
