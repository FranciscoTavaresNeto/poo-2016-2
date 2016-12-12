import modelo.Produto;
import modelo.Produtos;
import modelo.Produto.Tipo;

public class Main {

	public static void main(String[] args) {
		
		// CRUD ("cadastrinho")
		
		// Create/Insert
		// Read/Select
		// Update
		// Delete
		
		// Objeto Persistente
		// por padrão os objetos são transientes
		// só existem em execução
		
		// Existem várias estratégias de persistência!
		// Serializar um Objeto (tornar o obj um conjunto de bytes e salvar em disco)
		// Representar um Objeto (CSV, SQL, XML, JSON, YAML, ...) 
		
		Produto p1 = new Produto();
		p1.setCodigo(9);
		p1.setDescricao("Monitor 19\"");
		p1.setDisponivel(true);
		// p1.setPrazoValidade(prazoValidade);
		p1.setTipo(Tipo.ELETRONICO);
		p1.setValor(550.0);
		
		System.out.println(p1);
		
		// salvar/inserir/persistir/introduzir/armazenar
		// p1.salvar(); // tornar o produto persistente!
		
		// Padrão de Arquitetura DAO
		// Data Access Object (Objeto de Acesso a Dados)
		
		Produto p = new Produto();
		p.carregar(1); // load, select, find, search
		
		System.out.println(p);
				
		Produtos todos = new Produtos();
		todos.carregar();
		
		System.out.println(todos);
		
		for (Produto cada : todos) {
			System.out.println(cada.getValor());
		}
		System.out.println("-----------------");
		Produto primeiro = new Produto();
		primeiro.carregar(1);
		System.out.println(primeiro.getValor());
		primeiro.reajustar(10.0 / 100.0);
		primeiro.atualizar(); // persistir as atualizações (update)
		System.out.println(primeiro.getValor());
		primeiro.carregar(1);
		System.out.println(primeiro.getValor());
		
		Produto aExcluir = new Produto();
		aExcluir.carregar(9999);
		aExcluir.excluir(); // DELETE
		
		
		
	}
	
}
