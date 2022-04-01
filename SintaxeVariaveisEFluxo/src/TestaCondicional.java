
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais!");
		int idade = 17;
		if (idade >= 18) {
			System.out.println("Você é maior de 18 anos!");
			System.out.println("Se ferrou, otário!");
		} else {
				System.out.println("Aproveite bastante, antes que sua vida seja arruinada!");
			}
		
		idade = 15;
		int quantidadePessoas = 1;
		if (idade >= 18) {
			System.out.println("Você pode entrar, pois já é maior de 18");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não é maior de 18, mas está acompanhado. Pode entrar.");
			} else {
				System.out.println("Infelizmente você não póde entrar, pois não está acompanhado nem é maior de 18 anos.");
			}
		}
	}
}
