
public class Aula02 {

	public static void main(String[] args) {
		
		int posicao = 5;
		switch(posicao) {
			case 1:
				System.out.println("Você chegou em primeiro lugar");
				break;
			case 2:
				System.out.println("Você chegou em segundo lugar");
				break;
			case 3:
				System.out.println("Você chegou em terceiro lugar");
				break;
			case 4: case 5: case 6:
				System.out.println("Você vai ganhar um prêmio de participação");
				break;
			default:
				System.out.println("Nennuma premiação");
				
		}
		

	}

}