import java.time.LocalDate;
public class Cliente {
    private String nome;
    private String CPF;
    private LocalDate dataDeNascimento;
    private Endereco endereco;
    public Cliente(String nome, String CPF, LocalDate dataDeNascimento, Endereco endereco){
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


    public Endereco getEndereco() {
        return endereco;
    }


    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
