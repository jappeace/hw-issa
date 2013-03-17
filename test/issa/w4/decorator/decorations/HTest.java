/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w4.decorator.decorations;

import issa.w4.decorator.concrete.Text;
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
public class HTest {
	
	public HTest() {
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
	 * Test of Print method, of class H.
	 */
	@Test
	public void testPrint() {
		System.out.println("Print heading");
		H instance = new H(new Text("testttt"), 3);
		String expResult = "<h3  >testttt</h3>";
		String result = instance.Print();
		assertEquals(expResult, result);
	}
}
