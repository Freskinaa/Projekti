package Projekti;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class OutputView {
	DecimalFormat formateri = new DecimalFormat("0.00 €");
	int rasti = Controller.rasti;
	/** shfaq dialogun e ruajtur ne  k apo  c varesisht nga  rasti, */
	public void insertoParate(int rasti) {
		String p = "Ju lutem insertoni parate me poshte.(ne console)";
	 	   switch (rasti) {
			case 1 : {
				String k = "Cmimi i kafes eshte: " + formateri.format(Model.cmimiKafes);
				JOptionPane.showMessageDialog(null, k + "\n" + p);
			}
			break;
			case 2 :{
				String c = "Cmimi i cajt eshte: " + formateri.format(Model.cmimiCajit);
				JOptionPane.showMessageDialog(null, c + "\n" + p);
			}
			break;
			}
	 	   }
		
	/** shfaq dialogun e ruajtur ne  p_p */
	public void pakPara() {
		String  p_p = "Ju nuk keni para te mjaftueshme!";
		JOptionPane.showMessageDialog(null, p_p);
		}
	
	/** shfaq dialogun e ruajtur ne  flm */
	public void faleminderit() {
	String flm = "Faleminderit!";
	JOptionPane.showMessageDialog(null, flm);
	}
	
	/** shfaq dialogun e ruajtur ne  p_ku */
	public void paKusur() {
 	   	String  p_ku = "Kerkojme falje.\nMakina nuk ka kusur te mjaftueshem.";
 	   	JOptionPane.showMessageDialog(null, p_ku);
	}
	
	/** kthimi_i_kusurit shfaqe dialogun e ruajtur ne @String k_i_k_k apo @String k_i_k_c varesisht nga @int rasti */
	public void kthimiKusurit() {
 	   switch (rasti) {
		case 1 : {
	        double kusuri_k = Controller.parate - Model.cmimiKafes;
	        String k_i_k_k = "Faleminderit! \nKusuri juaj eshte " +formateri.format(kusuri_k);
	        JOptionPane.showMessageDialog(null, k_i_k_k);
		}
		break;
		case 2 :{
			 double kusuri_c = Controller.parate - Model.cmimiCajit;
			 String k_i_k_c = "Faleminderit! \nKusuri juaj eshte " + formateri.format(kusuri_c);
			 JOptionPane.showMessageDialog(null, k_i_k_c);
		}
		break;
		}
 	   }
	
	/** shfaqe dialogun e ruajtur ne @String p_ka */
	public void paKafe(){
		String p_ka = "Kerkojme falje.\nMakina nuk ka sasi te mjaftushme te kafes";
        JOptionPane.showMessageDialog(null, p_ka);
	}

	/** shfaqe dialogun e ruajtur ne @String p_c */
	public void paCaj() {
		String p_c = "Kerkojme falje.\nMakina nuk ka sasi te mjaftushme te cajit.";
        JOptionPane.showMessageDialog(null, p_c);
	}
	
	/** gabimi shfaqe dialogun e ruajtur ne @String g */
	public void gabimi() {
		String g = "Nje gabim eshte paraqitur!";
        JOptionPane.showMessageDialog(null, g);
	}
}
