package New;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Error implements ActionListener {

	private JFrame frame;

	

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public Error() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(200, 200, 225, 120);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FIELD IS EMPTY !!!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(50, 10, 120, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(60, 53, 85, 20);
		frame.getContentPane().add(btnNewButton);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		frame.dispose();
		
	}
}
