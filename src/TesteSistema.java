public class TesteSistema {
    public static void main(String[] args) {

    Gerente g = new Gerente();
g.setSenha(2222);

    SistemaInterno si = new SistemaInterno();

si.autentica(g);



        Autenticavel referencia1 = new Gerente();

        Autenticavel referencia2 = new Cliente();

        Autenticavel referencia3 = new Administrador();

    }

}