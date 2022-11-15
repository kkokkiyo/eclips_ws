import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
 
 
public class PsyCircle extends JPanel {
     
    private int sizeX = 0;//the x size of the outside ovals 
    private int sizeY = 0;//the y size of the outside ovals
 
    private static final long serialVersionUID = 3725359877575347978L;
    @Override
    protected void paintComponent (Graphics g){
                 
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
             
            sizeX++;  
            sizeY++; 
             
            try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                repaint();
                                 
                g2d.setColor(Color.BLUE);
                g2d.fillOval(150 - sizeX / 2, 50 - sizeY / 2, sizeX, sizeY);//increase in size 
                
            }
 
        public static void main (String [] arg){
        JFrame  frame = new JFrame("Psychedelic Circle");
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new PsyCircle());
         
      }
    }
    