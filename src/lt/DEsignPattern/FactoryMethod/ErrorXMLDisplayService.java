package lt.DEsignPattern.FactoryMethod;

public class ErrorXMLDisplayService extends DisplayService{

	@Override
	protected XMLParser getParser() {
		// TODO Auto-generated method stub
		return new ErrorXMLParser();
	}

}
