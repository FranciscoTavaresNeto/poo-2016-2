package modelo;

import java.time.LocalDate;

import persistencia.Persistivel;
import persistencia.ProdutoDAO;

public class Produto implements Persistivel {

	public enum Tipo {
		PERECIVEL, ELETRONICO, TOXICO
	}

	// Integer em vez de int, porque é anulável
	private Integer codigo;
	private String descricao;
	private Double valor;
	private LocalDate prazoValidade;
	private Boolean disponivel;
	private Tipo tipo;
	
	
	
	private ProdutoDAO dao = new ProdutoDAO();
	

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public LocalDate getPrazoValidade() {
		return prazoValidade;
	}

	public void setPrazoValidade(LocalDate prazoValidade) {
		this.prazoValidade = prazoValidade;
	}

	public Boolean getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", valor=" + valor + ", prazoValidade="
				+ prazoValidade + ", disponivel=" + disponivel + ", tipo=" + tipo + "]";
	}

	@Override
	public void salvar() {
		dao.salvar(this);
	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}

}
