
public interface CepFinder {
/**
 * Recebe um cep e devolve um endereço correspondente;
 * @param cep uma string contendo 8 caracteres numericos (um cep sem o traço);
 * @return o endereço correspondente ao cep , se o endereço não for encontrado retorna null
 */
	Endereco find(String cep);

}
