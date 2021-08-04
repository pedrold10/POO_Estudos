import java.util.Scanner;

public class Eleicao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite o numero de candidatos da eleicao");
		int n = teclado.nextInt();
		int[] total = new int[n];
		
		System.out.println("digite cada voto entre 1 e "+n);
		int voto = teclado.nextInt();
		while(voto!=0) {
			if(voto<0 || voto>n)
				System.out.println("voto invalido");
			else
				total[voto-1] ++;
			
			System.out.println("digite outro voto entre 1 e "+n);
			voto = teclado.nextInt();
		}
		
		System.out.println("\nResultado da eleicao");
		for(int cand=1; cand<=n; cand++)
			System.out.println("candidato="+cand + ", total de votos="+total[cand-1]);
		
		//vencedor
		int max =0;
		for(int t : total)
			if (t>max)
				max=t;
		
		System.out.println("maior votacao="+max);
		int empate=0;
		for(int cand=1; cand<=n; cand++)
			if(total[cand-1] == max) {
				System.out.println("o candidato "+cand+ " obteve a maior votacao");
				empate++;
			}
		
		
		if(empate>1)
			System.out.println("HOUVE EMPATE");
		else
			System.out.println("FIM DA ELEICAO");
		
	}

}
