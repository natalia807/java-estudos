package classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	Produto(String nomeInicial){//construtor explícito
		nome = nomeInicial;
	}

	double precoComDesconto() {//não recebe parâmetros, pois já está no objeto Produto
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
