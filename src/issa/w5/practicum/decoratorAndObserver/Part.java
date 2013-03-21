/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w5.practicum.decoratorAndObserver;

/**
 *
 * @author jappie
 */
public abstract class  Part {
	public abstract String getParts();
	public abstract Double getPrice(); 
	public abstract Double getWeight();
	
	public String toString(){
		return "(" + getParts() + " €"+ getPrice() + " Kg: "+ getWeight() +")";
	}
}
