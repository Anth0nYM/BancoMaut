import java.time.LocalDate;
public class Cliente {
    private String nome;
    private String CPF;
    private LocalDate dataDeNascimento;
    private String endereco;

    public Cliente(String nome, String CPF, LocalDate dataDeNascimento, String endereco){
        this.nome = nome;
        this.CPF = CPF;
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = endereco; 
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}