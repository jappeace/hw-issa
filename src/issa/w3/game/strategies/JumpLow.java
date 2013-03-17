/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w3.game.strategies;

/**
 *
 * @author jappie
 */
public class JumpLow implements iJumpStrategy {
	public static String Method = "Lage sprong";

	@Override
	public String jump() {
		return Method;
	}
}
