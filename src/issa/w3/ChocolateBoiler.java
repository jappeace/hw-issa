/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w3;

/**
 *
 * @author jappie
 */
public class ChocolateBoiler {
	private boolean empty = true;
	private boolean boiled = false;
	private static ChocolateBoiler instance = new ChocolateBoiler();
	private ChocolateBoiler(){
		
	}
	public void fill(){
		if(isEmpty()){
			empty = false;
			boiled = true;
		}
	}
	public static ChocolateBoiler getInstance(){
		return ChocolateBoiler.instance;
	}

	/**
	 * @return the empty
	 */
	public boolean isEmpty() {
		return empty;
	}
	
}
