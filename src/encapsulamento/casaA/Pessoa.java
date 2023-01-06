package encapsulamento.casaA;

public class Pessoa {

	private int idade;
	
	public Pessoa(int idade) {
		alterarIdade(idade);// chama o método na construção
	}
	
	public int lerIdade() {
		return idade;
	}
	
	public void alterarIdade(int novaIdade) {
		
		if(novaIdade >= 0 && novaIdade <= 100) {
			this.idade = novaIdade;
		}
		
	}
}
