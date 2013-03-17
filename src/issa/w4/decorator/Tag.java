/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w4.decorator;

import java.util.HashMap;

/**
 *
 * @author jappie
 */
public abstract class Tag implements Content{
	
	private Content _wrappedContend;
	private String _id = null, _clas = null;
	public Tag(Content wrapped){
		this._wrappedContend = wrapped;
	}
	
	@Override
	public abstract String Print();

	/**
	 * @return the _wrappedContend
	 */
	protected Content getWrappedContend() {
		return _wrappedContend;
	}

	protected String printAtributes(){
		return getId() + " " + getClas();
	}
	/**
	 * @return the _id
	 */
	private String getId() {
		if(_id == null){
			return "";
		}
		return "id='"+_id+"'";
	}

	/**
	 * @param id the _id to set
	 */
	public void setId(String id) {
		this._id = id;
	}

	/**
	 * @return the _clas
	 */
	private String getClas() {
		if(_clas == null){
			return "";
		}
		return "class='"+_clas+"'";
	}

	/**
	 * @param clas the _clas to set
	 */
	public void setClas(String clas) {
		this._clas = clas;
	}
	
}
