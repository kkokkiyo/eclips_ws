import java.text.*;
import javax.swing.*;

public class ViewOut {
	
	public void show(int radius, double area) {
		DecimalFormat formatter = new DecimalFormat("0.00");
		JOptionPane.showMessageDialog(null, "반지름이 " + radius + "인 원의 면적은 ");
		JOptionPane.showMessageDialog(null, formatter.format(area) + " 입니다.");
	}
	
}
