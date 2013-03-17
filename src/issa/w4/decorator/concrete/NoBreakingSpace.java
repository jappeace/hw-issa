/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w4.decorator.concrete;

import issa.w4.decorator.Content;

/**
 * 
 * @author jappie
 */
public class NoBreakingSpace implements Content{

	@Override
	public String Print() {
		return "&nbsp;";
	}
	
}
