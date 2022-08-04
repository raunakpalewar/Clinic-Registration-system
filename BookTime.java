package New;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;



public class BookTime implements ActionListener {

	private JFrame frame;
	Doctor dr[][];
	int area;
	
	int s=35;
	JLabel lblNewLabel[] = new JLabel[s];
	JTextField textField[] = new JTextField[lblNewLabel.length];
	JButton btnNewButton[] = new JButton[lblNewLabel.length];
	int siz[]=new int[lblNewLabel.length];
	Date d1,d2;
	JButton btnNewButton_0,btnNewButton_1;
	
	public BookTime(int area,int doc,Doctor dr[][]) {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 101, 22);
		frame.getContentPane().add(menuBar);
		
		btnNewButton_0 = new JButton("HOME");
		menuBar.add(btnNewButton_0);
		btnNewButton_0.addActionListener(this);
		
		JLabel lblNewLabel_0 = new JLabel("Book a Slot");
		lblNewLabel_0.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_0.setBounds(189, 0, 101, 13);
		frame.getContentPane().add(lblNewLabel_0);
		
		JLabel lblNewLabel_1 = new JLabel("Clinic:"+dr[area][doc].getCname());
		lblNewLabel_1.setBounds(10, 32, 150, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Do.:"+dr[area][doc].getDname());
		lblNewLabel_2.setBounds(170, 32, 150, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Specality:"+dr[area][doc].getSpeciality());
		lblNewLabel_3.setBounds(330, 32, 146, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(20, 57, 100, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Contact:"+dr[area][doc].getMobile());
		lblNewLabel_5.setBounds(120, 57, 200, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Email:"+dr[area][doc].getEmail());
		lblNewLabel_6.setBounds(280, 57, 250, 15);
		frame.getContentPane().add(lblNewLabel_6);
		
		JTextArea textArea = new JTextArea(dr[area][doc].getAddress());
		textArea.setEditable(false);
		textArea.setBounds(20, 82, 456, 44);
		frame.getContentPane().add(textArea);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 136, 466, 117);
		frame.getContentPane().add(scrollPane);

		
		
		String t1="08:00 ", t2="12:00 ";
		DateFormat sdf = new SimpleDateFormat("hh:mm ");
		try {
			d1 = sdf.parse(t1);
			d2 = sdf.parse(t2);
			
		
			 System.out.println("Time: " + sdf.format(d1));
			 
		}catch (Exception  e) {
			
		}
		

		for(int i=0;i<siz.length;i++) {
			siz[i]=20;
		}
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{80, 200, 146, 0};
		gbl_panel.rowHeights = siz;
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.setBounds(391, 0, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);
		
		GridBagConstraints gbc_1[] = new GridBagConstraints[lblNewLabel.length];
		GridBagConstraints gbc_2[] = new GridBagConstraints[lblNewLabel.length];
		GridBagConstraints gbc_3[] = new GridBagConstraints[lblNewLabel.length];
		String flag="am";
		for(int i=0;i<lblNewLabel.length;i++) {
			 try {
				 long x=d1.getTime();
					Date d=new Date(x+(20*60*1000*i));
				if(true) {
					if(i==11) {
				    	flag="pm";
				    }
				
			lblNewLabel[i] = new JLabel(sdf.format(d)+flag);
			gbc_1[i] = new GridBagConstraints();
			gbc_1[i].fill = GridBagConstraints.BOTH;
			gbc_1[i].insets = new Insets(0, 0, 5, 5);
			gbc_1[i].gridx = 0;
			gbc_1[i].gridy = i;
			panel.add(lblNewLabel[i], gbc_1[i]);
			
		   
			
			
			textField[i] = new JTextField();
			textField[i].setEditable(false);
			gbc_2[i] = new GridBagConstraints();
			gbc_2[i].anchor = GridBagConstraints.SOUTH;
			gbc_2[i].fill = GridBagConstraints.HORIZONTAL;
			gbc_2[i].insets = new Insets(0, 0, 5, 5);
			gbc_2[i].gridx = 1;
			gbc_2[i].gridy = i;
			panel.add(textField[i], gbc_2[i]);
			textField[i].setColumns(10);
			
			btnNewButton[i] = new JButton("New button");
			gbc_3[i] = new GridBagConstraints();
			gbc_3[i].fill = GridBagConstraints.HORIZONTAL;
			gbc_3[i].insets = new Insets(0, 0, 5, 0);
			gbc_3[i].gridx = 2;
			gbc_3[i].gridy = i;
			panel.add(btnNewButton[i], gbc_3[i]);
			btnNewButton[i].addActionListener(this);
			
			}
			
			}catch (Exception  e) {}
		}
		this.dr=dr;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<lblNewLabel.length;i++) {
			if(e.getSource()==btnNewButton[i]) {
				textField[i].setText("Booked");				
			}		
		}
		if(e.getSource()==btnNewButton_0) {
			Minipro minipro=new Minipro(dr);
			frame.dispose();
		}
		if(e.getSource()==btnNewButton_1) {
			frame.dispose();
		}
		
	}
}
