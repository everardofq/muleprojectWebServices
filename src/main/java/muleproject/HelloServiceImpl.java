package muleproject;

public class HelloServiceImpl implements HelloService{

	@Override
	public String hiService(String name) {
		return "Hello "+ name + " welcom to Web Services";
	}

}
