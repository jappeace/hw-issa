/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w3.game;

import issa.w3.game.strategies.JumpLow;
import issa.w3.game.strategies.JumpNormal;
import issa.w3.game.strategies.MoveRun;

/**
 *
 * @author jappie
 */
public class Enemy extends Character {
	private int _strength;
	public Enemy(){
		this(3);
	}
	public Enemy(int strength){
		super();
		this.setMoveStrategy(new MoveRun());
		this.setStrength(strength);
	}

	/**
	 * @return the _strength
	 */
	public int getStrength() {
		return _strength;
	}

	/**
	 * @param strength the _strength to set
	 */
	public final void setStrength(int strength) {
		if(strength < 10){
			this.setJumpStrategy(new JumpLow());
		}else{
			this.setJumpStrategy(new JumpNormal());
		}
		this._strength = strength;
	}
	
}
