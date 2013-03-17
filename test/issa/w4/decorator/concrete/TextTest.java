/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w4.decorator.concrete;

import issa.w4.decorator.decorations.Em;
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
public class TextTest {
	
	public TextTest() {
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
	 * Test of Print method, of class Text.
	 */
	@Test
	public void testPrint() {
		System.out.println("Print text test");
		Text instance = new Text("test text blah");
		String expResult = "test text blah";
		String result = instance.Print();
		assertEquals(expResult, result);
	}
}
