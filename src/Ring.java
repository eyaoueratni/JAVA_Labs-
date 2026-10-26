
import java.awt.Color;
import java.awt.Graphics2D;

/*
 * This class defines an Olympic ring that can be drawn.
 */

public class Ring {

    // Instance variables: each ring has a color and an x- and y-coordinate.
    Color color;
    int xcoord, ycoord;

    /*
     * Method: paint
     * Draws a single ring as an oval in a specific color.
     */
    public void paint(Graphics2D g) {
        g.setColor(color);
        g.drawOval(xcoord, ycoord, 120, 120);
    }

    /*
     * Method: setColor
     * Changes the color of the ring
     */
    public void setColor(Color col) {
        color = col;
    }

    /*
     * Method: setPosition
     * Changes the position of the ring.
     */
    public void setPosition(int x, int y) {
        xcoord = x;
        ycoord = y;
    }
}