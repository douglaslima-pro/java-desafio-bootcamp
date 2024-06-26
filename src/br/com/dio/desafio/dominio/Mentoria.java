package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	private LocalDate data;
	
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}

	@Override
	public String toString() {
		return String.format("Mentoria{titulo='%s', descricao='%s', data=%s}", super.titulo, super.descricao, this.data.toString());
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}

}