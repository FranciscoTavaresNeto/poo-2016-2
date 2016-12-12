package modelo;

import java.util.ArrayList;

import persistencia.ProdutoDAO;

public class Produtos extends ArrayList<Produto> {

	private ProdutoDAO dao = new ProdutoDAO();
	
	public void carregar() {
		dao.carregarTodos(this);
	}

}
