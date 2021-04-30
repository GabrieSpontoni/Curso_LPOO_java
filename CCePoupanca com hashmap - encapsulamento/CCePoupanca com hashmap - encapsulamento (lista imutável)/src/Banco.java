import java.util.*;

public class Banco {
	HashMap<Integer, Conta> mapa = new HashMap<Integer,Conta>();
	boolean insere (Conta c) {
		if (mapa.containsKey(c.getNumero())) {
			System.out.println("chave "+c.getNumero()+" já existente,conta não sera adicionada, por favor troque a chave");
			System.out.println("------------------------------------------------------------------------");
			return false;
		}
		else {
			System.out.println("conta com chave "+c.getNumero()+" adicionada com sucesso");
			System.out.println("------------------------------------------------------------------------");
			mapa.put(c.getNumero(), c);
			return true;
		}
	}
	
	
	Conta getConta(int numero) {
		return mapa.get(numero);
	}
	
	Collection<Conta> getContas() {
		Collection<Conta> immutablelist = Collections.unmodifiableCollection(new ArrayList<>(mapa.values()));
		return immutablelist;
	}
	
	
	
	public void exibe() {
		for (Conta c : mapa.values())
			c.exibe();
	}
	void fimDoMes() {
		System.out.println("informações (fim do mes) de todas as contas cadastradas no banco");
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		for (Integer i : mapa.keySet()) {
			  System.out.println("chave da conta: " + i + ", tipo de conta: " + mapa.get(i));
			  mapa.get(i).fimDoMes();
			}
		
	}
}

