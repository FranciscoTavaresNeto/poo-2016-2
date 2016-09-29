public class Main {
	public static void main(String[] args) {
		Produto p1 = new Produto(101, "Arroz Tio João", 3.5);
		Produto p2 = new Produto(1001, "Café Melita", 6.3);
		Produto p3 = new Produto(1101, "Pilha AA", 8.9);
		System.out.println(p1);		
		CupomFiscal cf1 = new CupomFiscal();
		cf1.bipar(2, p1);
		cf1.bipar(p2);	
		
		for (Item item : cf1.getItens())if (item != null) System.out.println(item);	
	}
}