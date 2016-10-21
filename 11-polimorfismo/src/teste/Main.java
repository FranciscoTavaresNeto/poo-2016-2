package teste;

public class Main {

	public static void main(String[] args) {
		Documento doc1 = new Documento("Carta.doc","texto", 2);
		Impressora imp = new Impressora ("HP Deskjet");
		imp.imprimir(doc1,3);
		System.out.println(imp.getImpressoes() == 6);
		System.out.println(imp.getImpressoes());	
		Scanner scan = new Scanner("Epson");
		Documento doc2 = scan.digitalizar();
		System.out.println(doc2);
		System.out.println(scan.getdigitalizacoes()==1);
		Documento doc3 = new Documento ("Receita", "bolo", 5);
		scan.imprimir(doc3);
		System.out.println(imp);
		System.out.println(scan);
		Copiadora cop = new Copiadora("Xerox");
		cop.copiar();
		cop.copiar();
		System.out.println(cop.getImpressoes());
		System.out.println(cop.getdigitalizacoes());
		Documento doc4 = new Documento("TCC.odt", "meu tcc", 8);
		ImpressoraZoom impz = new ImpressoraZoom ("Zooner");
		impz.imprimir(doc4);
		System.out.println(impz.getImpressoes() == 8);
		impz.setzoom(Zoom._50);
		impz.imprimir(doc4);
		System.out.println(impz.getImpressoes() == 12);
		impz.setzoom(Zoom._25);
		impz.imprimir(doc4);
		System.out.println(impz.getImpressoes() == 14);
		Cupom c = new Cupom(imp);
		c.adicionaProduto("Impressora");
		c.adicionaProduto("teclado");
		c.adicionaProduto("mouse");
		c.imprimir();
		c.setImpressora(impz);
		c.imprimir();
		c.setImpressora(scan);
		c.imprimir();
		
	}
}
