package classe;

public class AreaCirc {
	
	double raio;
	static double pi = 3.14;//membro de classe e n�o inst�ncia
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return pi * Math.pow(raio, 2);
	}

}
