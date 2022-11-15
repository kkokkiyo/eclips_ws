import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class BankService {
	
	public static void main(String[] args) {
		String message = "투자 원금을 원 단위로 입력해주세요.";
		String input = JOptionPane.showInputDialog(message);
		int won  = Integer.parseInt(input);
		String message_1 = "투자 기간을 월 단위로 입력해주세요.";
		String input_1 = JOptionPane.showInputDialog(message_1);
		int period  = Integer.parseInt(input_1);
		String message_2 = "월 수익률을%단위로 입력해주세요.";
		String input_2 = JOptionPane.showInputDialog(message_2);
		double yield  = Double.parseDouble(input_2);
		double compounding_1 = Math.pow(((100 + yield)/100), period);
		double compounding_2 = won*compounding_1;
		DecimalFormat f = new DecimalFormat("0");
		int total = (int)compounding_2;
		JOptionPane.showMessageDialog(null, period + "개월 후 받으실 금액은" + f.format(total) + "원 입니다.");
	}

}
