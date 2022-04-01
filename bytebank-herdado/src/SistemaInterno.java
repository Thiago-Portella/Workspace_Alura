
public class SistemaInterno {
    private int senha = 1234;
    public void autentica(Autenticavel fa) {
        boolean autenticou = fa.autentica(this.senha);
        if (autenticou) {
            System.out.println("Entrou no sistema interno.");
        } else {
            System.out.println("N�o entrou no sistema interno.");
        }
    }
}
