public class Metodos{
    
	public static void main(String[] args) {
		impressao();
		mensagem("Estamos estudando Programação Orientada a Objeto");
		System.out.println("O dobro do numero é: " + dobro(20));
		System.out.println("O resultado é: " + calcular(2,1,5));
		System.out.println("O resultado é: " + calcular(2.3,1.5));
		System.out.println("O resultado é: " + calcular(2,1));
		
		double[] notas = {8.9,7.4,5.6,9};
		System.out.println(notas.length);
		System.out.println("A média das notas é: " + calcular(notas));
		System.out.printf("%s%.1f%n", "A média das notas é: ", calcular(notas));
		System.out.println("O fatorial é : " + fatorial(8));
	}
	
	
	//método sem retorno e sem passagem de parâmetro
	public static void impressao() {
		System.out.println("Java é lindo!");
		
	}
	
	//método se retorno mas com passagem de parâmetro
	public static void mensagem(String msg) {
		System.out.println(msg);
	}
	
	//método com retorno
	public static int dobro(int numero) {
		return numero * 2;
	}
	
	// sobrecarga de métodos
	public static double calcular(double num1, double num2) {
		return num1 + num2;
	}
	
	public static int calcular(int num1, int num2) {
		return num1 + num2;
	}
	public static int calcular(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public static double calcular(double[] numeros) {
		double soma = 0;
		
		// numeros =[2,4,6,8,10]
		//			 0 1 2 3  4
		
//		for(int i = 0; i < numeros.length; i++) {
//			soma += numeros[i];
//		}
		
					
		for(double x:numeros) {
			soma += x;
		}
		
		return soma/numeros.length;
	}
}