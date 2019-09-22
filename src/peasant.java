import java.awt.KeyEventDispatcher;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class peasant implements KeyListener{

public static void main(String[] args) {
	
new peasant().createGUI();


}

public void createGUI(){
	JFrame frame = new JFrame();	
	JPanel panel = new JPanel();

	JButton button = new JButton();	
		frame.add(button);
		frame.pack();
		
	frame.setVisible(true);	
	button.addKeyListener(this);
	
	
}



static void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
         }
    }

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	speak("ouch");
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}


