// Create a doggie

public class doggie {
	public static int waggle(int happy) {
		if (happy <= 10) {
			System.out.println("waggle");
			return waggle(happy + 1);
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
			System.out.println("bark");
			return amount;
		} else {
			return talk(amount / 5) + talk(amount - 1);
		}
	}

}