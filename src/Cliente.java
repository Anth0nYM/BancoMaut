import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String CPF;
    private LocalDate dataDeNascimento;
    private List<Endereco> enderecos = new ArrayList<>();

    public Cliente(String nome, String CPF, LocalDate dataDeNascimento, Endereco endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataDeNascimento = dataDeNascimento;
        this.enderecos.add(endereco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void addEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }

    public void removeEndereco(Endereco endereco) {
        this.enderecos.remove(endereco);
    }
}
