abstract public class Conta{
private int agencia;
private int numero;
protected double saldo;
private Cliente cliente;

public Conta(int agencia, int numero, Cliente cliente) {
 this.agencia = agencia;
 this.numero = numero;
 this.cliente = cliente;
}
 public void deposita(double valor){
    if (valor < 0){
        System.out.println("Não é permitido o deposito de valores negativos");
    }
    this.saldo += valor;
    System.out.println("Valor depositado, saldo atual: " + saldo);
    this.enviaNotificacao("deposita", valor);
}
abstract public boolean saca(double valor);
 public void tranfere(double valor, Conta contaDestino) {
    System.out.println("Transferindo valor entre contas...");
    boolean saqueComSucesso = this.saca(valor);
    if (saqueComSucesso){
        contaDestino.deposita(valor);
    }
    this.enviaNotificacao("transferencia", valor);
}
protected void enviaNotificacao(String operacao, double valor ){
    new Notificacao().sendEmail(operacao, valor);
}

public int getAgencia() {
    return agencia;
}
public int getNumero() {
    return numero;
}
public Cliente getCliente() {
    return cliente;
}
public double getSaldo() {
    return saldo;
}
}

