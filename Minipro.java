package New;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JList;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JLabel;
//import net.miginfocom.swing.MigLayout;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Color;

public class Minipro implements ActionListener {

	private JFrame frame;
	Doctor dr[][];
	User ur[];
	int area;
	int doc;
	
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public Minipro(Doctor dr[][]) {
		initialize(dr);
		
	}

	JButton btnNewButton,btnNewButton_1,btnNewButton_2;
	private JSeparator separator;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	
	private void initialize(Doctor dr[][]) {
		
		Getdata getdata=new Getdata(dr);
		User us[]=new User[40];
		for(int i=0;i<40;i++) {
			us[i]=new User();
		}
		Getuserdata getuserdata=new Getuserdata(us); 
		System.out.println(us[1].getAddress());
		this.dr=dr;
		this.ur=us;
		
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("CheckBox.light"));
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnNewButton = new JButton("Clinic Regestration");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(303, 72, 129, 148);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		btnNewButton_1 = new JButton("User Login");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.setBounds(62, 72, 175, 64);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);
		
		btnNewButton_2 = new JButton("Create User Account");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_2.setBounds(62, 156, 175, 64);
		frame.getContentPane().add(btnNewButton_2);
		
		separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(270, 37, 2, 190);
		frame.getContentPane().add(separator);
		
		lblNewLabel = new JLabel("Register Your Clinic");
		lblNewLabel.setForeground(new Color(128, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel.setBounds(310, 37, 129, 25);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Book An Appointment");
		lblNewLabel_1.setBackground(SystemColor.windowText);
		lblNewLabel_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel_1.setBounds(65, 37, 175, 23);
		frame.getContentPane().add(lblNewLabel_1);
		btnNewButton_2.addActionListener(this);
		
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnNewButton) {
			frame.dispose();
			Details Details=new Details(dr);
		}
		if(e.getSource()==btnNewButton_1) {
			frame.dispose();
			Login login = new Login(dr,ur);
		}
		if(e.getSource()==btnNewButton_2) {
			frame.dispose();
			UserDetails UserDetails = new UserDetails(area,dr,ur);
			
		}
	}
}