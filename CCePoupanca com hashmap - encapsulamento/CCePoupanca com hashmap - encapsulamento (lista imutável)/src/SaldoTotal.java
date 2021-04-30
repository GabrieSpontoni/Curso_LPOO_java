
public class SaldoTotal {

	
	
	double calculaSaldoTotal(Banco b) {

		  double total = 0;

		  for (Conta c : b.getContas())

		    total += c.getSaldo();

		  return total;

		}

}
