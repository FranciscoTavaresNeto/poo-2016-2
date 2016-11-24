package persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;

// POLIMORFISMO PARAMÉTRICO
// Java: Generics!

public abstract class DAO<CLASSE extends Persistivel> { // parâmetro de tipo

	private static final String
		URL = "jdbc:postgresql://10.132.214.1:5432/cobaia",
		USER = "aluno",
		PASSWORD = "aluno";
	
	protected Connection conectar() throws SQLException {
		return
			DriverManager.getConnection(URL, USER, PASSWORD);
	}
	
	public abstract void salvar(CLASSE o);
	
	protected Date toDate(LocalDate localDate) {
		
		return new java.sql.Date(
			java.util.Date.from(
				localDate
					.atStartOfDay()
					.toInstant(ZoneOffset.UTC)
			).getTime()
		);
		
	}
	
	
	
	
	
	
	
	
}
