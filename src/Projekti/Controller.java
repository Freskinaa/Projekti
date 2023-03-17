package Projekti;

import java.util.Scanner;

public class Controller {
	public static int rasti; //tregon se cfare ka zgjedhur perdoruesi
	public static double parate; //parate qe perdoruesi inserton
	InputView ip = new InputView();
	OutputView op = new OutputView();
	Scanner sc = new Scanner(System.in);
	
	/** konstruktori i klases */
	public Controller()	
	{
	    System.out.print("Parate insertohen ketu -----> "); // insertimi i parave me scanner
	    
		ip.kafeApoCaj();
		rasti = new Integer(InputView.kafeApoCaj).intValue();
		
		if (rasti==1 || rasti ==2 ) {
			op.insertoParate(rasti);
			
			parate = sc.nextDouble();
			new Model();
  }
		else {
			op.gabimi();
		}
	}
}
