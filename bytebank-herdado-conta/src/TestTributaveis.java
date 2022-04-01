
public class TestTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100);
        SeguroDeVida seg = new SeguroDeVida();
        CauculadorDeImposto calc = new CauculadorDeImposto();
        calc.registra(cc);
        calc.registra(seg);
        System.out.println(calc.getTotalImposto());
    }

}
