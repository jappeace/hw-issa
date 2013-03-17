/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w6.Chain_of_Responsibility;

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
public class LogTest {
	Log instance;
	FilterFactory factory = new FilterFactory();
	public LogTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
		 System.out.print("log ");
		 instance = new Log();	
		 instance.add(factory.smallFilter());
		 instance.add(factory.largeFilter());
		 instance.add(factory.mediumFilter());
		 instance.add(factory.smallFilter());
		 instance.add(factory.largeFilter());
	}
	
	@After
	public void tearDown() {
	}

	/**
	 * Test of write method, of class Log.
	 */
	@Test
	public void testWrite() {
		System.out.println("write test");
		assertEquals("/small filter/small filter", instance.write(5));
		assertEquals("/small filter/large filter/medium filter/small filter/large filter", instance.write(20));
		assertEquals("/small filter/medium filter/small filter", instance.write(10));
		
	}

}
