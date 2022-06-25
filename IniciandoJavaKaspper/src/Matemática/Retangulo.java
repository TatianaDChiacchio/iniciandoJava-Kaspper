package Matemática;

public class Retangulo extends Figura{
	
	private double altura;
	private double base;

	public Retangulo(String nome, String cor, double altura, double base) {
		super(nome, cor);
		this.altura = altura;
		this.base = base;
	}

	@Override
	public double calcularArea() {
		return this.base * this.altura;
	}

	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	

}
