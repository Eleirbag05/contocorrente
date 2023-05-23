
public class Cliente implements Runnable{
	private Conto conto;
	private boolean genitore;
	private int importo;
	
	public Cliente(Conto conto, boolean genitore, int importo) {
		this.conto=conto;
		this.genitore=genitore;
		this.importo=importo;
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			if(genitore) {
				synchronized(conto) {
					conto.versa(importo);
					System.out.println("dopo il versamento del genitore: "+conto.getSaldo());
				}
			}else{
				synchronized(conto) {
					conto.preleva(importo);
					System.out.println("dopo il prelievo del figlio: "+conto.getSaldo());
				}
			}
		}
	}
}
