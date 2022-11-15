import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ViewOut {
	public void showBankService(double total) {
		DecimalFormat f = new DecimalFormat("0");
		JOptionPane.showMessageDialog(null, f.format(total));
	}
}
