/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w3.game;

import issa.w3.game.strategies.JumpNormal;
import issa.w3.game.strategies.JumpHigh;
import issa.w3.game.strategies.MoveRun;
import issa.w3.game.strategies.MoveWalk;

/**
 *
 * @author jappie
 */
public class Player extends Character {
	private boolean _powerUp;
	public Player(boolean poweredUp){
		super();
		setPowerUp(poweredUp);
	}	

	/**
	 * @return the _powerUp
	 */
	public boolean isPoweredUp() {
		return _powerUp;
	}

	/**
	 * @param powerUp the _powerUp to set
	 */
	public void setPowerUp(boolean powerUp) {
		if(powerUp){
			this.setMoveStrategy(new MoveRun());
			this.setJumpStrategy(new JumpHigh());
		}else{
			this.setMoveStrategy(new MoveWalk());
			this.setJumpStrategy(new JumpNormal());
		}
		this._powerUp = powerUp;
	}
	
}
