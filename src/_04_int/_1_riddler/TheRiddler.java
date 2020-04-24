package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle1 = JOptionPane.showInputDialog("i am greater then good, " + 
		"more evil then evil, " + 
		"the poor have me, " + 
		"the rich need me, " + 
		"if you eat me, you will die, " + 
		"who am i.");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(riddle1.equals ("nothing")) {
JOptionPane.showMessageDialog(null, "corect!");
score += 10;}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "wrong! the corect answer is nothing");
}
		// 6. Add some more riddles
JOptionPane.showInputDialog("there are two doors, one two richers and the other to a dongen, with two gaurds,\n "+ 
		"one a truth teller and the other a liar you can only ask them one qution that is the same what is that qustion.");
		// 2. Make a pop up to show the score.
		
	
}
}
