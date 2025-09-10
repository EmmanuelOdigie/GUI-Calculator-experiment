package JavaSimpleCalculator; // project made on eclipse

// imported class from windowBuilder, using application window

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleCalculator {

	private JFrame frame;
	private JTextField textFieldNumber1;
	private JTextField textFieldNumber2;
	private JTextField txtFieldResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculator window = new SimpleCalculator();
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
	public SimpleCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.setBounds(100, 100, 576, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNumber1 = new JTextField();
		textFieldNumber1.setBounds(94, 78, 172, 39);
		frame.getContentPane().add(textFieldNumber1);
		textFieldNumber1.setColumns(10);
		
		JLabel lblLabelCalculator = new JLabel("Calculator");
		lblLabelCalculator.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblLabelCalculator.setBackground(new Color(255, 255, 255));
		lblLabelCalculator.setForeground(new Color(0, 0, 0));
		lblLabelCalculator.setBounds(249, 23, 97, 26);
		frame.getContentPane().add(lblLabelCalculator);
		
		JButton btnAddButton = new JButton("+");
		btnAddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int firstNum; // declaring variable
				int secondNum; // declaring variable
				int result; // declaring variable
				
				try {
					firstNum = Integer.parseInt(textFieldNumber1.getText()); // converting integer into String(txt) by parseInt to be put into the textFieldNumber1 box
					// by calling '.getText()'
					
					secondNum = Integer.parseInt(textFieldNumber2.getText()); // converting integer into String(txt) by parseInt to be put into the textFieldNumber2 box
					// by calling '.getText()'
				
					result = firstNum + secondNum; // equation set to add numbers
					
					//JOptionPane.showMessageDialog(null, result);
					
					txtFieldResult.setText(Integer.toString(result)); // txtFieldResult.setText is used to keep text so it can be used by the get function
					//(Integer.toString(result)) is used to convert the integer value (result) to (String)txt
					
					
				}catch (Exception e) {
					JOptionPane.showInternalMessageDialog(null, "Error invalid operation, please try again"); // if there's an error in the users input display text
				}
			}
		});
		btnAddButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAddButton.setBounds(165, 211, 89, 26);
		frame.getContentPane().add(btnAddButton);
		
		JButton btnMinusButton = new JButton("-");
		btnMinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				
				int firstNum; // declaring variable
				int secondNum; // declaring variable
				int result;// declaring variable
				
				try {
					firstNum = Integer.parseInt(textFieldNumber1.getText()); // converting integer into String(txt) by parseInt to be put into the textFieldNumber1 box
					// by calling '.getText()'
					secondNum = Integer.parseInt(textFieldNumber2.getText()); // converting integer into String(txt) by parseInt to be put into the textFieldNumber2 box
					// by calling '.getText()'
				
					result = firstNum - secondNum; // equation set to minus numbers
					
					//JOptionPane.showMessageDialog(null, result);
					
					txtFieldResult.setText(Integer.toString(result)); // txtFieldResult.setText is used to keep text so it can be used by the get function
					//(Integer.toString(result)) is used to convert the integer value (result) to (String)txt
					
					
				}catch (Exception e) {
					JOptionPane.showInternalMessageDialog(null, "Error invalid operation, please try again"); // if there's an error in the users input display text
				}
			}
		});
		btnMinusButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnMinusButton.setBounds(294, 211, 89, 26);
		frame.getContentPane().add(btnMinusButton);
		
		textFieldNumber2 = new JTextField();
		textFieldNumber2.setBounds(294, 78, 172, 39);
		frame.getContentPane().add(textFieldNumber2);
		textFieldNumber2.setColumns(10);
		
		txtFieldResult = new JTextField();
		txtFieldResult.setBounds(214, 149, 132, 39);
		frame.getContentPane().add(txtFieldResult);
		txtFieldResult.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("=");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(179, 153, 35, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnDivideButton = new JButton("÷");
		btnDivideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				
				int firstNum; // declaring variable
				int secondNum; // declaring variable
				int result; // // declaring variable
				
				try {
					firstNum = Integer.parseInt(textFieldNumber1.getText()); // converting integer into String(txt) by parseInt to be put into the textFieldNumber1 box
					// by calling '.getText()'
					secondNum = Integer.parseInt(textFieldNumber2.getText()); // converting integer into String(txt) by parseInt to be put into the textFieldNumber2 box
					// by calling '.getText()'
				
					result = firstNum / secondNum; // equation set to divide numbers
					
					//JOptionPane.showMessageDialog(null, result);
					
					txtFieldResult.setText(Integer.toString(result)); // txtFieldResult.setText is used to keep text so it can be used by the get function
					//(Integer.toString(result)) is used to convert the integer value (result) to (String)txt
					
					
				}catch (Exception e) {
					JOptionPane.showInternalMessageDialog(null, "Error invalid operation, please try again"); // if there's an error in the users input display text
				}
			}
		});
		btnDivideButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDivideButton.setBounds(165, 258, 89, 23);
		frame.getContentPane().add(btnDivideButton);
		
		JButton btnMultiplicationButton = new JButton("X");
		btnMultiplicationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int firstNum; // declaring variable
				int secondNum; // declaring variable
				int result; // declaring variable
				
				try {
					firstNum = Integer.parseInt(textFieldNumber1.getText()); // converting integer into String(txt) by parseInt to be put into the textFieldNumber1 box
					// by calling '.getText()'
					secondNum = Integer.parseInt(textFieldNumber2.getText()); // converting integer into String(txt) by parseInt to be put into the textFieldNumber2 box
					// by calling '.getText()'
				
					result = firstNum * secondNum; // equation set to multiply numbers
					
					//JOptionPane.showMessageDialog(null, result);
					
					txtFieldResult.setText(Integer.toString(result)); // txtFieldResult.setText is used to keep text so it can be used by the get function
					//(Integer.toString(result)) is used to convert the integer value (result) to (String)txt
					
					
				}catch (Exception e) {
					JOptionPane.showInternalMessageDialog(null, "Error invalid operation, please try again"); // if there's an error in the users input display text
				}
			}
		});
		btnMultiplicationButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMultiplicationButton.setBounds(294, 258, 89, 23);
		frame.getContentPane().add(btnMultiplicationButton);
	}
}