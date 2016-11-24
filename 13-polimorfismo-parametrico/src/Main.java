import modelo.Produto;
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
		p1.salvar(); // tornar o produto persistente!
		
		// Padrão de Arquitetura DAO
		// Data Access Object (Objeto de Acesso a Dados)
		
		
		
	}
	
}
