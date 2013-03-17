/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w4.decorator.decorations;

import issa.w4.decorator.Content;
import issa.w4.decorator.Tag;

/**
 *
 * @author jappie
 */
public class H extends Tag {
	private int _size;
	public H(Content wrapped, int size){
		super(wrapped);
		_size = size;
	}
	
	@Override
	public String Print(){
		return "<h" + _size +" " + printAtributes() +">" + getWrappedContend().Print() + "</h"+_size+">";
		
	}
}
