import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		App appObject = new App();

		
		// System.out.println("sayHello() result" + appObject.sayHello("David") + "\n");
	
		// System.out.println("generateHtmlElement() result: " + appObject.generateHtmlElement("h1", "This is a Heading"));

				
	}

	// �lesanne: tervita kasutajat, tervitusteksti saad ise valida.
	// Kasutajale nime saad parameetrina.

	private String sayHello(String name) {
		return "Hello " + name;
	}

	// generateHtmlElement("h1", "This is a Heading") -> "<h1>This is a Heading</h1>"
	private String generateHtmlElement(String tag, String value) {
		// 1.variant
		// return "<" + tag + ">" + value + "</" + tag + ">";
		
		// 2.variant
		// String htmlElementTemp = String.format("<%1$s>%2$s</%1$s>", tag, value);
		
		
		// 3.variant
		StringBuilder htmlElement = new StringBuilder("<");

		return htmlElement.append(tag).append(">").append(value).append("</").append(tag).append(">").toString();

	}

	// �lesanne: etteantud n�dala(v�i muu periood) temperatuurid, arvutada keskmine temperatuur sel n�dalal.
	
}
