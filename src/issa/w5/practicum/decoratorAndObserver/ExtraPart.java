/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w5.practicum.decoratorAndObserver;

/**
 *
 * @author jappie
 */
public class ExtraPart extends Part{
	
	private Part _parent;
	public ExtraPart(Part parent){
		_parent = parent;
	}

	@Override
	public String getParts() {
		return _parent.getParts();
	}

	@Override
	public Double getPrice() {
		return _parent.getPrice();
	}

	@Override
	public Double getWeight() {
		return _parent.getWeight();
	}
	
	@Override
	public String toString(){
		String parent = _parent.toString();
		int cutoffsize = 1, cutoffLength = parent.length()-cutoffsize;
		return parent.substring(0, cutoffLength) +"{"+ super.toString()+"}"+parent.substring(cutoffLength, cutoffLength+cutoffsize);
	}
}
