
public class TestaValores {

	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		System.out.println(segundo);
		segundo = primeiro;
		System.out.println(segundo);
		primeiro = 5;
		segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		System.out.println("O segundo vale 5.");
		System.out.println(segundo);
		
	}
}
