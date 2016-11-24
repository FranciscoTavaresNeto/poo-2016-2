package persistencia;

public class DAOException extends RuntimeException {

	public DAOException(Exception e) {
		super(e);
	}
	
	public DAOException(String mensagem) {
		super(mensagem);
	}

}
