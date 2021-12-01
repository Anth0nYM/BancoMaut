import java.util.Date;
//import java.util.Scanner;
public class Cliente {
    private String nome;
    private String CPF;
    private Date dataDeNascimento;
    private String endereco;
    private Conta contas;

    public Cliente(String nome, String CPF, Date dataDeNascimento, String endereco){
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

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Conta getContas() {
        return contas;
    }
    }