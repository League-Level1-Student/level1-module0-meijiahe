import org.jointheleague.graphical.robot.Robot;

public class houses {
public static void main(String[] args) {
	Robot Happyday=new Robot();
	Happyday.setX(1500);
	Happyday.setY(20);
	Happyday.setPenWidth(10);
	Happyday.penDown();
	Happyday.setSpeed(10);
	Happyday.setPenColor(85,85,204);
	Happyday.move(120);
	Happyday.turn(90);
	Happyday.move(120);
	Happyday.turn(90);
	}
}

