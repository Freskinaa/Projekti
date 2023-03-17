package Projekti;

import javax.swing.JOptionPane;

public class InputView {
	
	public static String kafeApoCaj ; //ruan vlerën e inputit të përdoruesit
	
	/**  shfaq dialogun e ruajtur ne inputi dhe ruan inputin 
	 * e perdoruesit ne kafeApoCaj 
	 * */
	public void kafeApoCaj() {
		String inputi = "A deshironi kafe apo caj?\nShtyp 1 per kafe.\nShtyp 2 per caj.";
		kafeApoCaj = JOptionPane.showInputDialog(inputi);
	}
}
