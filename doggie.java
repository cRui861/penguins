import java.awt.FlowLayout;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * Creates a doggie. The doggie can waggle its tail, talk, or even jump
 */
public class Doggie {

	private static final String DOGGIE_GIF = "./doggie.gif";
	private static final String DOGGIE_JFRAME_NAME = "Jumping Doggies";

    /**
     * Waggles doggie's tail
     *
     * @param happy     happiness of doggie as an integer
     * @return          doggie's final happiness as an integer
     */
	public static int waggle(int happy) {
		if (happy <= 10) {
			System.out.println("waggle");
			return waggle(happy + 1);
		} else {
			System.out.println("calm");
			return happy;
		}
	}

	/**
	 * Displays a line of jumping doggiess
	 *
	 * @param numOfDogs    the number of jumping doggies to display
	 *
	 */
	public static void lineOfJumpingDoggies(int numOfDogs) {
		
		URL url = Doggie.class.getResource(DOGGIE_GIF);
        Icon doggie = new ImageIcon(url);
        JFrame frame = new JFrame(DOGGIE_JFRAME_NAME);
        JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));

        for (int i = 0; i < numOfDogs; i++) {
        	container.add(new JLabel(doggie));
        }

        frame.add(container);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
	}

    /**
     * Makes doggie talk
     *
     * @param amount     doggie's current loquaciousness as an integer
     * @return           doggie's final loquaciousness as an integer
     */
	public static int talk(int amount) {
		if (amount == 0) {
			System.out.println("quiet");
			return amount;
		} else if (amount > 1 && amount <= 5) {
			System.out.println("bark");
			return amount;
		} else {
			return talk(amount / 5) + talk(amount - 1);
		}
	}

}
