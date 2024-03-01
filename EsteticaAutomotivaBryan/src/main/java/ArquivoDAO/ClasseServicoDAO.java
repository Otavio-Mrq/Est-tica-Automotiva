package ArquivoDAO;

import Codigos.Servico;
import java.sql.*;
import javax.swing.JOptionPane;

public class ClasseServicoDAO {

    private Connection conexao;

    public void insert(Servico servico) {
        conexao = new ClasseConexao().conectaBDD();

        try {
            String sql = "INSERT INTO servico (valor, descricao, nome, telefone, cpf) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ps.setFloat(1, servico.getValor());
            ps.setString(2, servico.getDescricao());
            ps.setString(3, servico.getNome());
            ps.setString(4, servico.getTelefone());
            ps.setString(5, servico.getCpf());

            ResultSet rs = ps.executeQuery();
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }

    public void delete(Servico servico) {
        conexao = new ClasseConexao().conectaBDD();
        String sql = "DELETE FROM Cliente WHERE id = ?";

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setInt(1, servico.getId());

            int linhasExcluidas = ps.executeUpdate();

            if (linhasExcluidas == 0) {
                System.out.println("Nenhum registro encontrado para o ID: " + servico.getId());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Servico servico) {
        String sql = "UPDATE Servico SET valor = ?, descricao = ?, nome = ?, telefone = ?, cpf = ? WHERE id = ?";
        conexao = new ClasseConexao().conectaBDD();

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setFloat(1, servico.getValor());
            ps.setString(2, servico.getDescricao());
            ps.setString(3, servico.getNome());
            ps.setString(4, servico.getTelefone());
            ps.setString(5, servico.getCpf());

            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated == 0) {

                System.out.println("Nenhum registro encontrado para o ID: " + servico.getId());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
