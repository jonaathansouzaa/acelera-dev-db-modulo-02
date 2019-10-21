package objetos;

import classe.ContaCorrente;

public class ControladorContaCorrente {

	public static void main(String[] args) {
		ContaCorrente contaCorrenteDoJonathan = new ContaCorrente("XXXXXXXXXXX");
		ContaCorrente contaCorrenteDoFulano = new ContaCorrente("YYYYYYYYYYY", 5000.0);
		ContaCorrente contaIncorreta = new ContaCorrente();
	}
	
}
