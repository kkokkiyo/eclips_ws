
public class Model {
	public double calculator(int won, int month, double rate) {
		return won * Math.pow(1 + rate, month);
	}
}
