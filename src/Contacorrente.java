public class Contacorrente extends Conta {
    private Double chequeEspecial;
    public Contacorrente(int agencia, int numero, Cliente cliente) {
        super(agencia, numero, cliente);
        this.chequeEspecial = 100.00;
        // TODO Auto-generated constructor stub
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public boolean saca(double valor) {
        if (valor <= super.saldo + this.chequeEspecial) {
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
    public void deposita(double valor) {
        if (valor > 0.0) {
            super.saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor para deposito não pode ser menor que 0!");
        }
    }

    @Override
    public void tranfere(double valor, Conta contaDestino) {
        System.out.println("Transferindo valor entre contas...");
            boolean saqueComSucesso = this.saca(valor);
            if (saqueComSucesso) {
                contaDestino.deposita(valor);
            }
            this.enviaNotificacao("transferencia", valor);
        }
    }
