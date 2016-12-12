package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;

import modelo.Produto;
import modelo.Produto.Tipo;
import modelo.Produtos;

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

	public void carregar(int codigo, Produto p) {
		try (Connection con = conectar()) {
			
			String sql =
			"SELECT * FROM produtos WHERE codigo = ?";
			
			PreparedStatement cmd = con.prepareStatement(sql);
			
			cmd.setInt(1, codigo);			
			// Cursor Pattern
			// |   | r0 | r1 | r2 | rn |
			//   ^
			ResultSet rs = cmd.executeQuery();
			
			if (rs.next()) {
				p.setCodigo(codigo);
				p.setDescricao(rs.getString("descricao"));
				p.setDisponivel(rs.getBoolean("disponivel"));
				// TODO converter o Data para LocalDate
				// p.setPrazoValidade(rs.getDate("prazo_validade"));
				// TODO fazer um if aqui no rs.getInt("tipo") pode ser null				
				p.setTipo(Tipo.values()[rs.getInt("tipo")]);
				p.setValor(rs.getDouble("valor"));
			}
			
		} catch (Exception e) {
			throw new DAOException(e);
		}
	}

	public void carregarTodos(Produtos produtos) {
		
		produtos.clear();
		
		try (Connection con = conectar()) {
			
			String sql =
			"SELECT * FROM produtos";
			
			PreparedStatement cmd = con.prepareStatement(sql);
			
			ResultSet rs = cmd.executeQuery();
			
			while (rs.next()) {
				Produto p = new Produto();
				
				p.setCodigo(rs.getInt("codigo"));
				p.setDescricao(rs.getString("descricao"));
				p.setDisponivel(rs.getBoolean("disponivel"));
				// TODO converter o Data para LocalDate
				// p.setPrazoValidade(rs.getDate("prazo_validade"));
				// TODO fazer um if aqui no rs.getInt("tipo") pode ser null				
				p.setTipo(Tipo.values()[rs.getInt("tipo")]);
				p.setValor(rs.getDouble("valor"));
				
				produtos.add(p);
			}
			
		} catch (Exception e) {
			throw new DAOException(e);
		}
	}

	public void atualizar(Produto p) {
		try (Connection con = conectar()) {
			
			String sql =
			"UPDATE produtos SET "
				+ "descricao = ?, "
				+ "valor = ?, "
				+ "prazo_validade = ?, "
				+ "disponivel = ?, "
				+ "tipo = ? "
				+ "WHERE codigo = ?";
			
			PreparedStatement cmd = con.prepareStatement(sql);
			
			if (p.getCodigo() == null)
				throw new DAOException("codigo obrigatorio");
			
			if (p.getDescricao() == null)
				throw new DAOException("descricao obrigatoria");
			
			cmd.setInt(6, p.getCodigo());
			
			cmd.setString(1, p.getDescricao());
			
			if (p.getValor() != null) cmd.setDouble(2, p.getValor());
			else cmd.setNull(2, Types.DECIMAL);
			
			if (p.getPrazoValidade() != null) cmd.setDate(3, toDate(p.getPrazoValidade()));
			else cmd.setNull(3, Types.DATE);
			
			if (p.getDisponivel() != null) cmd.setBoolean(4, p.getDisponivel());
			else cmd.setNull(4, Types.BOOLEAN);
			
			if (p.getTipo() != null) cmd.setInt(5, p.getTipo().ordinal());
			else cmd.setNull(5, Types.INTEGER);
			
			cmd.execute();
			
		} catch (Exception e) {
			throw new DAOException(e);
		}
		
		
	}

	public void excluir(int codigo) {
		try (Connection con = conectar()) {
			
			String sql = "DELETE FROM produtos "
						+ "WHERE codigo = ?";
			
			PreparedStatement cmd = con.prepareStatement(sql);
			
			cmd.setInt(1, codigo);
			
			cmd.execute();
			
		} catch (Exception e) {
			throw new DAOException(e);
		}
	}

	



}
