/**
 * Creates a penguin. Penguin can waddle or even talk
 */
public class Penguin {

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
