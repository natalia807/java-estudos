package encapsulamento.casaA;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(-45);
		p1.alterarIdade(230); // alterar
		
		System.out.println(p1.lerIdade()); //ler
	}
}
