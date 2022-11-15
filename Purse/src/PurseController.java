
public class PurseController {
	private PurseReader reader;
	private PurseWriter writer;
	private Purse purse;

	public PurseController(PurseReader r, PurseWriter w, Purse p) {
		reader = r;
		writer = w;
		purse = p;
	}

	public void processTransactions() {
		String message = "+,-,Q 키 중 하나를 누르고 OK 단추를 누르세요.\n 수입 +, 지출 -, 종료 Q";
		char request = reader.readRequest(message);
		message = "금액을 입력하고 OK 단추를 누르세요.";
		int amount;
		if (request == 'Q' || request == 'q') {
			writer.showTransaction("서비스를 마칩니다.");
			return;
		} else if (request == '+') {
			amount = reader.readAmount(message);
			if (purse.earn(amount))
				writer.showTransaction(amount, "수입");
			else
				writer.showTransaction("수입 실패");
		} else if (request == '-') {
			amount = reader.readAmount(message);
			if (purse.spend(amount))
				writer.showTransaction(amount, "지출");
			else
				writer.showTransaction("지출 실패");
		} else
			writer.showTransaction("요청 오류");
		this.processTransactions();
	}
}