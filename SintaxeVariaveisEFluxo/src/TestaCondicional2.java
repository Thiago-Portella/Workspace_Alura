
public class TestaCondicional2 {

	public static void main(String[] args) {
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println(acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja benvindo. Agora vamos dançar a dança da mãozinha!");
		} else {
			System.out.println("Desculpe, mas você não vai poder dançar a dança da mãozinha com a gente, pois não trouxe mais de dois acompanhantes, nem possui maior idade.");
		}
	}
}
