package lt.DEsignPattern.FactoryMethod;

public class FeedbackXML  implements XMLParser{

	@Override
	public String parse() {
		System.out.println("Parsign feedback XML ...");
		return "Feedback XML Message";
	}

}
