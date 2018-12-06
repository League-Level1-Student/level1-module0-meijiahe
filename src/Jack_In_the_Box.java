import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jack_In_the_Box implements ActionListener {
	public static void main(String[] args) {
		Jack_In_the_Box ihtjv = new Jack_In_the_Box();
				ihtjv.showButton();
	}
	public void showButton() {
	     System.out.println("Button clicked");
	     JFrame frame=new JFrame();
	     frame.setVisible(true);
	     JButton Surprise = new JButton();
	     frame.add(Surprise);
	     Surprise.addActionListener(this);
int rand = new Random().nextInt(5);
System.out.println(rand);
frame.pack();
	}
int count=0;

private void showPicture(String fileName) { 
     try {
          JLabel imageLabel = createLabelImage(fileName);
          JFrame frame = new JFrame();
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.add(imageLabel);
          frame.setVisible(true);
          frame.pack();
     } catch (Exception e) {
          e.printStackTrace();
     }
}

private JLabel createLabelImage(String fileName) {
     try {
          URL imageURL = getClass().getResource(fileName);
          if (imageURL == null) {
               System.err.println("Could not find image " + fileName);
               return new JLabel();
          } else {
               Icon icon = new ImageIcon(imageURL);
               JLabel imageLabel = new JLabel(icon);
               return imageLabel;
          }
     } catch (Exception e) {
          System.err.println("Could not find image " + fileName);
          return new JLabel();
     }
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count++;
		if (count==5){
			showPicture("JackInthebox.png");
			playSound("homer-woohoo.wav");
		}
	}
	private void playSound(String soundFile) { 
	     try {
	          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

}

	