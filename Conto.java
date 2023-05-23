
public class Conto {
	private int saldo;
	private String nome;
	
	public Conto(int saldo, String nome) {
		this.saldo=saldo;
		this.nome=nome;
	}
	
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo=saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public void versa(int importo) {
		saldo=saldo+importo;
	}
	public void preleva(int importo) {
		saldo=saldo-importo;
	}
}
