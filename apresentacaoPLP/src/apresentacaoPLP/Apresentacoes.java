package apresentacaoPLP;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Apresentacoes {
	
	private String nomeDoTema;
	private LocalDate dataDaApresentacao;
	private BigDecimal pontos;
	
	public Apresentacoes(String nomeDoTema, LocalDate dataDaApresentacao, BigDecimal pontos) {
		super();
		this.nomeDoTema = nomeDoTema;
		this.dataDaApresentacao = dataDaApresentacao;
		this.pontos = pontos;
	}
	
	public Apresentacoes() {
		super();
	}

	public String getNomeDoTema() {
		return nomeDoTema;
	}
	public void setNomeDoTema(String nomeDoTema) {
		this.nomeDoTema = nomeDoTema;
	}
	public LocalDate getDataDaApresentacao() {
		return dataDaApresentacao;
	}
	public void setDataDaApresentacao(LocalDate dataDaApresentacao) {
		this.dataDaApresentacao = dataDaApresentacao;
	}
	public BigDecimal getPontos() {
		return pontos;
	}
	public void setPontos(BigDecimal pontos) {
		this.pontos = pontos;
	}

}
