/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w5.practicum.decoratorAndObserver;

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
public class PartTest {
	Part instance;
	public PartTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
		System.out.print("test bicycle decorator: ");
		instance = new Bicycle();
		
	}
	
	@After
	public void tearDown() {
	}
	
	@Test
	public void testRack() {
		System.out.println("Rack");
		instance = new Rack(instance);
		String expResult = "";
		assertEquals("fiets met bagagedrager", instance.toString());
	}
}
