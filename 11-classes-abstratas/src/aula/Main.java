package aula;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		// TipoAbstrato t = new TipoConcreto();
		Palestra p1 = new Palestra();
		p1.setNome("O mercado de TI em Rio Grande");
		p1.setDataHora(LocalDateTime.of(2016, 11, 14, 21, 00));
		p1.setVagas(100);
		
		Oficina o1 = new Oficina();
		o1.setNome("Arduino");
		o1.setDataHora(LocalDateTime.of(2016, 11, 15, 21, 00));
		o1.setVagas(10);
		
		Evento e1 = new Evento("Semana Academica");
		e1.cadastrarAtividade(p1);
		e1.cadastrarAtividade(o1);
		System.out.println(e1);
		
		// TipoAbstrato t = new TipoConcreto();
		Atividade a1 = new Oficina();
		e1.cadastrarAtividade(a1);
		
		
		
	}

}
