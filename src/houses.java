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
	for(int i=0;i<10;i++) {
		draw(small);
	}
}
	static void draw(String height) {
	int height2;
		if (height=="small") {
			height2=60;
		}
		if (height=="medium") {
			height2=120;
		}
		if (height=="large") {
			height2=250;
		}
	Happyday.move(120);
	Happyday.turn(90);
	Happyday.move(20);
	Happyday.turn(90);
	Happyday.move(120);
	Happyday.turn(90);
	Happyday.move(20);
	Happyday.turn(90);
	
	}
	
	

}
