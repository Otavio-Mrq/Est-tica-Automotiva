/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import ArquivoDAO.ClasseConexao;
import Codigos.Funcionario;
import Controlador.ControladorPrincipal;
import Controlador.ControladorFuncionario;
import java.sql.*;
import javax.swing.JOptionPane;

public class CadastrarFuncionario extends javax.swing.JFrame {

    
    private final ControladorFuncionario funcionario;
    public CadastrarFuncionario() {
        initComponents();
        funcionario = new ControladorFuncionario(this);
    }
    
    private Connection conexao;
    
    public void insert(Funcionario funcionario){
        conexao = new ClasseConexao().conectaBDD();
        
        try{
            String sql = "INSERT INTO funcionario (id, nome, sexo, dataDeNascimento, telefone, cpf, email, nivelDeAcesso, senha) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm = conexao.prepareStatement(sql);
            
            pstm.setString(1, funcionario.getNome());
            pstm.setString(2, funcionario.getSexo());
            pstm.setString(3, funcionario.getDataDeNascimento());
            pstm.setString(4, funcionario.getTelefone());
            pstm.setString(5, funcionario.getCpf());
            pstm.setString(6, funcionario.getEmail());
            pstm.setString(7, funcionario.getNivelDeAcesso());
            pstm.setString(8, funcionario.getSenha());
            
            ResultSet rs = pstm.executeQuery();
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genero = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        OpcaoFemininoFuncionario = new javax.swing.JRadioButton();
        OpcaoOutrosFuncionario = new javax.swing.JRadioButton();
        OpcaoMasculinoFuncionario = new javax.swing.JRadioButton();
        TelefoneFunc = new javax.swing.JTextField();
        EmailFunc = new javax.swing.JTextField();
        CPFFunc = new javax.swing.JTextField();
        NivelAcessoFunc = new javax.swing.JTextField();
        SenhaFunc = new javax.swing.JTextField();
        NomeCompletoFunc = new javax.swing.JTextField();
        Senha = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        NivelAcesso = new javax.swing.JLabel();
        CPF = new javax.swing.JLabel();
        Telefone = new javax.swing.JLabel();
        DataNascimento = new javax.swing.JLabel();
        Sexo = new javax.swing.JLabel();
        NomeCompleto = new javax.swing.JLabel();
        Cadastro = new javax.swing.JLabel();
        Func = new javax.swing.JLabel();
        DataNascimetoFunc = new com.toedter.calendar.JDateChooser();
        FundoBranco = new javax.swing.JPanel();
        BotaoCadastrarFunc = new javax.swing.JButton();
        FecharCadastroFunc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        genero.add(OpcaoFemininoFuncionario);
        OpcaoFemininoFuncionario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        OpcaoFemininoFuncionario.setForeground(new java.awt.Color(0, 224, 255));
        OpcaoFemininoFuncionario.setText("Feminino");
        jPanel1.add(OpcaoFemininoFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 370, -1, -1));

        genero.add(OpcaoOutrosFuncionario);
        OpcaoOutrosFuncionario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        OpcaoOutrosFuncionario.setForeground(new java.awt.Color(0, 224, 255));
        OpcaoOutrosFuncionario.setText("Outros");
        jPanel1.add(OpcaoOutrosFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 370, -1, -1));

