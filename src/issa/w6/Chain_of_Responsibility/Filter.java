/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w6.Chain_of_Responsibility;

/**
 *
 * @author jappie
 */
public class Filter extends LogFilter{
	private Integer _threshold;
	private String _message;
	/**
	 * 
	 * @param threshold
	 * @param message the message when this filter is used
	 */
	public Filter(Integer threshold, String message){
		_threshold = threshold;
		_message = message;
	}

	@Override
	public String write(Integer prioority) {
		if(prioority > _threshold){
			return _message;
		}
		return "";
	}
	
}
