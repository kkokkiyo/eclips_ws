import javax.swing.*;
import java.time.*;

public class ViewIn {
	public LocalDate getDate(String message) {
		String message1 ="년을 입력하세요";
        String message2 ="월을 입력하세요";
        String message3 ="일을 입력하세요";

        String input_year = JOptionPane.showInputDialog(message1);
        int year = Integer.parseInt(input_year);
        String input_month = JOptionPane.showInputDialog(message2);
        int month = Integer.parseInt(input_month);
        String input_day = JOptionPane.showInputDialog(message3);
        int day = Integer.parseInt(input_day);
        LocalDate d0 = LocalDate.of(year, month, day);
        return d0;
	}
}
