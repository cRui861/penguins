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

	public static int jump(int amount) {
		if (amount == 0) {
			System.out.println(":(");
			return 0;
		} else if (amount > 1 && amount <= 5) {
			System.out.println("mehhh");
			return amount;
		} else {
			return jump(amount / 5) + jump (amount - 1);
		}
	}

}