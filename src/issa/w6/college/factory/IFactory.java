/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w6.college.factory;

/**
 *
 * @author jappie
 */
public interface IFactory {
	public Door createDoor();
	public Engine createEngine();
	public Wheel createWheel();
}
