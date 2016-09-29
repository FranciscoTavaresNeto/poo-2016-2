
public class Main {
	public static void main(String[] args) {
		// CTRL + ESPAÇO: autocompletar
		System.out.println(Math.random());
		Moeda m1 = new Moeda(3, 87);
		System.out.println(m1);
		Moeda m2 = new Moeda(3, 87);
		System.out.println(m2);
		System.out.println(m1.equals(m2));
		System.out.println(m2.equals(m1));
		// a chave é o CPF! (atributo identifica o objeto)
		Cliente cli1 = new Cliente("Maria Silva", "77766622211");
		Cliente cli2 = new Cliente("Joao Silveira", "22333444555");
		Cliente cli3 = new Cliente("Maria Silva", "88822299933");
		Cliente cli4 = new Cliente("Maria", "77766622211");

		System.out.println(cli1.getNome());
		
		System.out.println(cli1.equals(cli2)); // false
		System.out.println(cli1.equals(cli3)); // false
		System.out.println(cli1.equals(cli4)); // true
		
			
		
		
		
		
	}
}
