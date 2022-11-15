
/*
굴린 주사위 한 쌍의 수가 같으면 쌍둥이 라고 한다.
쌍둥이는 쌍둥이가 아닌 경우를 무조건 이긴다.
쌍둥이 끼리는 큰 수가 이기고, 이마저 같으면 비긴다.
둘 다 쌍둥이가 아니면, 수의 합이 크면 이긴다.
수의 합이 같으면, 두 수의 차이가 작으면 이긴다.
두 수의 차이도 같으면 비긴다.
*/

public class Dealer {

	public void dealDiceGame(Player p1, Player p2, GameBoard b, Registrar r) {

		Dice p1Dice = new Dice();
		Dice p2Dice = new Dice();
		int isContinue = 0;

		while (isContinue == 0) {
			isContinue = 1;

			p1.play(p1Dice);
			p2.play(p2Dice);

			if (p1Dice.twin() && p2Dice.twin()) {
				if (p1Dice.sum() > p2Dice.sum()) {
					p1.receivePoint();
				} else if (p1Dice.sum() < p2Dice.sum()) {
					p2.receivePoint();
				}
			} else if (p1Dice.twin() && !p2Dice.twin()) {
				p1.receivePoint();
			} else if (!p1Dice.twin() && p2Dice.twin()) {
				p2.receivePoint();
			} else {
				if (p1Dice.sum() == p2Dice.sum()) {
					if (p1Dice.difference() < p1Dice.difference()) {
						p1.receivePoint();
					} else if (p1Dice.difference() > p1Dice.difference()) {
						p2.receivePoint();
					}

				} else if (p1Dice.sum() > p2Dice.sum()) {
					p1.receivePoint();
				} else {
					p2.receivePoint();
				}
			}

			isContinue = r.wantToContnue();

			p1.reset();
			p2.reset();
		}
		System.exit(0);
	}

}
