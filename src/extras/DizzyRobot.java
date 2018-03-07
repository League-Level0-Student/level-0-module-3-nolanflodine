//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extras;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot r = new Robot("vic");
	public static void main(String[] args) {
		
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
		r.setSpeed(999);
int lol=Integer.parseInt(JOptionPane.showInputDialog("How many times do you want Ben the Box to spin?"));
 // 1. Use the dance method to make the robot spin.
dance(lol);

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			r.turn(360);
		}
	}
}

