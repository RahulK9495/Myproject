package Guru;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class gui {
	public static void main(String[] args) {
		JFrame frame = new JFrame("My First GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		
		JMenuBar mb = new JMenuBar();
		JMenu m1= new JMenu("File");
		JMenu m2= new JMenu("Help");
		mb.add(m1);
		mb.add(m2);
		JMenuItem m12= new JMenuItem("Open");
		JMenuItem m13= new JMenuItem("Save As");
		m1.add(m12);
		m1.add(m13);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		JTextField tf= new JTextField(10);
		JButton send = new JButton("Send");
		JButton recieve = new JButton("recieve");
		panel.add(label);
		panel.add(tf);
		panel.add(send);
		panel.add(recieve);
		
		
		JTextArea ta = new JTextArea();
		
		
		frame.getContentPane().add(BorderLayout.SOUTH,panel);
		frame.getContentPane().add(BorderLayout.NORTH,mb);

		frame.setVisible(true);
	}
	
}
	 