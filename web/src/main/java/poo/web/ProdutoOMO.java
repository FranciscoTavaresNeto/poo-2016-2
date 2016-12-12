package poo.web;

import modelo.Produto;
import spark.Request;
import spark.Response;
import spark.Route;

public class ProdutoOMO implements Route {

	public Object handle(Request arg0, Response arg1) throws Exception {
		Produto p = new Produto();
		p.setCodigo(1);
		p.setDescricao("OMO");
		return "<html><body><h1 style='color: RED' onclick='this.style.color = \"blue\"'>" + p.getCodigo() + "</h1> <ul><li>" + p.getDescricao() + "<li></ul></body></html>";
	}

}
