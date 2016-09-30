
public class CupomFiscal {
	// minimizar a mudança
	// CONSTANTE (nome todo maiúsculo)
	private static final int MAX = 200;
	
	private Item[] itens = new Item [MAX];
	private int indice = 0;
	private int numero = 1;

	public void bipar(int quantidade, Produto produto) {
		if (quantidade > 0 && indice < MAX) {
			Item item = new Item (numero++, quantidade, produto);
			itens[indice++] = item;
		}
	}
	// interface (comando) para introduzir item no cupom
	public void bipar(Produto produto) {
		if (indice < MAX) {
			Item item = new Item (numero++, 1,produto);
			itens[indice++] = item;
		}
	}
	// expor o vetor inteiro é uma quebra de encapsulamento
	// public Item[] getItens() {
	//	return itens;
	// }
	public int getQtdItens() {
		return indice;
	}
	
	public Item getItem(int nroItem) {
		for (int i = 0; i < itens.length; i++) {
			Item item = itens[i];
			if (item != null && item.getNumero() == nroItem) {
				return item;
			}
		}
		
		return null;
	}
	
	public Item[] getItens() {
		Item[] copia = new Item[getQtdItens()];
		for (int i = 0; i < getQtdItens(); i++) {
			copia[i] = itens[i];
		}
		return copia;
	}
	
	public void cancelarItem(int nroItem) {
		int indiceARemover = -1;
		// encontrar o indice do item a cancelar
		for (int i = 0; i < itens.length; i++) {
			Item item = itens[i];
			if (item != null && item.getNumero() == nroItem) {
				indiceARemover = i;
				break;
			}
		}
		// se encontrou o item
		if (indiceARemover >= 0) {
			// subir a lista
			for (int i = indiceARemover; i < itens.length - 2; i++) {
				itens[i] = itens[i + 1];
			}
			itens[MAX - 1] = null;
			indice--;
		}
	}
	
	public double getTotal() {
		double total = 0.0;
		for (Item item : getItens()) total += item.getSubtotal();
		return total;
	}

	
	
	
	
	
	
	
	
}
