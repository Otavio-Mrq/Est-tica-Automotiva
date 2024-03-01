/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import java.sql.*;
import ArquivoDAO.ClasseConexao;
import Codigos.Cliente;
import Controlador.ControladorCliente;
import Controlador.ControladorPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class CadastrarCliente extends javax.swing.JFrame {

    private Connection conexao;

    public void insert(Cliente cliente) {
        conexao = new ClasseConexao().conectaBDD();

        try {
            String sql = "INSERT INTO funcionario (nome, sexo, dataDeNascimento, telefone, cpf, email) VALUES (?, ?, ?, ?, ?, ?)";
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
    
    private final ControladorCliente cliente;
    
    public CadastrarCliente() {
        initComponents();
        cliente = new ControladorCliente(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generocliente = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        PGEmailCliente = new javax.swing.JTextField();
        PGTelefoneCliente = new javax.swing.JTextField();
        PGCPFCliente = new javax.swing.JTextField();
        PGNomeCompletoCliente = new javax.swing.JTextField();
        PGBairroCliente = new javax.swing.JTextField();
        PGCEPCliente = new javax.swing.JTextField();
        OpcaoFemininoCliente = new javax.swing.JRadioButton();
        OpcaoMasculinoCliente = new javax.swing.JRadioButton();
        OpcaoOutrosCliente = new javax.swing.JRadioButton();
        BotaoCadastrarCliente = new javax.swing.JButton();
        FecharCadastroCliente = new javax.swing.JButton();
        CEP = new javax.swing.JLabel();
        Endereco = new javax.swing.JLabel();
        DataDeNascimento = new javax.swing.JLabel();
        Sexo = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Telefone = new javax.swing.JLabel();
        CPF = new javax.swing.JLabel();
        Bairro = new javax.swing.JLabel();
        Rua = new javax.swing.JLabel();
        Cadastro = new javax.swing.JLabel();
        NomeCompleto = new javax.swing.JLabel();
        CL = new javax.swing.JLabel();
        FundoBranco = new javax.swing.JPanel();
        ImagemFundo = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(PGEmailCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 560, 210, -1));

        PGTelefoneCliente.setText("55 (  )");
        PGTelefoneCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PGTelefoneClienteActionPerformed(evt);
            }
        });
        jPanel1.add(PGTelefoneCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 480, 210, -1));
        jPanel1.add(PGCPFCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 520, 210, -1));
        jPanel1.add(PGNomeCompletoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 360, 210, -1));
        jPanel1.add(PGBairroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 610, 210, -1));

        PGCEPCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PGCEPClienteActionPerformed(evt);
            }
        });
        jPanel1.add(PGCEPCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 660, 210, -1));

        OpcaoFemininoCliente.setBackground(new java.awt.Color(255, 255, 255));
        generocliente.add(OpcaoFemininoCliente);
        OpcaoFemininoCliente.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        OpcaoFemininoCliente.setForeground(new java.awt.Color(0, 224, 255));
        OpcaoFemininoCliente.setText("Feminino");
        OpcaoFemininoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcaoFemininoClienteActionPerformed(evt);
            }
        });
        jPanel1.add(OpcaoFemininoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 400, -1, -1));

        OpcaoMasculinoCliente.setBackground(new java.awt.Color(255, 255, 255));
        generocliente.add(OpcaoMasculinoCliente);
        OpcaoMasculinoCliente.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        OpcaoMasculinoCliente.setForeground(new java.awt.Color(0, 224, 255));
        OpcaoMasculinoCliente.setText("Masculino");
        OpcaoMasculinoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcaoMasculinoClienteActionPerformed(evt);
            }
        });
        jPanel1.add(OpcaoMasculinoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 400, -1, -1));

        OpcaoOutrosCliente.setBackground(new java.awt.Color(255, 255, 255));
        generocliente.add(OpcaoOutrosCliente);
        OpcaoOutrosCliente.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        OpcaoOutrosCliente.setForeground(new java.awt.Color(0, 224, 255));
        OpcaoOutrosCliente.setText("Outros");
        jPanel1.add(OpcaoOutrosCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 400, -1, -1));

        BotaoCadastrarCliente.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        BotaoCadastrarCliente.setForeground(new java.awt.Color(0, 224, 255));
        BotaoCadastrarCliente.setText("Cadastrar");
        BotaoCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(BotaoCadastrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 710, -1, -1));

        FecharCadastroCliente.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        FecharCadastroCliente.setForeground(new java.awt.Color(0, 224, 255));
        FecharCadastroCliente.setText("Fechar");
        FecharCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharCadastroClienteActionPerformed(evt);
            }
        });
        jPanel1.add(FecharCadastroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 710, 80, -1));

        CEP.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        CEP.setForeground(new java.awt.Color(0, 224, 255));
        CEP.setText("CEP:");
        jPanel1.add(CEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 660, -1, -1));

        Endereco.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Endereco.setForeground(new java.awt.Color(0, 224, 255));
        Endereco.setText("Endereço:");
        jPanel1.add(Endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 610, -1, -1));

        DataDeNascimento.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        DataDeNascimento.setForeground(new java.awt.Color(0, 224, 255));
        DataDeNascimento.setText("Data de Nascimento:");
        jPanel1.add(DataDeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, -1, -1));

        Sexo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Sexo.setForeground(new java.awt.Color(0, 224, 255));
        Sexo.setText("Sexo:");
        jPanel1.add(Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, -1, -1));

        Email.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Email.setForeground(new java.awt.Color(0, 224, 255));
        Email.setText("E-mail:");
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 560, -1, -1));

        Telefone.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Telefone.setForeground(new java.awt.Color(0, 224, 255));
        Telefone.setText("Telefone:");
        jPanel1.add(Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 480, -1, -1));

        CPF.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        CPF.setForeground(new java.awt.Color(0, 224, 255));
        CPF.setText("CPF:");
        jPanel1.add(CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, -1, -1));

        Bairro.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Bairro.setForeground(new java.awt.Color(255, 255, 255));
        Bairro.setText("Bairro");
        jPanel1.add(Bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 590, -1, -1));

        Rua.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Rua.setForeground(new java.awt.Color(255, 255, 255));
        Rua.setText("Rua");
        jPanel1.add(Rua, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 590, -1, -1));

        Cadastro.setBackground(new java.awt.Color(255, 255, 255));
        Cadastro.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        Cadastro.setForeground(new java.awt.Color(0, 224, 255));
        Cadastro.setText("CADASTRO");
        jPanel1.add(Cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, -1, -1));

        NomeCompleto.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        NomeCompleto.setForeground(new java.awt.Color(0, 224, 255));
        NomeCompleto.setText("Nome Completo:");
        jPanel1.add(NomeCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, -1, -1));

        CL.setBackground(new java.awt.Color(0, 224, 255));
        CL.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        CL.setForeground(new java.awt.Color(0, 224, 255));
        CL.setText("CL");
        jPanel1.add(CL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 280, -1, -1));

        FundoBranco.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout FundoBrancoLayout = new javax.swing.GroupLayout(FundoBranco);
        FundoBranco.setLayout(FundoBrancoLayout);
        FundoBrancoLayout.setHorizontalGroup(
            FundoBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoBrancoLayout.createSequentialGroup()
                .addGap(930, 930, 930)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImagemFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 1737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        FundoBrancoLayout.setVerticalGroup(
            FundoBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoBrancoLayout.createSequentialGroup()
                .addGap(436, 436, 436)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FundoBrancoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImagemFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 2620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(FundoBranco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2020, 2420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2017, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 2017, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2419, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 2419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PGTelefoneClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PGTelefoneClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PGTelefoneClienteActionPerformed

    private void PGCEPClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PGCEPClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PGCEPClienteActionPerformed

    private void FecharCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharCadastroClienteActionPerformed
        cliente.entrarPrincipal();
    }//GEN-LAST:event_FecharCadastroClienteActionPerformed

    private void OpcaoFemininoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcaoFemininoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpcaoFemininoClienteActionPerformed

    private void OpcaoMasculinoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcaoMasculinoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpcaoMasculinoClienteActionPerformed

    private void BotaoCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoCadastrarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bairro;
    private javax.swing.JButton BotaoCadastrarCliente;
    private javax.swing.JLabel CEP;
    private javax.swing.JLabel CL;
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel Cadastro;
    private javax.swing.JLabel DataDeNascimento;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Endereco;
    private javax.swing.JButton FecharCadastroCliente;
    private javax.swing.JPanel FundoBranco;
    private javax.swing.JLabel ImagemFundo;
    private javax.swing.JLabel NomeCompleto;
    private javax.swing.JRadioButton OpcaoFemininoCliente;
    private javax.swing.JRadioButton OpcaoMasculinoCliente;
    private javax.swing.JRadioButton OpcaoOutrosCliente;
    private javax.swing.JTextField PGBairroCliente;
    private javax.swing.JTextField PGCEPCliente;
    private javax.swing.JTextField PGCPFCliente;
    private javax.swing.JTextField PGEmailCliente;
    private javax.swing.JTextField PGNomeCompletoCliente;
    private javax.swing.JTextField PGTelefoneCliente;
    private javax.swing.JLabel Rua;
    private javax.swing.JLabel Sexo;
    private javax.swing.JLabel Telefone;
    private javax.swing.ButtonGroup generocliente;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
