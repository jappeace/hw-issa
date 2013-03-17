/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w6.Chain_of_Responsibility;

/**
 *
 * @author jappie
 */
public abstract class Filter {
	private Filter _next;
	public abstract String write(Integer prioority);
	protected String callNext(Integer prioority){
		return _next.write(prioority);
	}
}
