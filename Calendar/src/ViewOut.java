import javax.swing.*;
import java.time.*;

public class ViewOut {
	//문제 1
	public void showDate_today(LocalDate d, String message) {
		int year = d.getYear();
		int month = d.getMonthValue();
		int day = d.getDayOfMonth();
		JOptionPane.showMessageDialog(null, "오늘부터 100일 뒤는" + year + "년" + month + "월" + day + "일 입니다");
	}
	//문제 2
	public void showDate(LocalDate d100, String message) {
		int year = d100.getYear();
		int month = d100.getMonthValue();
		int day = d100.getDayOfMonth();
		JOptionPane.showMessageDialog(null, "입력받은 날짜로부터 100일 뒤는" + year + "년" + month + "월" + day + "일 입니다");
	}
}
