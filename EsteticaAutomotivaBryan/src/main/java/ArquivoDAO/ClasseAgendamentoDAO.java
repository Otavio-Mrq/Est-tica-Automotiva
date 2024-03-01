package ArquivoDAO;

import Codigos.Agendamento;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClasseAgendamentoDAO {

    private Connection conexao;
    
    public void insert(Agendamento agendamento) {
        conexao = new ClasseConexao().conectaBDD();

        try {
            String sql = "INSERT INTO agendamento (data, observacao, valor, descricao, nome, telefone, cpf) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, agendamento.getData());
            ps.setString(2, agendamento.getObservacao());
            ps.setFloat(3, agendamento.getValor());
            ps.setString(4, agendamento.getDescricao());
            ps.setString(5, agendamento.getNome());
            ps.setString(6, agendamento.getTelefone());
            ps.setString(7, agendamento.getCpf());

            ResultSet rs = ps.executeQuery();
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }

    public void delete(Agendamento agendamento) {
        conexao = new ClasseConexao().conectaBDD();
        String sql = "DELETE FROM Servico WHERE id = ?";

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setInt(1, agendamento.getId());

            int linhasExcluidas = ps.executeUpdate();

            if (linhasExcluidas == 0) {
                System.out.println("Nenhum registro encontrado para o ID: " + agendamento.getId());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Agendamento agendamento) {
        String sql = "UPDATE Servico SET data = ?, observacao = ?, valor = ?, descricao = ?, nome = ?, telefone = ?, cpf = ? WHERE id = ?";
        conexao = new ClasseConexao().conectaBDD();

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            
            ps.setString(1, agendamento.getData());
            ps.setString(2, agendamento.getObservacao());
            ps.setFloat(3, agendamento.getValor());
            ps.setString(4, agendamento.getDescricao());
            ps.setString(5, agendamento.getNome());
            ps.setString(6, agendamento.getTelefone());
            ps.setString(7, agendamento.getCpf());

            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated == 0) {

                System.out.println("Nenhum registro encontrado para o ID: " + agendamento.getId());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
