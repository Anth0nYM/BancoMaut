import java.time.LocalDate;

public class teste{
 public static void main(String[]args){
   LocalDate datanasc = LocalDate.of(2000,5,20);
   Cliente cliente1 = new Cliente ("Anthony","01", datanasc, new Endereco("rua 1",1,"Naturais","cidade dos numeros","IN"));
   Conta conta1 = new Conta(1, 1, cliente1);
   Conta conta2 = new Conta(1,2,cliente1);
   
   conta1.deposita(500);
   conta1.tranfere(250, conta2);
   conta2.saca(100);
  
  System.out.println(conta1.getSaldo());
  System.out.println(conta2.getSaldo());
  }
}