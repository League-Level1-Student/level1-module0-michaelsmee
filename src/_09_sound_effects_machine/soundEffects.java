package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundEffects implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button1 = new JButton();
	
	public void buttonMaker() {
	   
	frame.setTitle("noises that are loud");
		
		
		
	
			panel.add(button);
			
			button.addActionListener(this);
		
			button.setText("big noise");
	
		
		
			panel.add(button1);
			
			button1.addActionListener(this);
		
			button1.setText("meme noise");
		
			frame.add(panel);
			frame.pack();
			frame.setVisible(true);
	}
	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
	if(e.getSource()==button) {
		playSound("hi.wav");
		}
	else if(e.getSource()==button1) {
		playSound("bye.wav");
	}
	}	
		

		
		
	

	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}

}
