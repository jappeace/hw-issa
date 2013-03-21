/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w5.practicum.decoratorAndObserver;

/**
 *
 * @author jappie
 */
public class Rack extends ExtraPart{
	public Rack(Part parent){
		super(parent);
	}
	@Override
	public String getParts() {
		return super.getParts()+" bagagedrager";
	}

	@Override
	public Double getPrice() {
		return super.getPrice()+20.5;
	}

	@Override
	public Double getWeight() {
		return super.getWeight()+1.5;
	}
}
