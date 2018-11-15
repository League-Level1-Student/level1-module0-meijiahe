/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.awt.image.ImageProducer;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
                String hate="http://www.abcmemes.com/media/created/this-is.jpg";  
		// 2. create a variable of type "Component" that will hold your image
Component java;
		// 3. use the "createImage()" method below to initialize your Component
	java = createImage((hate));
	
		// 4. add the image to the quiz window
quizWindow.add(java);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String answer=JOptionPane.showInputDialog("You hate Java right?");
System.out.println(answer);
		// 7. print "CORRECT" if the user gave the right answer
if (answer.equals("yes")) {
	System.out.println("correct");
}
		// 8. print "INCORRECT" if the answer is wrong
if (answer.equals("no")) {
	System.out.println("incorrect");
}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(java);
		// 10. find another image and create it (might take more than one line of code)
String what="https://3.bp.blogspot.com/-3u1AEe3U4t4/VJc5qLuGtDI/AAAAAAAAnuo/0YkCygRpJkk/s1600/garota%2Blerigou.jpg";
Component bg;
bg = createImage((what));
		// 11. add the second image to the quiz window
quizWindow.add(bg);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String answer1=JOptionPane.showInputDialog("Do you have question of how to love java like me in that much?");
System.out.println(answer1);
		// 14+ check answer, say if correct or incorrect, etc.
if (answer1.equals("yes")) {
	System.out.println("correct");
}
if (answer1.equals("no")) {
	System.out.println("incorrect");
}
	}

	private static Component Component() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





