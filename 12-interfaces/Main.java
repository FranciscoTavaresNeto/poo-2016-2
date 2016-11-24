public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CepFinder tosco = new CepFinderTosco();
		CepFinder banco = new CepFinderBanco();
		Pessoa p1 = new Pessoa("Fernando", banco);
		System.out.println(p1.getEnderecos());
		p1.addEndereco("96200020", "675");
		System.out.println(p1.getEnderecos());
		
		//precisamos de apache hht client, apache http client fluent, gson
		//https://viacep.com.br/ws/96203590/json/
	}
}
