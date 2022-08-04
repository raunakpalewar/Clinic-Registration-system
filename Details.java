package New;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.AbstractListModel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class Details implements ActionListener{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;
	JButton btnNewButton,btnNewButton_1;

	Doctor dr[][],demo;
	private JTextField textField_7;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextArea textArea;
	JComboBox comboBox;
	
	public Details(Doctor dr[][]) {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 500, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Details");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(207, 2, 88, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 1, 101, 22);
		frame.getContentPane().add(menuBar);
		
		btnNewButton = new JButton("HOME");
		menuBar.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		textField = new JTextField();
		textField.setBounds(84, 30, 140, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Clinic Name");
		lblNewLabel_1.setBounds(10, 33, 75, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Speciality");
		lblNewLabel_2.setBounds(240, 64, 66, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(300, 30, 140, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Area1", "Area2", "Area3", "Area4", "Area5"}));
		comboBox.setBounds(84, 60, 140, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Select Area");
		lblNewLabel_3.setBounds(10, 60, 75, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Degree");
		lblNewLabel_4.setBounds(250, 92, 45, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(300, 61, 140, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Contact");
		lblNewLabel_5.setBounds(10, 93, 45, 13);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(84, 90, 140, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setBounds(10, 203, 45, 13);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(84, 200, 140, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBounds(84, 120, 356, 40);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel_7 = new JLabel("Address");
		lblNewLabel_7.setBounds(10, 120, 75, 13);
		frame.getContentPane().add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setBounds(84, 170, 60, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(164, 170, 60, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Open/Close");
		lblNewLabel_9.setBounds(10, 173, 75, 13);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Break");
		lblNewLabel_10.setBounds(242, 173, 53, 13);
		frame.getContentPane().add(lblNewLabel_10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(380, 170, 60, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(300, 170, 60, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("To");
		lblNewLabel_11.setBounds(365, 173, 17, 13);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("To");
		lblNewLabel_12.setBounds(146, 173, 17, 13);
		frame.getContentPane().add(lblNewLabel_12);
		
		btnNewButton_1 = new JButton("SUBMIT");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(84, 291, 356, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		textField_7 = new JTextField();
		textField_7.setBounds(300, 261, 140, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Login Details");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_14.setBounds(84, 230, 153, 21);
		frame.getContentPane().add(lblNewLabel_14);
		
		textField_10 = new JTextField();
		textField_10.setBounds(84, 261, 140, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Password");
		lblNewLabel_15.setBounds(240, 264, 75, 13);
		frame.getContentPane().add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Username");
		lblNewLabel_16.setBounds(10, 264, 75, 13);
		frame.getContentPane().add(lblNewLabel_16);
		
		textField_11 = new JTextField();
		textField_11.setBounds(300, 90, 140, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Dr. Name");
		lblNewLabel_17.setBounds(234, 33, 88, 13);
		frame.getContentPane().add(lblNewLabel_17);
		btnNewButton_1.addActionListener(this);
		this.dr=dr;
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		demo=new Doctor();
		if(e.getSource()==btnNewButton) {
			frame.dispose();
			Minipro minipro=new Minipro(dr);
			
		}
		if(e.getSource()==btnNewButton_1) {
			getvalue();
			if(empty()==true) {
				insert();
				Minipro minipro=new Minipro(dr);
				frame.dispose();
			}
			else {
				Error error=new Error();
			}
			
		}
		
	}
	
	private void getvalue() {
		try {
		demo.setCname(textField.getText());
		demo.setDname(textField_1.getText());
		demo.setSpeciality(textField_2.getText());
		demo.setMobile(Integer.parseInt(textField_3.getText()));
		demo.setDegree(textField_11.getText());
		demo.setAddress(textArea.getText());
		demo.setEmail(textField_4.getText());
		demo.setArea(comboBox.getSelectedIndex()+1);
		demo.setOpen(textField_5.getText());
		demo.setClose(textField_6.getText());
		demo.setBstart(textField_9.getText());
		demo.setBend(textField_8.getText());
		demo.setUsername(textField_10.getText());
		demo.setPassword(textField_7.getText());
		}	
		catch(Exception e){	
		}		
	}
	
	private boolean empty() {
		if(demo.getCname() ==null) {
			return false;
		}
		else if(demo.getDname() ==null) {
			return false;
		}
		else if(demo.getSpeciality() ==null) {
			return false;
		}
		else if(demo.getMobile() ==0) {
			return false;
		}
		else if(demo.getDegree() ==null) {
			return false;
		}
		else if(demo.getAddress() ==null) {
			return false;
		}
		else if(demo.getEmail() ==null) {
			return false;
		}
		else if(demo.getBstart() ==null) {
			return false;
		}
		else if(demo.getBend() ==null) {
			return false;
		}
		else if(demo.getOpen() ==null) {
			return false;
		}
		else if(demo.getClose() ==null) {
			return false;
		}
		else if(demo.getUsername() ==null) {
			return false;
		}
		else if(demo.getPassword() ==null) {
			return false;
		}
		else
			return true;
	}
	
	private void insert() {
		for(int i=0;i<5;i++) {
			if(dr[comboBox.getSelectedIndex()][i].getCname()==null) {
				
				System.out.println(comboBox.getSelectedIndex());
				demo.setRegestrationNumber(i);
				Setdata setdata = new Setdata(demo);
				break;
			}
		}
	}
	
}
