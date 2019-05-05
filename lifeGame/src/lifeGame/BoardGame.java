package lifeGame;

public class BoardGame {

	int cellAlive;
	int xSize = 10;
	int ySize = 10;
	boolean[][] cells = new boolean[xSize][ySize];

	public BoardGame() {
	/*	cells[1][1] = true;
		cells[4][1] = true;
		cells[1][4] = true;
		cells[2][1] = true;
		cells[1][2] = true;
		cells[2][2] = true;*/
		
		cells[4][4] = true;
		cells[5][4] = true;
		cells[6][4] = true;
		
	}
	
	public BoardGame(int xSize, int ySize) {

		
		this.xSize = xSize;
		this.ySize = ySize;
		cells = new boolean[xSize][ySize];
		cells[1][1] = true;
		cells[4][1] = true;
		cells[1][4] = true;
		cells[2][1] = true;
		cells[1][2] = true;
		cells[2][2] = true;
		cells[5][5] = true;
		cells[1][2] = true;
		cells[2][2] = true;
		
	}

	public void cycleSuivant() {
		boolean[][] cellsSuivant = new boolean[xSize][ySize];
		for (int i = 0; i < xSize; i++) {
			for (int j = 0; j < ySize; j++) {
				cellsSuivant[i][j] = cellAlive(i, j, cells[i][j]);
			}
		}
		cells = cellsSuivant;
	}

	public Boolean cellAlive(int i, int j, Boolean cAlive) {
		int Nbr = getNbrCellAround(i, j);
		if (cAlive && Nbr >= 2 && Nbr <= 3) {
			return true;
		} else if (!cAlive && Nbr == 3) {
			return true;
		} else {
			return false;
		}
	}

	public int getNbrCellAround(int i, int j) {
		int Nbr = 0;
		for (int x = i - 1; x <= i + 1; x++) {
			for (int y = j - 1; y <= j + 1; y++) {
				if (borderGame(x, y)) {
					if ((x != i) || (y != j)) {
						if (cells[x][y]) {
							Nbr++;
						}
					}
				}
			}
		}
		return Nbr;
	}

	public Boolean borderGame(int x, int y) {
		if (x < 0 || y < 0 || x > xSize - 1 || y > ySize - 1) {
			return false;
		} else {
			return true;
		}

	}

	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i < xSize; i++) {
			result += "|";
			for (int j = 0; j < ySize; j++) {
				if (cells[i][j] == true)
					result += " O |";
				else
					result += "   |";
			}
			result += "\n";
		}
		return result;
	}
}
