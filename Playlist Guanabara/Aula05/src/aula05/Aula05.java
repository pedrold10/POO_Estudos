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
		p1.depositar(500);
		p1.estadoAtual();
		p1.sacar(50); // saque possivel
		p1.estadoAtual(); // exibindo a conta com valor descontado
		p1.sacar(1000); // saque rejeitado por pedir um valor maior que o que tem na conta
		p1.fecharConta(); // tentativa de fechar uma conta com saldo
		p1.sacar(500); // sacando o valor restante para poder fechar a conta
		p1.fecharConta(); // conta fechada por estar com o saldo zerado
	}
}