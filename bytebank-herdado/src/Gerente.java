public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do gerente.");
        return 300;
    }

    public Gerente() {
        this.autenticador  = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

}