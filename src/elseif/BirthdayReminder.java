
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "June 17";
		String dadsBirthday = "December 26";
		String myBirthday = "June 3";

		// 2. Find out which birthday the user wants and and store their response in a variable
String b=JOptionPane.showInputDialog(null, "What birthday do you want");
		// 3. Print out what the user typed
System.out.println(b);		
		// 4. if user asked for "mom"
if (b.equals("mom")) { 
			//print mom's birthday
System.out.println(momsBirthday);
}	
// 5. if user asked for "dad"
else if (b.equals("dad")) {
			// print dad's birthday
System.out.println(dadsBirthday);
}
		// 6. if user asked for your name
else if (b.equals("your name")) {
System.out.println(myBirthday);
}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
else {System.out.println("Sorry, i don't remember that person's birthday!");
	
}
	}
}
