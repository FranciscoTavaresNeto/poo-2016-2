package poo.web;

import spark.Request;
import spark.Response;
import spark.Route;

public class Somador implements Route {

	public Object handle(Request req, Response resp) throws Exception {
		int a = Integer.parseInt(req.queryParams("a"));
		int b = Integer.parseInt(req.queryParams("b"));
		
		int soma = a + b;
		
		return "A soma eh " + soma;
	}

	
}
