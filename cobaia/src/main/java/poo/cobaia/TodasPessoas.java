package poo.cobaia;

import java.util.ArrayList;

import spark.Request;
import spark.Response;
import spark.Route;

public class TodasPessoas implements Route {

	public Object handle(Request arg0, Response resp) throws Exception {

		resp.header("Content-Type", "application/json");
		resp.header("Access-Control-Allow-Origin", "*");
		
		// PessoaDAO dao = new PessoaDAO();
		// ArrayList<Pessoa> todas = dao.listar();
		// return todas;
		
		ArrayList<Pessoa> todas = new ArrayList();
		Pessoa p1 = new Pessoa();
		p1.setNome("Marcio"); p1.setSobrenome("Torres");
		Pessoa p2 = new Pessoa();
		p2.setNome("Raquel"); p2.setSobrenome("Barbosa");
		todas.add(p1); todas.add(p2);
		
		return todas;		
	}

}
