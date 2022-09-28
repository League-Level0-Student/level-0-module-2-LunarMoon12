package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {

	public static void main(String[] args) {
		Random ran = new Random();
		String s = "";
		for (int i = 0; i < 6; i++) {
			int number = ran.nextInt(100);
			s += number + " ";
		}
		JOptionPane.showMessageDialog(null, (s));
	}
}
