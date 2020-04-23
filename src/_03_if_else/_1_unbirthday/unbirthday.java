package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("what is you birthday?");
		if(birthday.equals ("04/23/20")) {
		JOptionPane.showMessageDialog(null, "happy birthday!");
		}
		else {
			JOptionPane.showMessageDialog(null, "happy unbirthday");
}
}
}