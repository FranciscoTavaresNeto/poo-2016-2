package poo.cobaia;

import spark.ResponseTransformer;
import spark.Route;
import spark.Spark;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Route todas = new TodasPessoas();

		ResponseTransformer json = new JsonTransformer();
		
		Spark.get("/pessoas", todas, json);

	}
}
