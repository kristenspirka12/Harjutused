public class Grades {

	public static void main(String[] args) {
		// Teha hinnangu andmise meetod, mis on lahendatud switch-case
		// struktuuri kasutades.
		// Hinnangud võivad olla 1-5. Näiteks valueGrade(5) -> “Suurepärane
		// tulemus!”
		System.out.println(Grades.valueGrade(3));
	}

	private static String valueGrade(int number) {
		switch (number) {
		case 5:
			return "Suurepärane";
		case 4:
			return "Hea";
		case 3:
			return "Rahuldav";
		case 2:
			return "Mitte rahuldav";
		case 1:
			return "Proovi uuesti";
		default:
			throw new IllegalArgumentException("Number should be in range 1 to 5");
		}

	}
}
