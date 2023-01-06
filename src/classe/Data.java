package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data() {//contrutor padr�o
		
		this(1,1,1970);//this como m�todo: chama o construtor
		
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;//this � uma das inst�ncias da classe
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d\n", this.dia, this.mes,this.ano);
	}
	
	

}
