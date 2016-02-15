import java.awt.FlowLayout;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * Creates a penguin. Penguin can waddle, talk or dance
 */
public class Penguin {

	private static final String PENGUIN_GIF = "./penguin.gif";
	private static final String PENGUIN_JFRAME_NAME = "Dancing Penguins";

    /**
     * Makes penguin waddle
     *
     * @param happy    penguin's current happiness as an integer
     * @return         penguin's final happiness as an integer
     */
	public static int waddle(int happy) {
		if (happy <= 10) {
			System.out.println("waddle");
			return waddle(happy + 1);
		} else {
			System.out.println("calm");
			return happy;
		}
	}

	/**
	 * Displays a line of dancing penguins
	 *
	 * @param numOfPenguins    the number of dancing penguins to display
	 *
	 */
	public static void lineOfDancingPenguins(int numOfPenguins) {
		
		URL url = Doggie.class.getResource(PENGUIN_GIF);
        Icon penguin = new ImageIcon(url);
        JFrame frame = new JFrame(PENGUIN_JFRAME_NAME);
        JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));

        for (int i = 0; i < numOfPenguins; i++) {
        	container.add(new JLabel(penguin));
        }

        frame.add(container);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
	}

    /**
     * Makes penguin talk
     *
     * @param amount    penguin's current loquaciousness as an integer
     * @return          penguin's final loquaciousness as an integer
     */
	public static int talk(int amount) {
		if (amount == 0) {
			System.out.println("quiet");
			return amount;
		} else if (amount > 1 && amount <= 5) {
			System.out.println("hwakawkaw");
			return amount;
		} else {
			return talk(amount / 5) + talk(amount - 1);
		}
	}
}
