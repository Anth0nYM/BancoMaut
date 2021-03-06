import java.time.LocalDate;
public class teste {
  public static void main(String[] args) {
    Cliente cliente1 = new Cliente("Anthony", "01", LocalDate.of(2000, 10, 3),
        new Endereco("Rua Maria Borges", 10, "Samambaia", "Picos", "PI"));
    Conta cc = new Contacorrente(1, 1, cliente1);
    Conta cp = new Contapoupanca(1, 2, cliente1);
    cp.deposita(100);
    cc.deposita(100);
    cc.tranfere(50, cp);
    cc.tranfere(10, cp);
    cc.tranfere(40, cp);
    System.out.println(cc.getSaldo());
    System.out.println(cp.getSaldo());
  }
}