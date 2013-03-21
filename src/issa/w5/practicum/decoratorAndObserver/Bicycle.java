/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w5.practicum.decoratorAndObserver;

/**
 *
 * @author jappie
 */
public class Bicycle extends Part {
	

	@Override
	public String getParts() {
		return "frame, twee wielen, stuur, rem, zadel en ketting";
	}

	@Override
	public Double getPrice() {
		return 250.0;
	}

	@Override
	public Double getWeight() {
		return 15.0;
	}
	
}
