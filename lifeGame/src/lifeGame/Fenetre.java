package lifeGame;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Fenetre extends JFrame {

	GridBagLayout gridBag = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();

	public Fenetre() {
		long startTime = System.currentTimeMillis();
		this.setTitle("Jeu de la vie");
		this.setSize(1000, 1000);
		this.setLocationRelativeTo(null);
		int ord = 60;
		int abs = ord;
		int total = ord * abs;
		this.getContentPane().setLayout(gridBag);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Border blackline = BorderFactory.createLineBorder(Color.black, 1);
		for (int i = 0; i < ord; i++) {
			for (int j = 0; j < abs; j++) {
				JPanel item = new JPanel();
				item.setBorder(blackline);
				int rest = i % 2;
				if (rest == 0) {
					item.setBackground(Color.blue);
				} else {
					item.setBackground(Color.white);
				}

				gbc.gridx = i;
				gbc.gridy = j;
				getContentPane().add(item,gbc);
			}
		}
		this.setVisible(true);
		 long endTime = System.currentTimeMillis();
		    System.out.println("Total elapsed time in execution of method callMethod() is :"+ (endTime-startTime));
	}
}