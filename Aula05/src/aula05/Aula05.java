package aula05;


public class Aula05{
	public static void main(String[] args) {
		Conta p1 = new Conta();
		p1.setDono("Jubileu");
		p1.setStatus(false);
		p1.setNumConta(2222);
		p1.estadoAtual();  
		p1.abrirConta("CC");
		p1.estadoAtual();
	}
}