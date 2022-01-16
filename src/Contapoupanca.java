public class Contapoupanca extends Conta {
    private double rendimento;

    public Contapoupanca(int agencia, int numero, Cliente cliente) {
        super(agencia, numero, cliente);
        this.rendimento = 0.02;
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean saca(double valor) {
        if (valor <= super.saldo) {
            super.saldo -= valor;
            System.out.println("Saque realizado, saldo atual: " + saldo);
            super.enviaNotificacao("Saque", valor);
            return true;
        } else {
            System.out.println("Você não possuí saldo suficiente para sacar esse valor");
        }
        return false;
    }

    @Override
    public void tranfere(double valor, Conta contaDestino) {
        System.out.println("Transferindo valor entre contas...");
        boolean saqueComSucesso = this.saca(valor);
        if (saqueComSucesso) {
            contaDestino.deposita(valor);
        }
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

}
