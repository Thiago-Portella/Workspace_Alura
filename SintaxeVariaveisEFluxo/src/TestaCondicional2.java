
public class TestaCondicional2 {

	public static void main(String[] args) {
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println(acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja benvindo. Agora vamos dan�ar a dan�a da m�ozinha!");
		} else {
			System.out.println("Desculpe, mas voc� n�o vai poder dan�ar a dan�a da m�ozinha com a gente, pois n�o trouxe mais de dois acompanhantes, nem possui maior idade.");
		}
	}
}
