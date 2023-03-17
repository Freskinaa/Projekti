package Projekti;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Service {
	/**  sherbimi i kafes */
	public void jepKafe() {
		JFrame frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(500,200,250,280);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel label = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("coffee.jpg"));
		label.setIcon(img);
		label.setBounds(15,15,200,200);
		frame.getContentPane().add(label);
		frame.setVisible(true);
		
}
	/** sherbimi i cajit */
	public void jepCaj() {
		JFrame frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(500,200,270,280);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel label = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("tea.png"));
		label.setIcon(img);
		label.setBounds(15,15,250,200);
		frame.getContentPane().add(label);
		frame.setVisible(true);
}
}