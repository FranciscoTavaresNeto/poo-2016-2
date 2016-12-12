package poo.web;

import spark.ResponseTransformer;
import spark.Route;
import spark.Spark;

public class App {
	public static void main(String[] args) {
		
		System.out.println("Rodando ...");
		
		Route hello = new HelloWorld();
		
		Spark.get("/hello", hello);
		
		Route somador = new Somador();
		
		Spark.get("/soma", somador);
		
		Route todos = new TodosProdutos();
		
		ResponseTransformer json = new JsonTransformer();
		
		Spark.get("/produtos", todos, json);
		
		Route omo = new ProdutoOMO();
		
		Spark.get("/omo", omo);
		
	}
}
