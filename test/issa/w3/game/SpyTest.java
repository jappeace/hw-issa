/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w3.game;

import issa.w3.game.strategies.MoveSneak;
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
public class SpyTest {
	
	public SpyTest() {
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

	@Test
	public void moveTest() {
		System.out.println("Spy move test");
		Spy instance = new Spy();
		if(!MoveSneak.Method.equals(instance.move())){
			fail("Excpected that the spy sneaked");
		}
	}
}
