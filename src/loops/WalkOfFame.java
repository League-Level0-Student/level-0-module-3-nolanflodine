
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot("batman");
		// 1. Set the X position of the robot so that it starts on the left.
		// You also need to show the robot to see the result of this line.
		rob.setX(100);
		// 2. Make the robot draw a star shape. Hint: 144.
		rob.penDown();
		rob.setPenColor(255, 0, 0);
		rob.setSpeed(999);
		for (int i = 0; i < 50; i++) {
			for (int a = 0; a < 5; a++) {
				rob.penDown();
				rob.move(30);
				rob.turn(144);
			}
			rob.turn(45);
			rob.penUp();
			rob.move(30);
			rob.turn(-45);
		}
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this: http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
