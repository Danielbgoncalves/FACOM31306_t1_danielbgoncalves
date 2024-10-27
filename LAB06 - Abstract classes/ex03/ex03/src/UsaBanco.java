public class UsaBanco {
    public static void main(String[] args) {
    ContaCorrente a = new ContaEspecial(1200.00f, 1876, 3953, 783457);
    ContaCorrente b = new ContaEspecial(15400.00f, 1576, 3249, 7547);
    ContaCorrente c = new ContaEspecial(1235.30f, 1526, 7895, 479);
    ContaCorrente d = new ContaEspecial(1200.00f, 1822, 5783, 11346);

    a.debitaValor(536.0f);
    d.creditaValor(1325,53);
    b.creditaValor(3249,593);
    c.isSenha(678);

    }
}