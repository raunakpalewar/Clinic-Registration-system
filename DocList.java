package New;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.Panel;
import javax.swing.JTextPane;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTree;
import javax.swing.JMenuBar;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class DocList implements ActionListener {

	private JFrame frame;
	JButton btnNewButton1; 	
	JButton btnNewButton[]=new JButton[5];
	JTextField txtd[] = new JTextField[btnNewButton.length];
	JTextField txts[] = new JTextField[btnNewButton.length];
	JTextField txtp[] = new JTextField[btnNewButton.length];
	JTextField txte[] = new JTextField[btnNewButton.length];
	JTextArea txtrA[] = new JTextArea[btnNewButton.length];
	int siz[]=new int[btnNewButton.length*3];
	Doctor dr[][];
	int area;

	
	
	public DocList(int area,Doctor dr[][]) {
	
		
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(("Area"+(area+1)));
		lblNewLabel.setBounds(225, 0, 91, 22);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 42, 476, 217);
		frame.getContentPane().add(scrollPane);
		
		for(int i=0;i<btnNewButton.length;i++) {
			siz[i*3]=20;
			siz[1+(i*3)]=20;
			siz[2+(i*3)]=44;
		}
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{140, 140, 140, 0};
		gbl_panel.rowHeights = siz;
		panel.setLayout(gbl_panel);
		
		GridBagConstraints gbc_1[] = new GridBagConstraints[btnNewButton.length];
		GridBagConstraints gbc_2[] = new GridBagConstraints[btnNewButton.length];
		GridBagConstraints gbc_3[] = new GridBagConstraints[btnNewButton.length];
		GridBagConstraints gbc_4[] = new GridBagConstraints[btnNewButton.length];
		GridBagConstraints gbc_5[] = new GridBagConstraints[btnNewButton.length];
		GridBagConstraints gbc_6[] = new GridBagConstraints[btnNewButton.length];
		
		for(int i=0;i<btnNewButton.length;i++) {
		if(dr[area][i].getRegestrationNumber()==i && dr[area][i].getCname()!=null){	
			btnNewButton[i] = new JButton(dr[area][i].getCname());
			btnNewButton[i].addActionListener(this);
			gbc_1[i] = new GridBagConstraints();
			gbc_1[i].fill = GridBagConstraints.HORIZONTAL;
			gbc_1[i].insets = new Insets(0, 0, 5, 5);
			gbc_1[i].gridx = 0;
			gbc_1[i].gridy = (i*3);
			panel.add(btnNewButton[i], gbc_1[i]);
			
			txtd[i] = new JTextField();
			txtd[i].setText(dr[area][i].getDname());
			gbc_2[i] = new GridBagConstraints();
			gbc_2[i].anchor = GridBagConstraints.SOUTH;
			gbc_2[i].fill = GridBagConstraints.HORIZONTAL;
			gbc_2[i].insets = new Insets(0, 0, 5, 5);
			gbc_2[i].gridx = 1;
			gbc_2[i].gridy = (i*3);
			panel.add(txtd[i], gbc_2[i]);
			txtd[i].setColumns(10);
			
			txts[i] = new JTextField();
			txts[i].setText(dr[area][i].getSpeciality());
			gbc_3[i] = new GridBagConstraints();
			gbc_3[i].anchor = GridBagConstraints.SOUTH;
			gbc_3[i].fill = GridBagConstraints.HORIZONTAL;
			gbc_3[i].insets = new Insets(0, 0, 5, 0);
			gbc_3[i].gridx = 2;
			gbc_3[i].gridy = (i*3);
			panel.add(txts[i], gbc_3[i]);
			txts[i].setColumns(10);
			
			txtp[i] = new JTextField();
			txtp[i].setText(Integer.toString((int) dr[area][i].getMobile()));
			gbc_4[i] = new GridBagConstraints();
			gbc_4[i].fill = GridBagConstraints.BOTH;
			gbc_4[i].insets = new Insets(0, 0, 5, 5);
			gbc_4[i].gridx = 1;
			gbc_4[i].gridy = 1+(i*3);
			panel.add(txtp[i], gbc_4[i]);
			txtp[i].setColumns(10);
			
			txte[i] = new JTextField();
			txte[i].setText(dr[area][i].getEmail());
			gbc_5[i] = new GridBagConstraints();
			gbc_5[i].fill = GridBagConstraints.BOTH;
			gbc_5[i].insets = new Insets(0, 0, 5, 0);
			gbc_5[i].gridx = 2;
			gbc_5[i].gridy = 1+(i*3);
			panel.add(txte[i], gbc_5[i]);
			txte[i].setColumns(10);
			
			txtrA[i] = new JTextArea();
			txtrA[i].setText(dr[area][i].getAddress());
			gbc_6[i] = new GridBagConstraints();
			gbc_6[i].fill = GridBagConstraints.BOTH;
			gbc_6[i].insets = new Insets(0, 0, 5, 0);
			gbc_6[i].gridwidth = 2;
			gbc_6[i].gridx = 1;
			gbc_6[i].gridy = 2+(i*3);
			panel.add(txtrA[i], gbc_6[i]);
		}	
		}
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 101, 22);
		frame.getContentPane().add(menuBar);
		
		btnNewButton1 = new JButton("HOME");
		menuBar.add(btnNewButton1);
		btnNewButton1.addActionListener(this);
		
		this.dr=dr;
		this.area=area;
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnNewButton1) {
			Minipro minipro=new Minipro(dr);
			frame.dispose();			
		}
		for(int i=0;i<btnNewButton.length;i++) {
			if(e.getSource()==btnNewButton[i]) {
				BookTime bookTime = new BookTime(area,i,dr);
				frame.dispose();
			}
		}
	}
}