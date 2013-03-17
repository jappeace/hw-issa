/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w6.college.chainOfResponsibility;

/**
 *
 * @author jappie
 */
public abstract class Handler {
	
	private Handler _sucessor;
	/**
	 * @return the _sucessor
	 */
	protected Handler getSucessor() {
		return _sucessor;
	}

	/**
	 * @param sucessor the _sucessor to set
	 */
	public void setSucessor(Handler sucessor) {
		this._sucessor = sucessor;
	}
	
	protected String Handle(){
		return getClass().getName() +" handles";
	}
	public String HandleRequest(Comparable e) {
		if(e.compareTo(getHandleValue()) > -1){
			if(getSucessor() != null){
				return getSucessor().HandleRequest(e);
			}else{
				return new Emporer().HandleRequest(e);
			}
		}else{
			return this.Handle();
		}
	}

	/**
	 * @return the _handleValue
	 */
	protected abstract Integer getHandleValue();
	
}
