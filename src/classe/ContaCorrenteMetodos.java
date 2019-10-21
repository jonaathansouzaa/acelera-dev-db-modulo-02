package classe;

import java.time.LocalDate;

public class ContaCorrenteMetodos {

	private String cpf;
	private Double saldo;
	private LocalDate dataUltimaTransacao;
	
	public Boolean realizaSaque(Double valorASerSacado) {
		if (valorASerSacado >= saldo) { 
			this.dataUltimaTransacao = LocalDate.now();
			this.saldo = this.saldo - valorASerSacado;
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
}
