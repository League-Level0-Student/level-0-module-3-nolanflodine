import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
import org.jointheleague.graphical.robot.RobotImage;

/**
 * 
 */

/**
 * @author Flodine.Nolan
 *
 */
public class ValentineDay {
public static void main(String[] args) {
Robot Jeff=new Robot("batman");	
Jeff.setSpeed(999999999);
Jeff.penDown();
Jeff.setPenColor(255, 0, 0);
for (int i = 0; i < 60; i++) {
Jeff.move(1);
Jeff.turn(-6);
Jeff.move(1);
Jeff.turn(5);
}
for (int i = 0; i < 49; i++) {
Jeff.move(3);
Jeff.turn(-5);
Jeff.move(3);
Jeff.turn(10);
}
Jeff.turn(-180);
for (int i = 0; i < 49; i++) {
	Jeff.move(3);
	Jeff.turn(-5);
	Jeff.move(3);
	Jeff.turn(10);	
}
for (int i = 0; i < 60; i++) {
Jeff.move(1);
Jeff.turn(-6);
Jeff.move(1);
Jeff.turn(5);
}
for (int i = 0; i < 10; i++) {
	Jeff.move(10);
	Jeff.turn(30);
	Jeff.move(10);
	Jeff.turn(-10);	
}
Jeff.turn(105);
for (int i = 0; i < 10; i++) {
	Jeff.move(3);
	Jeff.turn(-15);
	Jeff.move(3);
	Jeff.turn(5);	
}
}
}
