package classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	Produto(String nomeInicial){//construtor expl�cito
		nome = nomeInicial;
	}

	double precoComDesconto() {//n�o recebe par�metros, pois j� est� no objeto Produto
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
