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
	
	private List<Filter> _filters;
	
	public Log(){
		_filters = new ArrayList<>();
	}
	
	public String write(Integer prioority){
		String result = "/";
		for(Filter next : _filters){
			String temp = next.write(prioority);
			result += temp.equals("")? "" : next.write(prioority) + "/";
		
		}
		return result.substring(0, result.length()-1);
	}
	
	public void add(Filter filter){
		_filters.add(filter);
	}
	
	public void remove(Filter filter){
		_filters.remove(filter);
	}
}
