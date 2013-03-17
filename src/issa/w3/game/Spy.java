/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w3.game;

import issa.w3.game.strategies.MoveSneak;

/**
 *
 * @author jappie
 */
public class Spy extends Enemy {
	
	public Spy(){
		super();
		this.setMoveStrategy(new MoveSneak());
	}
	
}
