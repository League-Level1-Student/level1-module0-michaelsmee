package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CookieLuck implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton();
	public void showButton() {
        System.out.println("Button clicked");
   
        frame.setVisible(true);
	
	 JButton button = new JButton();
	    frame.add(button);
	    frame.pack();
	
	button.addActionListener(this);
	
button.setText("click here for fortune");
	
	frame.pack(); 
	

	
	}
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "woohoo");
		Random rand = new Random();
		
		int hi = rand.nextInt(5);	
		
		if(hi == 0) {JOptionPane.showMessageDialog(null, "You will be a master at roblox");}
		
		else if(hi == 1) {JOptionPane.showMessageDialog(null, "you will suck at fortnite and place 101st "
				+ "in solos and 3rd in team rumble until you give me more money ");}
		
		else if(hi == 2) {JOptionPane.showMessageDialog(null, "You will drive a beatiful mini van, truley beatiful");}
		
		else if(hi == 3) {JOptionPane.showMessageDialog(null, "There is something that will make you a very big deafault in fortnite/ imagine still playing fortnite you noob");}
		
		else if(hi == 4) {JOptionPane.showMessageDialog(null, "imagine having to try another time at this since you will lose all your money to robux somehow ( :p )");}
		
	}
}

