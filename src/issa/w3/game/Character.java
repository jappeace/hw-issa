/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w3.game;

import issa.w3.game.strategies.JumpNormal;
import issa.w3.game.strategies.MoveWalk;
import issa.w3.game.strategies.iJumpStrategy;
import issa.w3.game.strategies.iMoveStrategy;

/**
 *
 * @author jappie
 */
public abstract class Character {
	private iJumpStrategy _jumpStrategy;
	private iMoveStrategy _moveStrategy;
	
	public Character(){
		this(new JumpNormal());
	}
	public Character(iJumpStrategy strategy){
		this(strategy, new MoveWalk());
		
	}
	public Character(iJumpStrategy jump, iMoveStrategy move){
		_jumpStrategy = jump;
		_moveStrategy = move;
	}
	
	public String jump(){
		return _jumpStrategy.jump();
	}
	public String move(){
		return _moveStrategy.Move();
	}
	/**
	 * @param jumpStrategy the _jumpStrategy to set
	 */
	protected void setJumpStrategy(iJumpStrategy jumpStrategy) {
		this._jumpStrategy = jumpStrategy;
	}

	/**
	 * @param moveStrategy the _moveStrategy to set
	 */
	protected void setMoveStrategy(iMoveStrategy moveStrategy) {
		this._moveStrategy = moveStrategy;
	}
}
