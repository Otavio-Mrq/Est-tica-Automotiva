package Codigos;
public abstract class DadosPessoais {
    
    protected int id;
    protected String nome;
    protected String sexo;
    protected String dataDeNascimento;
    protected String telefone;
    protected String cpf;
    protected String email;
    protected String endereco;
    protected int cep;
    protected String nivelDeAcesso;
    protected String senha;

    public DadosPessoais(int id, String nome, String sexo, String dataDeNascimento, String telefone, String cpf, String email, String endereco, int cep) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.cep = cep;
    }

    public DadosPessoais(int id, String nome, String sexo, String dataDeNascimento, String telefone, String cpf, String email, String nivelDeAcesso,String senha) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
        this.nivelDeAcesso = nivelDeAcesso;
        this.senha= senha;
    }

    public DadosPessoais(int id, String nome, String telefone, String cpf) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public DadosPessoais(int id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }
    
    
    
}
