
public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("Vamos testar o escopo de vari�veis.");
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado;
		
		if (quantidadePessoas > 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		if (idade>=18 || acompanhado) {
			System.out.println("Pode entrar.");
		} else {
			System.out.println("Desculpe, mas voc� n�o pode entrar.");
		}
	}
}
