package Matemática;

public class Principal {

	public static void main(String[] args) {

		Figura r1 = new Retangulo("Retângulo","verde", 10,20);
		System.out.println("Eu sou um " + r1.getNome());
		//System.out.println("Minha área é: " + r1.calcularArea());
		System.out.printf("%s%.2f%n", "Minha área é: ",r1.calcularArea());
		
		Figura t1 = new Triangulo("Triângulo","azul",11,25);
		System.out.println("Eu sou um " + t1.getNome());
		//System.out.println("Minha área é: "  + t1.calcularArea());
		System.out.printf("%s%.2f%n","Minha área é: ", t1.calcularArea());
	}

}
