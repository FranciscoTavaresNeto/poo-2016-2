
public class CupomFiscal {
	
	Item[] itens = new Item [200];
	private int indice;

	public void bipar(int quantidade, Produto produto) {
		Item item = new Item (quantidade, produto);
		itens[indice++] = item;
		
	}

	public void bipar(Produto produto) {
		Item item = new Item (1,produto);
		itens[indice++] = item;
		
	}

	public Item[] getItens() {
		return itens;
	}

}
