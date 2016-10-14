package heranca;

import java.time.LocalDate;

public class Venda {
	// - usando a classe mais genérica
	// estamos reduzindo o acoplamento
	// - usando a classemais específica
	// estamos aumentando o acoplamento
	// (só para lembrar: acoplamento == RUIM)
	private Veiculo   veiculo; // co-variância (ela e as filhas)
	private LocalDate data;
	private double    valor;
	
	public Venda(Veiculo veiculo, LocalDate data, double valor) {
		this.veiculo = veiculo;
		this.data = data;
		this.valor = valor;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public LocalDate getData() {
		return data;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Venda [veiculo=" + veiculo + ", data=" + data + ", valor=" + valor + "]";
	}
	

	
	
}
