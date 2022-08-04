package New;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;

public class Booking implements ActionListener {

	private JFrame frame;
	JButton btnNewButton,btnNewButton_1,btnNewButton_2,btnNewButton_3,btnNewButton_4;
	Doctor dr[][];
	private JMenuBar menuBar;
	private JButton btnNewButton_5;
	
	 public Booking(Doctor dr[][]) {
		
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnNewButton = new JButton("Area1");
		btnNewButton.setBounds(28, 67, 128, 49);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		btnNewButton_1 = new JButton("Area2");
		btnNewButton_1.setBounds(177, 67, 128, 49);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);
		
		btnNewButton_2 = new JButton("Area3");
		btnNewButton_2.setBounds(325, 67, 110, 49);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(this);
		
		btnNewButton_3 = new JButton("Area4");
		btnNewButton_3.setBounds(28, 139, 128, 49);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(this);
		
		btnNewButton_4 = new JButton("Area5");
		btnNewButton_4.setBounds(177, 139, 128, 49);
		frame.getContentPane().add(btnNewButton_4);
		btnNewButton_4.addActionListener(this);
		
		JLabel lblNewLabel = new JLabel("Select Area");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(28, 32, 110, 13);
		frame.getContentPane().add(lblNewLabel);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 101, 22);
		frame.getContentPane().add(menuBar);
		
		btnNewButton_5 = new JButton("HOME");
		menuBar.add(btnNewButton_5);
		btnNewButton_5.addActionListener(this);
	
		this.dr=dr;
	 }
	 
	 
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnNewButton_5) {
			frame.dispose();	
			Minipro minipro=new Minipro(dr);
					
		}
		if(e.getSource()==btnNewButton) {
			frame.dispose();
			DocList docList = new DocList(0,dr);
			
		}
		if(e.getSource()==btnNewButton_1) {
			frame.dispose();
			DocList docList = new DocList(1,dr);
			
			
		}
		if(e.getSource()==btnNewButton_2) {
			frame.dispose();
			DocList docList = new DocList(2,dr);
			
			
		}
		if(e.getSource()==btnNewButton_3) {
			frame.dispose();
			DocList docList = new DocList(3,dr);
			
			
		}
		if(e.getSource()==btnNewButton_4) {
			frame.dispose();
			DocList docList = new DocList(4,dr);
			
			
		}
		
		
	}
}