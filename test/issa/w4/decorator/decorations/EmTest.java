/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w4.decorator.decorations;

import issa.w4.decorator.concrete.NoBreakingSpace;
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
public class EmTest {
	
	public EmTest() {
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
	 * Test of Print method, of class Em.
	 */
	@Test
	public void testPrintnbsp() {
		System.out.println("em Print no breaking space");
		Em instance = new Em(new NoBreakingSpace());
		String expResult = "<em  >&nbsp;</em>";
		String result = instance.Print();
		assertEquals(expResult, result);
	}
	/**
	 * Test of Print method, of class Em.
	 */
	@Test
	public void testPrintnbspId() {
		System.out.println("em Print no breaking space id");
		Em instance = new Em(new NoBreakingSpace());
		instance.setId("test");
		String expResult = "<em id='test' >&nbsp;</em>";
		String result = instance.Print();
		assertEquals(expResult, result);
	}
	/**
	 * Test of Print method, of class Em.
	 */
	@Test
	public void testPrintnbspClass() {
		System.out.println("em Print no breaking space class");
		Em instance = new Em(new NoBreakingSpace());
		instance.setClas("test");
		String expResult = "<em  class='test'>&nbsp;</em>";
		String result = instance.Print();
		assertEquals(expResult, result);
	}
	/**
	 * Test of Print method, of class Em.
	 */
	@Test
	public void testPrinttxt() {
		System.out.println("em Print txt");
		Em instance = new Em(new Text("text jajalalla"));
		String expResult = "<em  >text jajalalla</em>";
		String result = instance.Print();
		assertEquals(expResult, result);
	}
}
