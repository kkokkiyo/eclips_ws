
public class Controller {
	public void control(Model m, ViewIn in, ViewOut out) {
		double won = in.getData("원금을 입력하세요");
		double month = in.getData("투자 기간을 입력하세요");
		double period = in.getData("이자율을 입력하세요") / 100;
		double total = m.calculator((int)won, (int)month, period);
		out.showBankService(total);
	}
}
