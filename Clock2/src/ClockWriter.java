import javax.swing.*;
import java.awt.*;
import java.time.*;

@SuppressWarnings("serial")
public class ClockWriter extends JPanel {

	private final int SIZE;

	public ClockWriter(int n) {
		SIZE = n;
		JFrame frame = new JFrame();
		frame.setTitle("Clock");
		frame.setSize(SIZE + 50, SIZE + 150);
		frame.getContentPane().add(this);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawString("TIME IS GOLD", 105, 50);
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(25, 100, SIZE, SIZE);
		// 현재시간 알아보기
		LocalTime now = LocalTime.now();
		int sec = now.getSecond();

		// 시계 중심
		int radius = SIZE / 2;
		int x1 = 25 + radius;
		int y1 = 100 + radius;
		// 시간에 따라 커지는 동심원

		g.setColor(Color.pink);
		int circle_sec = sec * (SIZE / 2) / 60;
		g.fillOval(x1 - circle_sec, y1 - circle_sec, 2 * circle_sec, 2 * circle_sec);

		// 분침 그리기
		radius -= 30;
		double minute_angle = (now.getMinute() - 15) * Math.PI / 30;
		int x2 = x1 + (int) (radius * Math.cos(minute_angle));
		int y2 = y1 + (int) (radius * Math.sin(minute_angle));
		g.setColor(Color.RED);
		g.drawLine(x1, y1, x2, y2);
		// 시침 그리기
		radius -= 30;
		double hour_angle = (now.getHour() - 3) * Math.PI / 6 + minute_angle / 12;
		x2 = x1 + (int) (radius * Math.cos(hour_angle));
		y2 = y1 + (int) (radius * Math.sin(hour_angle));
		g.setColor(Color.darkGray);
		g.drawLine(x1, y1, x2, y2);
		// 시계 디자인 간단하게 숫자만
		g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
		g.drawString("12", 135, 120);
		g.drawString("3", 250, 235);
		g.drawString(" 6", 135, 350);
		g.drawString("9", 30, 235);

	}

	// test code
	public static void main(String[] args) {

		new ClockWriter(250);

	}
}