package Matemática;

public class Triangulo extends Figura{
	
	private double base;
	private double altura;

	public Triangulo(String nome, String cor, double base, double altura) {
		super(nome, cor);
		this.altura =  altura;
		this.base = base;
	}

	@Override
	public double calcularArea() {
		return (this.base * this.altura)/ 2;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	

}
