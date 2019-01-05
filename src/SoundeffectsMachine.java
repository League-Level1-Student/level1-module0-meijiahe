import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundeffectsMachine implements ActionListener {
public static void main(String[] args) {
	SoundeffectsMachine ihtjv=new SoundeffectsMachine();
	ihtjv.showButton();
}
public void showButton() {
	   System.out.println("Button clicked");
	     JFrame frame=new JFrame();
	     frame.setVisible(true);
	     JPanel panel = new JPanel();
	     frame.add(panel);
	     JButton button = new JButton();
	     JButton button2 = new JButton();
	     panel.add(button);
	     button.addActionListener(this);
int rand = new Random().nextInt(5);
System.out.println(rand);
frame.pack();
}

private void playSound(String fileName) {
     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
     sound.play();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	playSound("172302__sovy__ho-ho-hooo-merry-christmas.wav");
}

}
