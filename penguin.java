// Create a penguin

public class penguin {
	public static int waddle(int happy) {
		if (happy <= 10) {
			System.out.println("waddle");
			return waddle(happy + 1);
		} else {
			System.out.println("calm");
			return happy;
		}
	}

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