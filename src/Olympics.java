import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * The class Olympics instantiates the class RingDrawing
 *
 * Because of the use of inheritence (extends) from the class Frame,
 * a windows (frame) is opened at runtime.
 *
 */
public class Olympics extends Frame {

    public Olympics() {
        RingDrawing rz = new RingDrawing();
        add("Center", rz);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setTitle("Olympics 2024");
        setSize(500, 420);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    /*
     * The main method. When the program gets started, this method is called.
     * Thus method creates an object of type Olympics, that gets immediately drawn.
     */
    public static void main(String[] args) {
        new Olympics();
    }


}