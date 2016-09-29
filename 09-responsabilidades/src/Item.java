
public class Item {
	private int quantidade;
	private Produto produto;
	
	public Item(int quantidade, Produto produto) {
		super();
		this.quantidade = quantidade;
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	@Override
	public String toString() {
		return "Item [quantidade = " + quantidade + ", produto = " + produto + " ] ";
	}
	
	
	
	

}
