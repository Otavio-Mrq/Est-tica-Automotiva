package Controlador;

import Codigos.Funcionario;
import Telas.Principal;
import Telas.TelaLogin;
import ArquivoDAO.ClasseConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class ControladorDoLogin {
    private Connection conexao;
    private final TelaLogin view;
    
    public ControladorDoLogin(TelaLogin view) {
        this.view = view;
    }
    
    /*public Funcionario obterModelo(){
        String nome = view.getPegaNomeLogin().getText();
        String senha = view.getPegaSenhaLogin().getText();
        Funcionario modelo = new Funcionario(0, nome, senha);
        return modelo;
        
    }
    */
    /*public void setarModelo(Funcionario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        view.getPegaNomeLogin().setText(nome);
        view.getPegaSenhaLogin().setText(senha);
    }
    */
    public void entrarNoSistema(){
        //obterModelo();
        conexao = new ClasseConexao().conectaBDD();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM usuariossa.funcionarios WHERE Nome = ? AND Senha = ?";
        try {
            
            pst = conexao.prepareStatement(sql);
            pst.setString(1, view.getPegaNomeLogin().getText());
            pst.setString(2,view.getPegaSenhaLogin().getText());
            
            rs = pst.executeQuery();
            
            if(rs.next()){
                
            Principal principal = new Principal();
            principal.setVisible(true);
            this.view.dispose();
            
            }else{
                JOptionPane.showMessageDialog(null, "Usuário e/ou Senha incorreto(s)!");
            }
            
        } catch (Exception e) {
            
        }
        
        
    }


}