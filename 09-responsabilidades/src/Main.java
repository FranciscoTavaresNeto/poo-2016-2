public class Main {
	public static void main(String[] args) {
		// atribuir responsabilidades
		// para as classes/objetos
		
		Produto p1 = new Produto(101, "Arroz Tio João", 3.5);
		Produto p2 = new Produto(1001, "Café Melita", 6.3);
		Produto p3 = new Produto(1101, "Pilha AA", 8.9);
		System.out.println(p1);		
		
		CupomFiscal cf1 = new CupomFiscal();
		
		System.out.println(cf1.getQtdItens() == 0);
		
		cf1.bipar(2, p1);
		cf1.bipar(p2);	
		// cf1.bipar(-2, p3);
		// exemplo quebra encapsulamento
		// Item itemfake = new Item(-2, p3);
		// cf1.getItens()[7] = itemfake;
		System.out.println(cf1.getQtdItens() == 2);
		
		System.out.println(cf1.getItem(1)); // Item #0
		System.out.println(cf1.getItem(2));
		System.out.println(cf1.getItem(154));
		System.out.println(cf1.getItem(200)); // IndexOutOfBounds
		System.out.println(cf1.getItem(300));
		System.out.println(cf1.getItem(550));
		
		for (int i = 0; i < cf1.getQtdItens(); i++) {
			System.out.println(cf1.getItem(i));
		}
		
		// Item[] itensdocupom = cf1.getItens();
		System.out.println("existem " + cf1.getItens().length + " itens");
		
		for (Item item : cf1.getItens()) {
			System.out.println(item);
		}
	
		cf1.cancelarItem(1);
		
		System.out.println("itens restantes:" );
		
		for (Item item : cf1.getItens()) {
			System.out.println(item);
		}
		
		cf1.bipar(2, p1);
		
		System.out.println("itens restantes de novo:" );
		
		for (Item item : cf1.getItens()) {
			System.out.println(item);
		}
		
		cf1.bipar(p3);
		
		System.out.println("itens restantes outra vez:" );
		
		for (Item item : cf1.getItens()) {
			System.out.println(item);
		}
		
		
		
	}
}