import java.time.*;
import javax.swing.*;

public class Clock {
	public static void main(String[] args) {
		System.out.println(LocalTime.now());
		JOptionPane.showMessageDialog(null, LocalTime.now());
	}
}
