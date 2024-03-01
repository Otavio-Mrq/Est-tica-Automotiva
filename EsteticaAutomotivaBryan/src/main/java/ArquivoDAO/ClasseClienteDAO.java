package ArquivoDAO;

import Codigos.Cliente;
import java.sql.*;
import javax.swing.JOptionPane;

public class ClasseClienteDAO {

    private Connection conexao;

    public void insert(Cliente cliente) {
        conexao = new ClasseConexao().conectaBDD();

        try {
            String sql = "INSERT INTO cliente (nome, sexo, dataDeNascimento, telefone, cpf, email) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm = conexao.prepareStatement(sql);

            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getSexo());
            pstm.setString(3, cliente.getDataDeNascimento());
            pstm.setString(4, cliente.getTelefone());
            pstm.setString(5, cliente.getCpf());
            pstm.setString(6, cliente.getEmail());

            ResultSet rs = pstm.executeQuery();
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }

    public void delete(Cliente cliente) {
        conexao = new ClasseConexao().conectaBDD();
        String sql = "DELETE FROM DadosPessoais WHERE id = ?";

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setInt(1, cliente.getId());

            int linhasExcluidas = ps.executeUpdate();

            if (linhasExcluidas == 0) {
                System.out.println("Nenhum registro encontrado para o ID: " + cliente.getId());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Cliente cliente) {
        String sql = "UPDATE DadosPessoais SET nome = ?, sexo = ?, dataDeNascimento = ?, telefone = ?, cpf = ?, email = ? WHERE id = ?";
        conexao = new ClasseConexao().conectaBDD();

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getSexo());
            ps.setString(3, cliente.getDataDeNascimento());
            ps.setString(4, cliente.getTelefone());
            ps.setString(5, cliente.getCpf());
            ps.setString(6, cliente.getEmail());

            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated == 0) {

                System.out.println("Nenhum registro encontrado para o ID: " + cliente.getId());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
