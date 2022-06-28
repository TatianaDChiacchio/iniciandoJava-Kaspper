package PagandoImpostos;

public class PessoaFisica extends Pessoa {
	
	private double gastosComSaude;

	public PessoaFisica(String nome, double rendaAnual, double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public double calcularImposto() {
		double imposto = 0;
		 if(this.getRendaAnual() < 20000) {
			 imposto = getRendaAnual() * 0.15;
		 }else {
			 imposto = getRendaAnual() * 0.25;
		 }
		 
		 if(this.gastosComSaude > 0) {
			 imposto -= this.gastosComSaude *0.5;
		 }
		
		return imposto;
	}

	public double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}
	
	

}
