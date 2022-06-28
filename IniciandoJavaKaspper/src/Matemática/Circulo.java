package Matemática;

public class Circulo extends Figura{
	
	private double raio;
	
	private final double pi = Math.PI;

	public Circulo(String nome, String cor, double raio) {
		super(nome, cor);
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return this.pi * Math.pow(this.raio,2);
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getPi() {
		return pi;
	}
	
	

}
