package lt.DEsignPattern.FactoryMethod;

public class FeedbackXMLDisplayService extends DisplayService{

	@Override
	protected XMLParser getParser() {
		return new FeedbackXML();
	}

}
