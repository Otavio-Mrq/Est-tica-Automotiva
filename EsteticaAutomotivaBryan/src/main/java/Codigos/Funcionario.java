package Codigos;
import javax.swing.JOptionPane;

public class Funcionario extends DadosPessoais{
    
    public Funcionario(int id, String nome, String sexo, String dataDeNascimento, String telefone, String cpf, String email, String nivelDeAcesso, String senha) {
        super(id, nome, sexo, dataDeNascimento, telefone, cpf, email, nivelDeAcesso, senha);
    }

    public Funcionario(int id,String nome,String senha) {
        super(0, null, null);
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(String nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void dados(){
        JOptionPane.showMessageDialog(null, "ID : "+id+""
                + "\nNome : "+nome+""
                        + "\nSexo : "+sexo+""
                                + "\nData de Nascimento : "+dataDeNascimento+""
                                        + "\nTelefone : "+telefone+""
                                                + "\nCPF : "+cpf+""
                                                        + "\nEmail : "+email+""
                                                                + "\nNivel de Acesso :"+nivelDeAcesso);
    }
}