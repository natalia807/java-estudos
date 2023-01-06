package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook");//instância
		//p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		var p2 = new Produto("Caneta preta");//instância
		//p2.nome = "Caneta preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		//calculando o valor final
		/*System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.preco * (1 - p1.desconto);
		double precoFinal2 = p2.preco * (1 - p2.desconto);
		System.out.println(precoFinal1 + precoFinal2);*/
		
		//calculando chamando o método
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		
		System.out.println(precoFinal1 + precoFinal2);
		
	}
}
