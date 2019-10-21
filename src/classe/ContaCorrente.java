package classe;

import java.time.LocalDate;

public class ContaCorrente {

	private String cpf;
	private Double saldo;
	private LocalDate dataUltimaTransacao;
	
	public ContaCorrente() {
		// vazio
	}
	
	public ContaCorrente(String cpf) {
		this.cpf = cpf;
		this.saldo = 0.0;
		this.dataUltimaTransacao = LocalDate.now();
	}
	
	public ContaCorrente(String cpf, Double deposito) {
		this.cpf = cpf;
		this.saldo = deposito;
		this.dataUltimaTransacao = LocalDate.now();
	}
	
	public Boolean realizaSaque(Double valorASerSacado) {
		if (valorASerSacado >= saldo) { 
			this.dataUltimaTransacao = LocalDate.now();
			this.saldo = this.saldo - valorASerSacado;
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public LocalDate getDataUltimaTransacao() {
		return dataUltimaTransacao;
	}
	
}
