import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jack_In_the_Box implements ActionListener {
public static void main(String[] args) {
	Jack_In_the_Box ihtjv=new Jack_In_the_Box();
	ihtjv.showPicture("i-hate-java.jpg");
	
}
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
      	public void showButton() {
   	     System.out.println("Button clicked");
   	     JFrame frame=new JFrame();
   	     frame.setVisible(true);
   	     JButton button = new JButton();
   	     frame.add(button);
   	     button.addActionListener(this);
   int rand = new Random().nextInt(5);
   System.out.println(rand);
     } catch (Exception e) {
          System.err.println("Could not find image " + fileName);
          return new JLabel();
     }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
