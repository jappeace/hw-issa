/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package issa.w4.circel;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author jappie
 */
public class Circel extends javax.swing.JPanel {

	/**
	 * Creates new form Circel
	 */
	public Circel() {
		initComponents();
	}

	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.red);
		g.drawOval(50, 50, 500,  50);
		
	}
	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
	 * content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
