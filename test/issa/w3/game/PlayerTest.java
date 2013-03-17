/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w3.game;

import issa.w3.game.strategies.JumpHigh;
import issa.w3.game.strategies.JumpNormal;
import issa.w3.game.strategies.MoveRun;
import issa.w3.game.strategies.MoveWalk;
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
public class PlayerTest {
	
	public PlayerTest() {
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
	 * Test of setPowerUp method, of class Player.
	 */
	@Test
	public void testSetPowerUp() {
		System.out.println("Player setPowerUp");
		Player instance = new Player(false);
		
		if(!JumpNormal.Method.equals(instance.jump())){
			fail("player behaved unexpectedly, He should jump normal");
		}
		
		instance.setPowerUp(true);
		
		if(!JumpHigh.Method.equals(instance.jump())){
			fail("player behaved unexpectedly, He should jump high");
		}
	}
	@Test
	public void moveTest() {
		System.out.println("Player move test");
		Player instance = new Player(true);
		if(!MoveRun.Method.equals(instance.move())){
			fail("Excpected that the player runned");
		}
		instance.setPowerUp(false);
		if(!MoveWalk.Method.equals(instance.move())){
			fail("Excpected that the player walked");
		}
	}
}
