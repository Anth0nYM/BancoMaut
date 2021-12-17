import java.time.LocalDate;

public class teste{
 public static void main(String[]args){
   Cliente cliente1 = new Cliente("Anthony", "01", LocalDate.of(2000,10,3), 
   new Endereco("Rua Maria Borges", 10, "Samambaia", "Picos", "PI"));
   Contacorrente cc = new Contacorrente(1, 1, cliente1);
   cc.deposita(100);
 }
}