package aula;

public class Calculos {
	public double soma(double i, double n){
		double total = 0;
		
		total = i + n;
		
		return total;
	}
	public double subtraçao(double i, double n){
		double total = 0;
		
		total = i - n;
		
		return total;
	}
	public double divisao(double i, double n){
		double total = 0;
		
		total = i / n;
		
		return total;
	}
	public double multiplicacao(double i, double n){
		double total = 0;
		
		total = i * n;
		
		return total;
		}
	public double raiz(double i){
		double total = 0;
		
		total = Math.sqrt(i);
		
		return total;
	}
	public double porcentagem(double i, double n){
		double total = 0;
		
		total = (i * n) / 100 ;
		
		return total;
	}
}