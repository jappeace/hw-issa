/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w6.Chain_of_Responsibility;

/**
 *
 * @author jappie
 */
public class FilterFactory {
	private Integer _smallOffset = 1, _largeOffset = 3, _mediumOffset = 4;
	public Filter smallFilter(){
		_smallOffset++;
		return new LogFilter(_smallOffset, "small filter");
	}
	
	public Filter mediumFilter(){
		_mediumOffset++;
		return new LogFilter(_mediumOffset+_smallOffset, "medium filter");
	}
	public Filter largeFilter(){
		_largeOffset++;
		return new LogFilter(_largeOffset+_mediumOffset+_smallOffset, "large filter");
	}
	
}
