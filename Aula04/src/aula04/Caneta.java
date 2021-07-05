package aula04;
public class Caneta {
	private float ponta;
    private boolean tampada;
    private String cor;
	private String modelo;
	public Caneta(String cor, String modelo, float ponta) {
		this.cor = cor;
		this.modelo = modelo;
		this.ponta = ponta;
	}
	public float getPonta() {
		return ponta;
		
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public boolean isTampada() {
		return tampada;
	}
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
