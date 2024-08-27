package Calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class Calc {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 480, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(44, 41, 391, 68);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("4\r\n");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(125, 279, 62, 55);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(125, 345, 62, 55);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("0");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBounds(216, 410, 62, 55);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("9");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3.setBounds(299, 213, 62, 55);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("8\r\n");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_4.setBounds(216, 213, 62, 55);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("7\r\n");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_5.setBounds(125, 213, 62, 55);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("5");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6.setBounds(216, 279, 62, 55);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("2\r\n");
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_7.setBounds(216, 345, 62, 55);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("6");
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_8.setBounds(299, 279, 62, 55);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("3");
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_9.setBounds(299, 345, 62, 55);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("÷");
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_10.setBounds(373, 151, 62, 55);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("×");
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_11.setBounds(373, 213, 62, 55);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("–");
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_12.setBounds(373, 279, 62, 55);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("+");
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_13.setBounds(373, 345, 62, 55);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton(".");
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_14.setBounds(299, 410, 62, 55);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("=");
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_15.setBounds(373, 410, 62, 55);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("±");
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_16.setBounds(125, 410, 62, 55);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_18 = new JButton("√");
		btnNewButton_18.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_18.setBounds(44, 213, 62, 55);
		frame.getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("log");
		btnNewButton_19.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_19.setBounds(44, 279, 62, 55);
		frame.getContentPane().add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("ln");
		btnNewButton_20.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_20.setBounds(44, 345, 62, 55);
		frame.getContentPane().add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("Del");
		btnNewButton_21.setBackground(new Color(255, 0, 0));
		btnNewButton_21.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_21.setBounds(44, 410, 62, 55);
		frame.getContentPane().add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("(");
		btnNewButton_22.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_22.setBounds(125, 147, 62, 55);
		frame.getContentPane().add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton(")");
		btnNewButton_23.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_23.setBounds(216, 147, 62, 55);
		frame.getContentPane().add(btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("!");
		btnNewButton_24.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_24.setBounds(299, 147, 62, 55);
		frame.getContentPane().add(btnNewButton_24);
		
		JButton btnNewButton_17 = new JButton("%");
		btnNewButton_17.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_17.setBounds(44, 147, 62, 55);
		frame.getContentPane().add(btnNewButton_17);
	}
}
