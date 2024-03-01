package ArquivoDAO;

import java.sql.*;
import java.util.Properties;
import javax.swing.JOptionPane;

public class ClasseConexao {

    public Connection conectaBDD(){
        // Declara uma variável para armazenar a conexão.
        
        Connection conexao = null;
       
        try{
            //String url = "jdbc:mysql://localhost:3306/usuariossa";
             conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuariossa","root","");
            // Define a URL de conexão com o banco de dados usando a URL especificada.
           
            //conexao = DriverManager.getConnection(url);
            // Estabelece a conexão com o banco de dados usando a URL especificada.
            
        } catch (SQLException erro) {
            // Trata exceções SQLException que podem ocorrer durante a conexão.
            
            JOptionPane.showMessageDialog(null, erro.getMessage());
            // Exibe uma caixa de diálogo com a mensagem de erro obtida da exceção.
        }
        
        return conexao;
    }
}
