
public class MainConto {

	public static void main(String[] args) {
		Conto contoCorrente = new Conto(3000, "conto di Gabriele");
		
		Cliente mamma = new Cliente(contoCorrente, true, 100);
		Cliente papa = new Cliente(contoCorrente, true, 100);
		Cliente figlio = new Cliente(contoCorrente, false, 50);
		
		Thread tmamma = new Thread(mamma);
		Thread tpapa = new Thread(papa);
		Thread tfiglio = new Thread(figlio);
		
		tmamma.start();
		tpapa.start();
		tfiglio.start();
	}

}
