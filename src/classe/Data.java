package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data() {//contrutor padrão
		
		this(1,1,1970);//this como método: chama o construtor
		
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;//this é uma das instâncias da classe
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d\n", this.dia, this.mes,this.ano);
	}
	
	

}
