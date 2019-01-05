import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTv implements ActionListener {
    JButton button = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
public static void main(String[] args) {
	CutenessTv ihtjv=new CutenessTv();
	ihtjv.showButton();
}
public void showButton() {
	   System.out.println("Button clicked");
	     JFrame frame=new JFrame();
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     frame.setVisible(true);
	     JPanel panel = new JPanel();
	     frame.add(panel);
	     panel.add(button);
	     panel.add(button1);
	     panel.add(button2);
	     button.addActionListener(this);
frame.pack();

System.out.println("Button1 clicked");
button1.addActionListener(this);


System.out.println("Button2 clicked");
button2.addActionListener(this);
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
	System.out.println("click");
	if (e.getSource()==button) {
	showDucks();
	}
	if (e.getSource()==button1) {
		showFrog();
		}
	if (e.getSource()==button2) {
		showFluffyUnicorns();
		}
}
	
}



