package poo.web;

import java.util.ArrayList;

import modelo.Produto;
import modelo.Produtos;
import spark.Request;
import spark.Response;
import spark.Route;

public class TodosProdutos implements Route {

	public Object handle(Request arg0, Response arg1) throws Exception {
		ArrayList<Produto> todos = new ArrayList<Produto>();
		Produto p1 = new Produto();
		p1.setCodigo(1);
		p1.setDescricao("OMO Multiacao");
		Produto p2 = new Produto();
		p2.setCodigo(2);
		p2.setDescricao("Cebola da Ilha");
		todos.add(p1);
		todos.add(p2);
		return todos;
	}

}


