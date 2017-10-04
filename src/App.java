import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		App appObject = new App();

		// System.out.println("sayHello() result" + appObject.sayHello("David")
		// + "\n");

		// System.out.println("generateHtmlElement() result: " +
		// appObject.generateHtmlElement("h1", "This is a Heading"));
		double[] temperatures = { 20, 15, 16, 10, 14, 11, 13 };
		System.out.println("Keskmine temperatuur: " + appObject.avgTemp(temperatures));
		System.out.println("Otsitav number on: " + appObject.intToWord(3));
	}

	// Ülesanne: tervita kasutajat, tervitusteksti saad ise valida.
	// Kasutajale nime saad parameetrina.

	private String sayHello(String name) {
		return "Hello " + name;
	}

	// generateHtmlElement("h1", "This is a Heading") ->
	// "<h1>This is a Heading</h1>"
	private String generateHtmlElement(String tag, String value) {
		// 1.variant
		// return "<" + tag + ">" + value + "</" + tag + ">";

		// 2.variant
		// String htmlElementTemp = String.format("<%1$s>%2$s</%1$s>",
		// tag, value);

		// 3.variant
		StringBuilder htmlElement = new StringBuilder("<");

		return htmlElement.append(tag).append(">").append(value).append("</")
				.append(tag).append(">").toString();

	}

	// Etteantud nädala(või muu periood) temperatuurid, arvutada keskmine
	// temperatuur sel nädalal.

	private double avgTemp(double[] temp) {
		double sum = 0;
		for (int i = 0; i < temp.length; i++) {
			sum += temp[i]; // sama, mis sum = sum + temp[i];
		}
		return sum / temp.length;
	}

	// Meetod, mis võtab sisendiks numbri (0-9).
	private String intToWord(int number) {

		Map<Integer, String> numbers = new HashMap<Integer, String>();

		numbers.put(0, "null");
		numbers.put(1, "üks");
		numbers.put(2, "kaks");
		numbers.put(3, "kolm");
		numbers.put(4, "neli");
		numbers.put(5, "viis");
		numbers.put(6, "kuus");
		numbers.put(7, "seitse");
		numbers.put(8, "kaheksa");
		numbers.put(9, "üheksa");

		return numbers.get(number);
		
		/* Ver1
		switch (number) { 
		case 0: 
			return "null"; 
		case 1: 
			return "üks"; 
		case 2: 
			return "kaks"; 
		default: 
		throw new IllegalArgumentException("Number should be in range 0 to 9"); }
		 */

		/*Ver2
		if (number < 0 || number > 9) {
			throw new IllegalArgumentException("Number should be in range 0 to 9");			
		}
		
		String[] num = { "null", "üks", "kaks", "kolm", "neli", "viis", "kuus", "seitse", "kaheksa", "üheksa" };
		return num[number];*/
	}
}
