/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w3.game;

import issa.w3.game.strategies.JumpLow;
import issa.w3.game.strategies.JumpNormal;
import issa.w3.game.strategies.MoveRun;
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
public class EnemyTest {
	
	public EnemyTest() {
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
	 * Test of setStrength method, of class Enemy.
	 */
	@Test
	public void testSetStrength() {
		System.out.println("Enemy setStrength");
		Enemy instance = new Enemy(3);
		
		if(!JumpLow.Method.equals(instance.jump())){
			fail("enemy behaved unexpectedly, He should jump low");
		}
		instance.setStrength(12);
		if(!JumpNormal.Method.equals(instance.jump())){
			fail("enemy behaved unexpectedly, He should jump normal");
		}		
	}
	
	@Test
	public void moveTest() {
		System.out.println("Enemy move test");
		Enemy instance = new Enemy(3);
		if(!MoveRun.Method.equals(instance.move())){
			fail("Excpected that the enemy runned");
		}
	}
}
