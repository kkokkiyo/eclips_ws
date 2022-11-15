import java.util.concurrent.TimeUnit;

public class GameController {

	private GameBoard board;
	private BoardWriter writer;
	private Reader reader;
	private Cell cell;

	public GameController(GameBoard b, BoardWriter w, Reader r, Cell c) {
		board = b;
		writer = w;
		reader = r;
		cell = c;

	}

	public void play() throws InterruptedException {
		Cell[][] square = board.square();
		// to be filled...
		while (board.point() == 0) {
			if (board.point() < 16) {
				int cell1;
				int cell2;
				cell1 = reader.readInput();
				cell.reveal();
				cell2 = reader.readInput();
				if (cell1 != cell2) {
					cell.reveal();
					TimeUnit.SECONDS.sleep(2);
					if (cell.color() == cell.color()) {
						board.upgrade();
					} else {
						cell.hide();
						cell.hide();
					}
				} else {
					cell2 = reader.readInput();
				}

			}

		}
	}

	/** delay - how_long millisecond 동안 실행 정지 */
	private void delay(int how_long) {
		try {
			Thread.sleep(how_long);
		} catch (InterruptedException e) {
		}
	}

}