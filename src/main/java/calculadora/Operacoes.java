package calculadora;

/**
 * Classe responsável pelas operações matemáticas simples
 * 
 * @author Ícaro Silva
 * @since 17/02/2018
 */
public class Operacoes {
   
	/**
	 * Método responsável por somar dois valores
	 * 
	 * @param a
	 * @param b
	 * @return resultado - valor retornado após efetuar a operação
	 */
	public double somar(double a, double b) {
		double resultado = a + b;
		return resultado;
	}
	
	/**
	 * Método responsável por multiplicar dois valores
	 * 
	 * @param a
	 * @param b
	 * @return resultado - valor retornado após efetuar a operação
	 */
	public double multiplicar(double a, double b) {
		double resultado = a * b;
		return resultado;
	}
	
	/**
	 * Método responsável por dividir dois valores
	 * 
	 * @param a
	 * @param b
	 * @return resultado - valor retornado após efetuar a operação
	 */
	public double dividir(double a, double b) {
		double resultado = a / b;
		return resultado;
	}
	
	/**
	 * Método responsável por subtrair dois valores
	 * 
	 * @param a
	 * @param b
	 * @return resultado - valor retornado após efetuar a operação
	 */
	public double subtrair(double a, double b) {
		double resultado = a - b;
		return resultado;
	}
	
}
