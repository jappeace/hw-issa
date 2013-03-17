/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w6.college.factory;

/**
 *
 * @author jappie
 */
public class SanderStyleFactory implements IFactory {

	//creates & configures. So violates single responsibility princable
	@Override
	public Door createDoor() {
		Door d = new Door();
		d.name = "Rooie ferrari deur";
		return d;
	}

	@Override
	public Engine createEngine() {
		Engine e = new Engine();
		e.name = "American muscle v6";
		return e;
	}

	@Override
	public Wheel createWheel() {
		Wheel w = new Wheel();
		w.name = "Spinners rimps";
		return w;
	}
	
}
