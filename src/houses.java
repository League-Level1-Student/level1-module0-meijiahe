import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	static Robot Happyday=new Robot();
public static void main(String[] args) {
	
    Happyday.setX(100);
	Happyday.setY(200);
	Happyday.setPenWidth(10);
	Happyday.penDown();
	Happyday.setSpeed(10);
	Happyday.setPenColor(85,85,204);
	for(int i=0;i<5;i++) {
		draw("small",Color.red);
	}
}


	static void draw(String height,Color color) {
	int height2=60;

		if (height=="small") {
			height2=60;
		}
		if (height=="medium") {
			height2=120;
		}
		if (height=="large") {
			height2=250;
		}
		

	pointyroof(height2,color);
	flatroof(height2,color);
	}
	static void pointyroof(int height,Color color) {
		Happyday.setPenColor(color);	
		Happyday.move(120);
		Happyday.turn(90);
		Happyday.turn(-45);
		Happyday.move(60);
		Happyday.move(20);
		Happyday.turn(90);
		Happyday.move(60);
		Happyday.turn(90);
		Happyday.turn(45);
		Happyday.turn(-90);
		Happyday.move(120);
		Happyday.turn(-90);
		Happyday.move(20);
		Happyday.turn(-90);
		
	}
static void flatroof(int height,Color color) {
	Happyday.setPenColor(color);	
	Happyday.move(height);
	Happyday.turn(90);
	Happyday.move(60);
	Happyday.turn(90);
	Happyday.move(height);
	Happyday.turn(-90);
	Happyday.move(20);
	Happyday.turn(-90);
	}

}