        genero.add(OpcaoMasculinoFuncionario);
        OpcaoMasculinoFuncionario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        OpcaoMasculinoFuncionario.setForeground(new java.awt.Color(0, 224, 255));
        OpcaoMasculinoFuncionario.setText("Masculino");
        jPanel1.add(OpcaoMasculinoFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 370, -1, -1));
        jPanel1.add(TelefoneFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 450, 210, -1));
        jPanel1.add(EmailFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 530, 210, -1));
        jPanel1.add(CPFFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 490, 210, -1));
        jPanel1.add(NivelAcessoFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 570, 210, -1));
        jPanel1.add(SenhaFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 610, 210, -1));

        NomeCompletoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeCompletoFuncActionPerformed(evt);
            }
        });
        jPanel1.add(NomeCompletoFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 330, 210, -1));

        Senha.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Senha.setForeground(new java.awt.Color(0, 224, 255));
        Senha.setText("Senha:");
        jPanel1.add(Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 610, -1, -1));

        Email.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Email.setForeground(new java.awt.Color(0, 224, 255));
        Email.setText("Email:");
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, -1, -1));

        NivelAcesso.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        NivelAcesso.setForeground(new java.awt.Color(0, 224, 255));
        NivelAcesso.setText("Nivel de Acesso:");
        jPanel1.add(NivelAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 570, -1, -1));

        CPF.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        CPF.setForeground(new java.awt.Color(0, 224, 255));
        CPF.setText("CPF:");
        jPanel1.add(CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, -1, -1));

        Telefone.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Telefone.setForeground(new java.awt.Color(0, 224, 255));
        Telefone.setText("Telefone:");
        jPanel1.add(Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, -1, -1));

        DataNascimento.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        DataNascimento.setForeground(new java.awt.Color(0, 224, 255));
        DataNascimento.setText("Data Nascimento:");
        jPanel1.add(DataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, -1, -1));

        Sexo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Sexo.setForeground(new java.awt.Color(0, 224, 255));
        Sexo.setText("Sexo:");
        jPanel1.add(Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, -1, -1));

        NomeCompleto.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        NomeCompleto.setForeground(new java.awt.Color(0, 224, 255));
        NomeCompleto.setText("Nome Completo:");
        jPanel1.add(NomeCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, -1, -1));

        Cadastro.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        Cadastro.setForeground(new java.awt.Color(0, 224, 255));
        Cadastro.setText("CADASTRO");
        jPanel1.add(Cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 220, -1, -1));

        Func.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Func.setForeground(new java.awt.Color(0, 224, 255));
        Func.setText("Func");
        jPanel1.add(Func, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 250, -1, -1));
        jPanel1.add(DataNascimetoFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 410, 210, -1));

        FundoBranco.setBackground(new java.awt.Color(255, 255, 255));
        FundoBranco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotaoCadastrarFunc.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        BotaoCadastrarFunc.setForeground(new java.awt.Color(0, 224, 255));
        BotaoCadastrarFunc.setText("Cadastrar");
        FundoBranco.add(BotaoCadastrarFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 670, -1, -1));

        FecharCadastroFunc.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        FecharCadastroFunc.setForeground(new java.awt.Color(0, 224, 255));
        FecharCadastroFunc.setText("Fechar");
        FecharCadastroFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharCadastroFuncActionPerformed(evt);
            }
        });
        FundoBranco.add(FecharCadastroFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 670, 80, -1));

        jPanel1.add(FundoBranco, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 2020, 2420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1831, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FecharCadastroFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharCadastroFuncActionPerformed
        funcionario.entrarPrincipal();
    }//GEN-LAST:event_FecharCadastroFuncActionPerformed

    private void NomeCompletoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeCompletoFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeCompletoFuncActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrarFunc;
    private javax.swing.JLabel CPF;
    private javax.swing.JTextField CPFFunc;
    private javax.swing.JLabel Cadastro;
    private javax.swing.JLabel DataNascimento;
    private com.toedter.calendar.JDateChooser DataNascimetoFunc;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField EmailFunc;
    private javax.swing.JButton FecharCadastroFunc;
    private javax.swing.JLabel Func;
    private javax.swing.JPanel FundoBranco;
    private javax.swing.JLabel NivelAcesso;
    private javax.swing.JTextField NivelAcessoFunc;
    private javax.swing.JLabel NomeCompleto;
    private javax.swing.JTextField NomeCompletoFunc;
    private javax.swing.JRadioButton OpcaoFemininoFuncionario;
    private javax.swing.JRadioButton OpcaoMasculinoFuncionario;
    private javax.swing.JRadioButton OpcaoOutrosFuncionario;
    private javax.swing.JLabel Senha;
    private javax.swing.JTextField SenhaFunc;
    private javax.swing.JLabel Sexo;
    private javax.swing.JLabel Telefone;
    private javax.swing.JTextField TelefoneFunc;
    private javax.swing.ButtonGroup genero;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}