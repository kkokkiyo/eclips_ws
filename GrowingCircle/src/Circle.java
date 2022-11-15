// This applet displays a growing circle on a canvas.
// It uses a thread in order to slow down the display
// of the consecutive circles.
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

@SuppressWarnings({ "serial", "unused", "removal" })
public class Circle extends Applet
{
    Canvas page;
    CircleThread blue_circle;
    point blue_center;

    public void init ()
    {
        page =new Canvas ();
        page.setSize (300, 300);
        page.setBackground (Color.cyan);
        add (page);
        blue_center = new point (160, 100);
        blue_circle = new CircleThread (page, Color.blue, blue_center);
        blue_circle.start ();
    }

} // class threads

class CircleThread extends Thread
{
    private Graphics g;
    private Color color;
    private circle first, second;
    private point center;
    private int radius;

    CircleThread (Canvas page, Color color, point center)
    {
        this.center = center;
        radius = 1;
        this.color = color;
        first = new circle (center, radius);
        g = page.getGraphics ();
    }

    public void run ()
    {
        for (int i = 0; i < 50; i ++)
        {
            g.setColor (Color.cyan);
            first.drawCircle (g);
            second = new circle (center, i);
            g.setColor (color);
            second.drawCircle (g);
            try
            {sleep (100);
            } catch (InterruptedException e) {}
            first = second;
        }
    }

} // CircleThread

class point
{
    private int x, y;

    point (int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    int get_x ()
    {return x;}

    int get_y ()
    {return y;}

    void set_xy (int x, int y)
    {
        this.x = x;
        this.y = y;
    }

} // class point

class circle
{
    private point center;
    private int radius;

    circle (point center, int radius)
    {
        this.center = center;
        this.radius = radius;
    }

    public void drawCircle (Graphics page)
    {
        int x, y;
        x = center.get_x ();
        y = center.get_y ();
        page.drawOval (x-radius, y-radius, 2*radius, 2*radius);
    }

} // class circle