
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais!");
		int idade = 17;
		if (idade >= 18) {
			System.out.println("Voc� � maior de 18 anos!");
			System.out.println("Se ferrou, ot�rio!");
		} else {
				System.out.println("Aproveite bastante, antes que sua vida seja arruinada!");
			}
		
		idade = 15;
		int quantidadePessoas = 1;
		if (idade >= 18) {
			System.out.println("Voc� pode entrar, pois j� � maior de 18");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voc� n�o � maior de 18, mas est� acompanhado. Pode entrar.");
			} else {
				System.out.println("Infelizmente voc� n�o p�de entrar, pois n�o est� acompanhado nem � maior de 18 anos.");
			}
		}
	}
}
