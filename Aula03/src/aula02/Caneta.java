package aula02;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	void status() {
		System.out.println("==============\nModelo:\n "+this.modelo);
		System.out.println("==============\nUma caneta da cor:\n "+this.cor);
		System.out.println("==============\nCarga:\n "+this.carga);
		System.out.println("==============\nEst� tampada?\n "+ this.tampada);
		System.out.println("==============\nA ponta tem\n "+this.ponta+"mm");
	}
	void rabiscar() {
		if(this.tampada==true) {
			System.out.println("Erro! A caneta est� tampada");
		}
		else {
			System.out.println("Rabiscando");
		}
	}
	
	void tampar() {
		this.tampada = true;
	}
	void destampar() {
		this.tampada = false;
	}
	void fechada() {
		if(this.tampada==false) {
			System.out.println("==============\nA caneta est� destampada");
		}
		else {
			System.out.println("==============\nA caneta est� tampada");
		}
	}
}
