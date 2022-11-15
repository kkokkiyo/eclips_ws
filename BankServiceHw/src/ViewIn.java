import javax.swing.JOptionPane;

public class ViewIn {
	public Double getData(String message) {
		String getdata = JOptionPane.showInputDialog(message);
		double data = Double.parseDouble(getdata);
		return data;
	}
}
