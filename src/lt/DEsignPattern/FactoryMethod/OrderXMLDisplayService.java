package lt.DEsignPattern.FactoryMethod;

public class OrderXMLDisplayService extends DisplayService{

	@Override
	protected XMLParser getParser() {
		 return new OrderXMLParser();
	}

}
