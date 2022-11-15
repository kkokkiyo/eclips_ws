
public class Purse {

	private int balance;

	public boolean earn(int amount) {
		if (amount < 0)
			return false;
		else {
			balance += amount;
			return true;
		}
	}

	public boolean spend(int amount) {
		if (amount < 0 || amount > balance)
			return false;
		else {
			balance -= amount;
			return true;
		}
	}

	public int getBalance() {
		return balance;
	}
}