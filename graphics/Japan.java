package graphics;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JFrame;


public class Japan extends Canvas {

    public void boxOval(Graphics g, Rectangle bb) {
	    g.fillOval(bb.x, bb.y, bb.width, bb.height);
    }

    public void mickey(Graphics g, Rectangle bb) {
	    boxOval(g, bb);
    }

    public void paint(Graphics g) {
        Rectangle bb = new Rectangle(100, 100, 200, 200);
        g.setColor(Color.red);
        mickey(g, bb);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Canvas canvas = new Japan();
        canvas.setSize(400, 400);
	    canvas.setBackground(Color.white);
        frame.getContentPane().add(canvas);
	    frame.pack();
        frame.setVisible(true);
    }
}