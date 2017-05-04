package apresentacaoPLP;

import apresentacaoPLP.ApresentacoesF;;

public class ListaTodasApresentacoes {
	public static void main(String[] args) {
		System.out.printf("%-30s %s\n", "Nome:", "Data da Apresentação:");
		
		ApresentacoesF a = new ApresentacoesF();
		a.ListaApresentacoes().forEach(i -> {
		
		System.out.printf("%-30s %s\n", i.getNomeDoTema(),
		i.getDataDaApresentacao());
		});
	}
	
}
