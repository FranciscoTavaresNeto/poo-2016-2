package poo.web;

import spark.Request;
import spark.Response;

public class HelloWorld implements spark.Route {

	public Object handle(Request req, Response resp) throws Exception {
		
		return "Hello World!!!";
	}

}
