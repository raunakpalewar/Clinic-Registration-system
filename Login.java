package New;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.Box;
import java.awt.Component;
import javax.swing.JMenuBar;
import javax.swing.JList;

public class Login implements ActionListener{

	private JFrame frame;
	private JTextField txtUsername,passwordField;
//	private JPasswordField passwordField;
	JButton btnNewButton,btnNewButton_1;
	Doctor dr[][];
	User ur[];
	int area,doc;
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	public Login(Doctor dr[][], User ur[]) {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setEnabled(false);
		frame.setVisible(true);
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setEnabled(false);
		lblNewLabel.setBounds(43, 10, 102, 34);
		frame.getContentPane().add(lblNewLabel);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(80, 65, 240, 29);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		passwordField = new JTextField();
		passwordField.setBounds(80, 117, 240, 29);
		frame.getContentPane().add(passwordField);
		
		btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(80, 170, 119, 29);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(80, 52, 119, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(80, 104, 113, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		btnNewButton_1 = new JButton("HOME");
		menuBar.add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);
		
		this.dr=dr;
		this.ur=ur;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnNewButton_1) {
			frame.dispose();
			Minipro minipro=new Minipro(dr);
		}
		if(e.getSource()==btnNewButton) {
			
			
//			if(empty()) {
//			System.out.println(passwordField.getText());
//				if(get()==true) {
//					frame.dispose();
//				
//					Booking Booking = new Booking(dr);
//				}
//				else {
//					Invalid invalid = new Invalid();
//				}
//				
//			}
		
			frame.dispose();
			Booking Booking = new Booking(dr);
		}
		
	}
	
	private boolean get() {
		for(int i=0;i<ur.length;i++) {
			try {
			      //  String fff=toString(passwordField.getPassword());
					if( passwordField.getText()==ur[i].getPassword() && txtUsername.getText()== ur[i].getUsername()) {
						return true;
				}
					
				}catch(Exception e) {
			}
		}
		return false;
	}
	private boolean empty() {
		
//		String fff=toString(passwordField.getPassword());
		if(passwordField.getText() ==null) {
			return false;
		}
		if(txtUsername.getText() ==null) {
			return false;
		}
		else
			return true;
	}

}