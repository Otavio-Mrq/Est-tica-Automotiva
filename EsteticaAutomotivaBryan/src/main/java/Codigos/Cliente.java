package Codigos;
import javax.swing.JOptionPane;

public class Cliente extends DadosPessoais{
    
    public Cliente(int id, String nome, String sexo, String dataDeNascimento, String telefone, String cpf, String email, String endereco, int cep) {
        super(id, nome, sexo, dataDeNascimento, telefone, cpf, email, endereco, cep);
    }

    public Cliente(int id, String nome, String telefone, String cpf) {
        super(id, nome, telefone, cpf);
    }

    public int getCep() {
        return cep;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getId() {
        return id;
    }

    public String getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public void setNivelDeAcesso(String nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
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
                                                                + "\nEndereço : "+endereco+""
                                                                        + "\nCEP : "+cep);
    }
    
}