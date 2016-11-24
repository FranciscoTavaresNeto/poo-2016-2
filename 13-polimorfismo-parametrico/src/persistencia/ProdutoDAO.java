package persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLType;
import java.sql.Types;
import java.time.LocalDate;
import java.time.ZoneId;

import modelo.Produto;

public class ProdutoDAO extends DAO<Produto> {

	@Override
	public void salvar(Produto p) {
		try (Connection con = conectar()) {
			
			String sql =
			"INSERT INTO produtos VALUES (?, ?, ?, ? ,? ,?)";
			
			PreparedStatement cmd = con.prepareStatement(sql);
			
			if (p.getCodigo() == null)
				throw new DAOException("codigo obrigatorio");
			
			if (p.getDescricao() == null)
				throw new DAOException("descricao obrigatoria");
			
			cmd.setInt(1, p.getCodigo());
			cmd.setString(2, p.getDescricao());
			
			if (p.getValor() != null) cmd.setDouble(3, p.getValor());
			else cmd.setNull(3, Types.DECIMAL);
			
			if (p.getPrazoValidade() != null) cmd.setDate(4, toDate(p.getPrazoValidade()));
			else cmd.setNull(4, Types.DATE);
			
			if (p.getDisponivel() != null) cmd.setBoolean(5, p.getDisponivel());
			else cmd.setNull(5, Types.BOOLEAN);
			
			if (p.getTipo() != null) cmd.setInt(6, p.getTipo().ordinal());
			else cmd.setNull(6, Types.INTEGER);
			
			cmd.execute();
			
		} catch (Exception e) {
			throw new DAOException(e);
		}
	}

	



}
