
public class Item {
	
	private int numero;
	private int quantidade;
	private Produto produto;
	
	public Item(int numero, int quantidade, Produto produto) {
		super();
		this.numero = numero;
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	public int getNumero() {
		return numero;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	@Override
	public String toString() {
		return "Item [numero=" + numero + ", quantidade=" + quantidade + ", produto=" + produto + "]";
	}

	public double getSubtotal() {
		return quantidade * produto.getValor();
	}

		
	
	

}
