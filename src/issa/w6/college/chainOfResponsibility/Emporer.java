/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w6.college.chainOfResponsibility;

/**
 *
 * @author jappie
 */
public class Emporer extends Handler{
	@Override
	public Integer getHandleValue(){
		return Integer.MAX_VALUE;
	}
	@Override
	public String HandleRequest(Comparable e) {
		return this.Handle();
	}
}
