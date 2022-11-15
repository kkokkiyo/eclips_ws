
public class PurseManager {
	public static void main(String[] args) {
		PurseReader r = new PurseReader();
		Purse p = new Purse();
		PurseWriter w = new PurseWriter("에리카", 300, 0, p);
		new PurseController(r, w, p).processTransactions();
	}
}