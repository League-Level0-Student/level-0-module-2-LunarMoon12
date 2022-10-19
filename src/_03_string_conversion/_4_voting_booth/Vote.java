package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Vote {
	public static void main(String args[]) {
	

	String ageasstring = JOptionPane.showInputDialog("How old are you?");
	int ageasint = Integer.parseInt(ageasstring);
	
		if (ageasint >= 18) {
			JOptionPane.showInputDialog("Who do you think should be President?");
		} else
			JOptionPane.showMessageDialog(null, "Nobody cares what you think");
	}
}