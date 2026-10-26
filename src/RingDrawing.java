import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * This class defines the drawing of olympic rings.
 * 5 rings are created. Each ring in a specific colour at a specific position.
 * When the paint-Method is called, the rings get drawn.
 */
public class RingDrawing extends Canvas {

    // Instance variables for the 5 rings
    Ring r1, r2, r3, r4, r5;

    /**
     * Creates the rings of a ring drawing
     */
    public RingDrawing() {
        r1 = new Ring();
        r1.setColor(Color.black);
        r1.setPosition(80, 30);

        r2 = new Ring();
        r2.setColor(Color.red);
        r2.setPosition(160, 30);

        r3 = new Ring();
        r3.setColor(Color.blue);
        r3.setPosition(240, 30);

        r4 = new Ring();
        r4.setColor(Color.yellow);
        r4.setPosition(120, 90);

        r5 = new Ring();
        r5.setColor(Color.green);
        r5.setPosition(200,90);
    }

    /**
     * Draws the rings on a graphics object.
     */
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(10));
        r1.paint(g2);
        r2.paint(g2);
        r3.paint(g2);
        r4.paint(g2);
        r5.paint(g2);
        g2.setColor(Color.black);
        g2.setFont(new Font("Universal", Font.BOLD, 18));
        g2.drawString("Olympics 2028" , 160, 260);
    }

}