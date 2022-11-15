
public class Calendar {
	
	public static void main(String[] args) {
		Model model = new Model();
		ViewIn input = new ViewIn();
		ViewOut output = new ViewOut();
		new Controller().control(model, input, output);
	}
	
}
