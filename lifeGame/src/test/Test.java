package test;

import lifeGame.*;

public class Test {
	public static void main(String[] args) {
		
		//Fenetre fenetre = new Fenetre();
		System.out.println("Test" );
		int x = 15;
		int y = 15;
		BoardGame bG = new BoardGame(x,y);
		System.out.println("cycle 0:" );
		System.out.println(bG);
		int i=0;
		while(i<10) {
			i++;
			bG.cycleSuivant();
			System.out.println("cycle "+i );
			System.out.println(bG);
		}
	}
}
