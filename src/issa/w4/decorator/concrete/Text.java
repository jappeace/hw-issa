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
public class Text implements Content {

	private String _content;
	public Text(String content){
		_content = content;
	}
	@Override
	public String Print() {
		return _content;
	}
	
}
