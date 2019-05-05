package lifeGame;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class FentreGame extends JFrame {
	GridBagLayout gridBag = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	JMenuBar menuBar = new JMenuBar();

	public FentreGame() {
		this.setTitle("Jeu de la vie");
		this.setSize(1000, 1000);
		this.setLocationRelativeTo(null);
		int ord = 60;
		int abs = ord;
		int total = ord * abs;
		this.getContentPane().setLayout(gridBag);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		initMenuBar();
		/*Border blackline = BorderFactory.createLineBorder(Color.black, 1);
		for (int i = 0; i < ord; i++) {
			for (int j = 0; j < abs; j++) {
				JPanel item = new JPanel();
				item.setBorder(blackline);
				int rest = i % 2;
				if (rest == 0) {
					item.setBackground(Color.blue);
				} else {jj
					item.setBackground(Color.white);
				}
				gbc.gridx = i;
				gbc.gridy = j;
				getContentPane().add(item, gbc);
			}
		}*/
		this.setVisible(true);
	}
	
	private void initMenuBar() {
		JMenu menuFile = new JMenu("File");
		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menuFile.add(exit);
		menuBar.add(menuFile);
		
		JMenu menuGame = new JMenu("Game");	
		JMenuItem play = new JMenuItem("Play");
		menuGame.add(play);
		JMenuItem stop = new JMenuItem("Stop");
		menuGame.add(stop);
		menuBar.add(menuGame);
		
		setJMenuBar(menuBar);
	}
}