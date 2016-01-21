/**
 * Creates a doggie. The doggie can waggle its tail or even talk.
 */
public class Doggie {

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
