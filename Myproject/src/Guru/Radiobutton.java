package Guru;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Radiobutton {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Questions");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		label.setText("Que.1 : Which one among these is not database?");
		ButtonGroup gr1 = new ButtonGroup();

		JRadioButton r1 = new JRadioButton("int");
		JRadioButton r2 = new JRadioButton("float");
		JRadioButton r3 = new JRadioButton("boolen");
		JRadioButton r4 = new JRadioButton("char");
		panel.add(label);
		
		gr1.add(r1);
		gr1.add(r2);
		gr1.add(r3);
		gr1.add(r4);
		

		
		frame.getContentPane().add(BorderLayout.CENTER,label);
		frame.getContentPane().add(BorderLayout.NORTH,panel);
		frame.add(r1);
		frame.add(r2);
		frame.add(r3);
		frame.add(r4);
		frame.setVisible(true);
	}


		
	

}
