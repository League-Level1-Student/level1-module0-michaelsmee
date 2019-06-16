package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
String wow = "https://s.aolcdn.com/commerce/autodata/images/USC70PRC011A021001.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component image; 
		// 3. use the "createImage()" method below to initialize your Component
image = createImage(wow);
		// 4. add the image to the quiz window
quizWindow.add(image);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String pow = JOptionPane.showInputDialog("what car brand made this cool car (think of nothern europe, not USA)");
		// 7. print "CORRECT" if the user gave the right answer
if(pow.equalsIgnoreCase("porsche")) {
	System.out.println("Correct");
}
		// 8. print "INCORRECT" if the answer is wrong
else {
System.out.println("you noob, get out of here");	
}

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line
		// of code)
String cool = "https://cdn.motor1.com/images/mgl/JmVR6/s1/2019-audi-r8-onlocation.jpg";
Component bob;		
bob=createImage(cool);
// 11. add the second image to the quiz window
quizWindow.add(bob);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
JOptionPane.showInputDialog("What movie uses this car/ hint, this dude cewl and it is used in multiple movies");
		// 14+ check answer, say if correct or incorrect, etc.
if(cool.equalsIgnoreCase("IronMan")){
	System.out.println("Correct");
}
else{
System.out.println("u are bad, you need to watch it again");	
}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
