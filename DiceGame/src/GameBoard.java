import javax.swing.*;
import java.awt.*;


@SuppressWarnings("serial")
public class GameBoard extends JPanel {

	public Player Player1;
	public Player Player2;

	public GameBoard(Player p1, Player p2) {
		Player1 = p1;
		Player2 = p2;
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setTitle("주사위 게임");
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 500, 500);
		g.setColor(Color.BLACK);
		g.drawString(Player1.name(), 40, 100);
		g.drawString(Player2.name(), 140, 100);

		g.drawString(String.valueOf(Player1.points()), 40, 200);
		g.drawString(String.valueOf(Player2.points()), 140, 200);
		
		
		if (Player1.wins() == true) {
			g.drawString("이겼다!!", 40,250);
		} else if (Player2.wins() == true) {
			g.drawString("이겼다!!", 140, 250);
		} else {
			g.drawString("비겼다!", 90, 250);
		}
		
		int p1f1 = Player1.rolled().face1();
		int p1f2 = Player1.rolled().face2();
		
		int p2f1 = Player2.rolled().face1();
		int p2f2 = Player2.rolled().face2();
		
		g.drawString(String.valueOf(p1f1), 40, 300);
		g.drawString(String.valueOf(p1f2), 70, 300);
		
		g.drawString(String.valueOf(p2f1), 140, 300);
		g.drawString(String.valueOf(p2f2), 170, 300);
		repaint();

	}

}
