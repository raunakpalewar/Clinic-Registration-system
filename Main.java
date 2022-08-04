package New;

import java.awt.EventQueue;

public class Main {
	public static void main(String[] args) {
		
		Doctor dr[][]=new Doctor[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				dr[i][j]=new Doctor();
			}
		}
		
		
		
		
		Minipro minipro = new Minipro(dr);
		
	}

}