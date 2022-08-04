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
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JTable;

public class UserDetails implements ActionListener{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_4;
	JButton btnNewButton,btnNewButton_1;

	Doctor dr[][];
	private JTextField textField_7;
	private JTextField textField_1;
	JComboBox comboBox_1 ;
	JTextArea textArea ;
	User ur[];
	User demo ;
	private JTextField textField_2;
	
	public UserDetails(int area, Doctor dr[][], User ur[]) {
		
		this.dr=dr;
		this.ur=ur;
		
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame.setVisible(true);
		frame.setBounds(100, 100, 500, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Details");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(194, 2, 140, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 1, 101, 22);
		frame.getContentPane().add(menuBar);
		
		btnNewButton = new JButton("HOME");
		menuBar.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		textField = new JTextField();
		textField.setBounds(84, 30, 356, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(10, 33, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_5 = new JLabel("Contact");
		lblNewLabel_5.setBounds(10, 93, 45, 13);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(84, 90, 115, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setBounds(209, 93, 45, 13);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(244, 90, 196, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBounds(84, 120, 356, 52);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel_7 = new JLabel("Address");
		lblNewLabel_7.setBounds(10, 126, 75, 13);
		frame.getContentPane().add(lblNewLabel_7);
		
		textField_7 = new JTextField();
		textField_7.setBounds(130, 185, 192, 19);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(84, 60, 65, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"MALE", "FEMALE", "OTHER"}));
		comboBox_1.setBounds(244, 60, 65, 21);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("Age");
		lblNewLabel_2.setBounds(20, 63, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Sex");
		lblNewLabel_4.setBounds(209, 63, 45, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_8 = new JLabel(" Create username");
		lblNewLabel_8.setBounds(10, 188, 140, 13);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel(" Create Password");
		lblNewLabel_9.setBounds(10, 217, 140, 13);
		frame.getContentPane().add(lblNewLabel_9);
		
		btnNewButton_1 = new JButton("SUBMIT");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(84, 250, 356, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(130, 214, 192, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		btnNewButton_1.addActionListener(this);

		
		
		
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
		if(e.getSource()==btnNewButton) {
			frame.dispose();
			Minipro minipro=new Minipro(dr);
			
		}
		
		if(e.getSource()==btnNewButton_1) {
			getvalue();
			if(empty()==true) {
				frame.dispose();
				insert();
				Minipro minipro=new Minipro(dr);
			}
			else {
				Error error=new Error();
			}			
		}
		
	}
	
	private void getvalue() {
		demo = new User();
		try {
			demo.setName(textField.getText());
			demo.setAge(Integer.parseInt(textField_1.getText()));
			demo.setSex((String) comboBox_1.getItemAt(comboBox_1.getSelectedIndex()));
			demo.setContact(Integer.parseInt(textField_3.getText()));
			demo.setEmail(textField_4.getText());
			demo.setAddress(textArea.getText());
			demo.setUsername(textField_7.getText());
			demo.setPassword(textField_2.getText());
			
		}catch(Exception e) {
			
		}
		
	}
	
	private boolean empty() {
		if(demo.getName() ==null) {
			return false;
		}
		else if(demo.getAge() ==0) {
			return false;
		}
		else if(demo.getSex() ==null) {
			return false;
		}
		else if(demo.getContact() ==0) {
			return false;
		}
		else if(demo.getEmail() ==null) {
			return false;
		}
		else if(demo.getAddress() ==null) {
			return false;
		}
		else if(demo.getUsername() ==null) {
			return false;
		}
		else if(demo.getPassword() ==null) {
			return false;
		}
		else {
			return true;
		}	
	}
	
	private void insert() {
		for(int i=0;i<5;i++) {
			if(ur[i].getName()==null) {
				
				System.out.println();
				demo.setIndex(i);
				Setuserdata setuserdata=new Setuserdata(demo);
				break;
			}
		}
	}
	
}
