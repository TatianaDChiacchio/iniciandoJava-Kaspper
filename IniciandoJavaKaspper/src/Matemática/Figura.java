// uma superClasse -> Figura -> nome, cor -> calcularArea()
//		subclasses -> Retangulo
//					  Triangulo
//					  Circulo

// Interface -> FiguraInterface -> CalcularArea()

package Matemática;

public abstract class Figura implements FiguraInterface{

	private String nome;
	private String cor;
	
	
	public Figura(String nome, String cor) {
		this.nome = nome;
		this.cor = cor;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
}




// SuperClasse -> Animal
			// -Cachorro
			// -Gato
			// -Passaro

//SuperClasse -> ContaBancária - titular, numConta, numAg, saldo
							// - depositar(), sacar() 

			// -ContaCorrente
			// -ContaEspecial
			// -ContaPoupança
// TODAS as subclasses herdam os atributos e os métodos da superclasse

// Interface - contrato assinado pela classe, onde são listados todos os métodos que a classe
// é obrigada a implementar





