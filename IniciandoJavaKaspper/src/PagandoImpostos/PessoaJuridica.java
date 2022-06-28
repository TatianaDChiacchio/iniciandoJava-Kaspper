package PagandoImpostos;

public class PessoaJuridica extends Pessoa{
	
	private int numeroFuncionarios;

	public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double calcularImposto() {
		double imposto = 0;
		if(this.numeroFuncionarios > 10) {
			imposto = getRendaAnual() * 0.14;
		}else {
			imposto = getRendaAnual() * 0.20;
		}
		return imposto;
	}

}
