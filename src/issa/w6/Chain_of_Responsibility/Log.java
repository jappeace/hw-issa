/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w6.Chain_of_Responsibility;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jappie
 */
public class Log {
	
	private List<LogFilter> _filters;
	
	public Log(){
		_filters = new ArrayList<>();
	}
	
	public String write(Integer prioority){
		String result = "";
		for(LogFilter next : _filters){
			
			result += next.write(prioority);
		
		}
		return result;
	}
	
	public void add(LogFilter filter){
		_filters.add(filter);
	}
	
	public void remove(LogFilter filter){
		_filters.remove(filter);
	}
}
