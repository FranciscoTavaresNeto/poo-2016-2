import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CepFinderBanco implements CepFinder {

	@Override
	public Endereco find(String cep) {
		try {
			Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost/cepfinder", "postgres", "postgres");
			Statement comando = conexao.createStatement();
			ResultSet resultado = comando.executeQuery("select * from enderecos where cep = '"+ cep + "' ");
			if (resultado.next()) {
				Endereco e = new Endereco();
				e.setLogradouro(resultado.getString("logradouro"));
				e.setLocalidade(resultado.getString("localidade"));
				e.setCep(cep);
				e.setBairro(resultado.getString("bairro"));
				e.setUf(resultado.getString("UF"));
				return e;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return null;
	}

}
