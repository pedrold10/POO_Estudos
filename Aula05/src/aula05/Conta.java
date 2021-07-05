package aula05;

public class Conta{
	private int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	// mï¿½todo personalizados
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if(tipo == "CC"){
			this.setSaldo(50);
		}
		else if(tipo == "CP"){
			this.setSaldo(150);
		}
		
		System.out.println("Conta aberta com sucesso");
	}
	public void fecharConta() {
		if(this.getSaldo()>0) {
			System.out.println("Conta com saldo, não podendo ser fechada");
		}
		else if(this.getSaldo()<0) {
			System.out.println("Conta em débito, não podendo ser fechada");
		}
		else {
			System.out.println("Conta fechada com sucesso!");
			setStatus(false);
		}
	}
	public void depositar() {
		
	}
	public void sacar() {
		
	}
	public void pagarMensal() {
		
	}
	public Conta(int numConta, String tipo, String dono, float saldo, boolean status) {
		super();
		this.numConta = numConta;
		this.tipo = tipo;
		this.dono = dono;
		this.saldo = saldo;
		this.status = status;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}