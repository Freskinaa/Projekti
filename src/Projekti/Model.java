package Projekti;

import java.text.DecimalFormat;

public class Model {
	private int sasiaKafes  = 10; //sasia e kafes e mbetur ne makine
	private int sasiaCajit = 10; //sasia e cajit e mbetur ne makine
	private double kusuri = 50; //sasia e kusurit te mbetur qe makina ka
	public static final double cmimiKafes = 1.00; //cmimi i kafes
	public static final double cmimiCajit = 0.70; //cmimi i cajit
	
	double parate = Controller.parate;
	int rasti = Controller.rasti;
	OutputView view = new OutputView();
	Service sherbimi = new Service();
	DecimalFormat formateri = new DecimalFormat("0.00 €");
	
	 //** konstruktori i klases */
		public Model() { 
			switch (rasti){
			case 1: {    //rasti kur perdoruesi zgjedh kafe
	      double kusuri_k = parate - cmimiKafes;
			if (sasiaKafes > 0) {
				if (parate < cmimiKafes) {
		        view.pakPara();
		        System.out.println(formateri.format(parate));  
			}
				else if (parate == cmimiKafes) {
				   view.faleminderit();
				   sherbimi.jepKafe();
		    	   sasiaKafes = sasiaKafes - 1;

			}
				else {
					if (kusuri < kusuri_k) {	        
		    	    view.paKusur();
			        System.out.println(formateri.format(parate));
					}
					else {
		    	    view.kthimiKusurit();
			        System.out.println(formateri.format(kusuri_k));   
			        kusuri = kusuri - kusuri_k;
			        sherbimi.jepKafe();
			        sasiaKafes = sasiaKafes -1;
		    	    }
				
				}
				}
			else {
				view.paKafe();
		        System.out.println(formateri.format(parate));
			}
			break;
		}
		case 2: {    //rasti kur perdoruesi zgjedh caj
		        double kusuri_c = parate - cmimiCajit;
				if (sasiaCajit >0) {
					if (parate < cmimiCajit) {
			        view.pakPara();
			        System.out.println(formateri.format(parate));
			        }
					else if (parate == cmimiCajit) {
					 view.faleminderit();
					 sherbimi.jepCaj();
			    	 sasiaCajit = sasiaCajit -1;

					}
					else {
						if (kusuri < kusuri_c) {	        
			    	    view.paKusur();
				        System.out.println(formateri.format(parate));
				        }

						else {
			    	    view.kthimiKusurit();
				        System.out.println(formateri.format(kusuri_c));
				        kusuri = kusuri - kusuri_c;
				        sherbimi.jepCaj();
				        sasiaCajit = sasiaCajit -1;
			    	    }
						}
					}
				else {
					view.paCaj();
			        System.out.println(formateri.format(parate));
					}
			break;
			}
		}
		}
}
