package ArquivoDAO;

import Codigos.Funcionario;
import java.sql.*;
import javax.swing.JOptionPane;

public class ClasseFuncionarioDAO {
    private Connection conexao;
    
    public void insert(Funcionario funcionario){
        conexao = new ClasseConexao().conectaBDD();
        
        try{
            String sql = "INSERT INTO funcionario (id, nome, sexo, dataDeNascimento, telefone, cpf, email, nivelDeAcesso, senha) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ps.setString(1, funcionario.getNome());
            ps.setString(2, funcionario.getSexo());
            ps.setString(3, funcionario.getDataDeNascimento());
            ps.setString(4, funcionario.getTelefone());
            ps.setString(5, funcionario.getCpf());
            ps.setString(6, funcionario.getEmail());
            ps.setString(7, funcionario.getNivelDeAcesso());
            ps.setString(8, funcionario.getSenha());
            
            ResultSet rs = ps.executeQuery();
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }
    
    public void delete(Funcionario funcionario){
        conexao = new ClasseConexao().conectaBDD();
        String sql = "DELETE FROM DadosPessoais WHERE id = ?";
        
        try (PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setInt(1, funcionario.getId());
            
            int linhasExcluidas = ps.executeUpdate();
            
            if(linhasExcluidas == 0){
                System.out.println("Nenhum registro encontrado para o ID: " +funcionario.getId());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void update(Funcionario funcionario) {
        String sql = "UPDATE DadosPessoais SET nome = ?, sexo = ?, dataDeNascimento = ?, telefone = ?, cpf = ?, email = ?, nivelDeAcesso = ?, senha = ? WHERE id = ?";
        conexao = new ClasseConexao().conectaBDD();
        
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, funcionario.getNome()); 
            ps.setString(2, funcionario.getSexo());
            ps.setString(3, funcionario.getDataDeNascimento());
            ps.setString(4, funcionario.getTelefone());
            ps.setString(5, funcionario.getCpf());
            ps.setString(6, funcionario.getEmail());
            ps.setString(7, funcionario.getNivelDeAcesso());
            ps.setString(8, funcionario.getSenha());

            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated == 0) {
                
                System.out.println("Nenhum registro encontrado para o ID: " + funcionario.getId());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
