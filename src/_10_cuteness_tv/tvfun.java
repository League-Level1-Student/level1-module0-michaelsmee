package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class tvfun implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JButton button1 = new JButton();
JButton button2 = new JButton();

public void buttonMaker() {

frame.setTitle("tv");


	panel.add(button);
	
	button.addActionListener(this);

	button.setText("duck");

	panel.add(button1);
	
	button1.addActionListener(this);

	button1.setText("frog");

	frame.add(panel);
	
	panel.add(button);
	
	button2.addActionListener(this);
	
	button2.setText("unicorn");
	
	panel.add(button2);
	
	frame.pack();

	frame.setVisible(true);
}

	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}




@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if(e.getSource()==button) {
		showDucks();
		}
	else if(e.getSource()==button1) {
		showFrog();
		}
	else if(e.getSource()==button2); {
		showFluffyUnicorns();
	}
	}

}



