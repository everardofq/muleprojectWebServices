package muleproject;

import javax.jws.WebService;

@WebService
public interface HelloService {
	String hiService(String name);
}
