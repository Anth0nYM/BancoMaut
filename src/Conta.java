public class Conta{
private int agencia;
private int numero;
private double saldo;
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
}
public void saca(double valor){
    if(valor <= saldo){
        saldo -= valor;
        System.out.println("Saque realizado, saldo atual: " + saldo);
    } else{
        System.out.println("Você não possuí saldo suficiente para sacar esse valor");
    }
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
}

