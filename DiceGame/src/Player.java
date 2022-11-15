
public class Player {

	private String name;
	private int points;
	private Dice rolled;
	private boolean wins;

	public String name() {
		return name;
	}

	public int points() {
		return points;
	}

	public Dice rolled() {
		return rolled;
	}

	public boolean wins() {
		return wins;
	}

	public Player(String n) {
		name = n;
	}

	public void play(Dice d) {
		d.rollDice();
		rolled = d;
	}

	public void receivePoint() {
		points += 1;
		wins = true;
	}

	public void reset() {
		wins = false;
	}

}