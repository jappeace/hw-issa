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
public class Em  extends Tag {
	public Em(Content wrapped){
		super(wrapped);
	}
	@Override
	public String Print() {
		return "<em "+ printAtributes() + ">" + getWrappedContend().Print() + "</em>";
	}
	
}
