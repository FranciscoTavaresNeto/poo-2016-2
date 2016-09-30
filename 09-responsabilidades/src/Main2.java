import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {
		Produto p1 = new Produto(101, "Arroz Tio João", 3.5);
		Produto p2 = new Produto(1001, "Café Melita", 6.3);
		Produto p3 = new Produto(1101, "Pilha AA", 8.9);
		
		CupomFiscal cf1 = new CupomFiscal();
		
		cf1.bipar(p1);
		cf1.bipar(2, p2);
		cf1.bipar(3, p3);
		
		System.out.println(Arrays.toString(cf1.getItens()));
		System.out.println(cf1.getItem(2).getSubtotal());
		System.out.println(cf1.getTotal()); // 
		System.out.println(cf1.getItem(2).getProduto().getValor());
		
		
		System.out.println("nro codigo descricao       qtd   vlr unit   subtotal");
		System.out.println("----------------------------------------------------");
		for (Item item : cf1.getItens()) {
			System.out.print(item.getNumero() + "   ");
			System.out.print(item.getProduto().getCodigo() + "  ");
			System.out.print(item.getProduto().getDescricao() + "  ");
			System.out.print(item.getQuantidade() + "  ");
			System.out.print(item.getProduto().getValor() + "  ");
			System.out.println(item.getSubtotal());
		}
		
	}

}
