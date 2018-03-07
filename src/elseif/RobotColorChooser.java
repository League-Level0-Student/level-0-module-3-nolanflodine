
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot r=new Robot();

		//3. ask the user what color they would like the robot to draw
r.setSpeed(20);
for (int i = 0; i < 5; i++) {
	
String c=JOptionPane.showInputDialog("What color do you want the robot to draw?");		
		//4. use an if/else statement to set the pen color that the user requested
if (c.equals("blue")) {
r.setPenColor(Color.BLUE);
}else 
if (c.equals("red")) {
r.setPenColor(Color.red);
}else 
if (c.equals("green")) {
r.setPenColor(Color.green);
}else {
r.setRandomPenColor();
}
        //5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
r.setPenWidth(10);		
r.penDown();
	    //1. make the robot draw a shape (this will take more than one line of code)

r.move(100);
r.turn(90);
r.move(100);
r.turn(90);
r.move(100);
r.turn(90);
r.move(100);
r.turn(90);
	}
}
}
