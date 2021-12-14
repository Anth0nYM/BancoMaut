import java.time.LocalDate;

public class teste{
 public static void main(String[]args){
   LocalDate datanasc = LocalDate.of(2000,5,20);
   Endereco enderecoDoCliente1 = new Endereco("rua 1",1,"Naturais","cidade dos numeros","IN");
   Cliente cliente1 = new Cliente ("Anthony","01", datanasc,enderecoDoCliente1);
   Conta conta1 = new Conta(1, 1, cliente1);
   Conta conta2 = new Conta(1,2,cliente1);
  System.out.println(conta1.getCliente().getNome());
  System.out.println(conta2.getCliente().getNome());
  }
}