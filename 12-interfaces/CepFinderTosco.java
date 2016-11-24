
public class CepFinderTosco implements CepFinder{

	@Override
	public Endereco find(String cep) {
		if ("96200020".equals(cep)) {
			Endereco e = new Endereco();
			e.setLogradouro("Duque de Caxias");
			e.setBairro("Centro");
			e.setCep(cep);
			e.setLocalidade("Rio Grande");
			e.setUf("RS");
			return e;
		}
		return null;
	}

}
