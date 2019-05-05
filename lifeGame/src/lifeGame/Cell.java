package lifeGame;

import java.awt.Point;

public class Cell extends Point{

	private static final long serialVersionUID = 8900772578404503053L;
	private Boolean life;

	public Cell(int x, int y, Boolean life) {
		super(x, y);
		this.setLife(life);
	}

	public Boolean getLife() {
		return life;
	}

	public void setLife(Boolean life) {
		this.life = life;
	}

}
