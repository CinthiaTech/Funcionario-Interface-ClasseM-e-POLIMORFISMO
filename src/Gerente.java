public class Gerente extends Funcionário implements Autenticavel {

    private int senha;


    public double getBonificacao() {
        return  super.bonificação();

    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {

        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
}


