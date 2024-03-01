package Telas;

import Controlador.ControladorPrincipal;

public class Principal extends javax.swing.JFrame {

    private final ControladorPrincipal principal;
    
    public Principal() {
        initComponents();
        principal = new ControladorPrincipal(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoCadFun = new javax.swing.JButton();
        FundoBranco = new javax.swing.JPanel();
        botaoCadCli = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        botaoAgendar = new javax.swing.JButton();
        botaoCadCli1 = new javax.swing.JButton();
        botaoCadCli2 = new javax.swing.JButton();
        botaoCadCli3 = new javax.swing.JButton();
        botaoCadServ = new javax.swing.JButton();
        botaoVisuAgendamento = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Agendar = new javax.swing.JMenu();
        AgendarHorario = new javax.swing.JMenu();
        Cadastro = new javax.swing.JMenu();
        CadCliente = new javax.swing.JMenu();
        CadFunc = new javax.swing.JMenu();
        CadServ = new javax.swing.JMenu();
        Sair = new javax.swing.JMenu();
        Fechar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoCadFun.setText("CADASTRO FUNCIONARIO");
        botaoCadFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadFunActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCadFun, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        FundoBranco.setBackground(new java.awt.Color(255, 255, 255));
        FundoBranco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoCadCli.setText("CADASTRO CLIENTE");
        botaoCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadCliActionPerformed(evt);
            }
        });
        FundoBranco.add(botaoCadCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        botaoSair.setText("SAIR");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });
        FundoBranco.add(botaoSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        botaoAgendar.setText("AGENDAMENTO");
        botaoAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAgendarActionPerformed(evt);
            }
        });
        FundoBranco.add(botaoAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        botaoCadCli1.setText("CADASTRO CLIENTE");
        botaoCadCli1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadCli1ActionPerformed(evt);
            }
        });
        FundoBranco.add(botaoCadCli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        botaoCadCli2.setText("CADASTRO CLIENTE");
        botaoCadCli2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadCli2ActionPerformed(evt);
            }
        });
        FundoBranco.add(botaoCadCli2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        botaoCadCli3.setText("CADASTRO CLIENTE");
        botaoCadCli3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadCli3ActionPerformed(evt);
            }
        });
        FundoBranco.add(botaoCadCli3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        botaoCadServ.setText("CADASTRO SERVIÇO");
        botaoCadServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadServActionPerformed(evt);
            }
        });
        FundoBranco.add(botaoCadServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        botaoVisuAgendamento.setText("Visualizar Agendamentos");
        botaoVisuAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVisuAgendamentoActionPerformed(evt);
            }
        });
        FundoBranco.add(botaoVisuAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        getContentPane().add(FundoBranco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 3070, 3010));

        Agendar.setText("Agendar");
        Agendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendarActionPerformed(evt);
            }
        });

        AgendarHorario.setText("Agendar Horario");
        AgendarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendarHorarioActionPerformed(evt);
            }
        });
        Agendar.add(AgendarHorario);

        jMenuBar1.add(Agendar);

        Cadastro.setText("Cadastro");
        Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroActionPerformed(evt);
            }
        });

        CadCliente.setText("Cliente");
        CadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadClienteActionPerformed(evt);
            }
        });
        Cadastro.add(CadCliente);

        CadFunc.setText("Funcionario");
        Cadastro.add(CadFunc);

        CadServ.setText("Serviço");
        Cadastro.add(CadServ);

        jMenuBar1.add(Cadastro);

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        Fechar.setText("Fechar");
        Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharActionPerformed(evt);
            }
        });
        Sair.add(Fechar);

        jMenuBar1.add(Sair);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAgendarActionPerformed
        //rincipal.entrarAgendamento();
        principal.entrarAgendamento();
    }//GEN-LAST:event_botaoAgendarActionPerformed

    private void botaoCadFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadFunActionPerformed
        principal.entrarFuncionario();
    }//GEN-LAST:event_botaoCadFunActionPerformed

    private void botaoCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadCliActionPerformed
        principal.entrarCliente();
    }//GEN-LAST:event_botaoCadCliActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        principal.entrarLogin();
    }//GEN-LAST:event_botaoSairActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_SairActionPerformed

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FecharActionPerformed

    private void CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroActionPerformed
        CadastrarCliente CDCliente = new CadastrarCliente();
        CDCliente.setVisible(true);
    }//GEN-LAST:event_CadastroActionPerformed

    private void AgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendarActionPerformed
        principal.entrarAgendamento();
    }//GEN-LAST:event_AgendarActionPerformed

    private void AgendarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendarHorarioActionPerformed
        principal.entrarAgendamento();
    }//GEN-LAST:event_AgendarHorarioActionPerformed

    private void CadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadClienteActionPerformed
       principal.entrarCliente();
    }//GEN-LAST:event_CadClienteActionPerformed

    private void botaoCadCli1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadCli1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCadCli1ActionPerformed

    private void botaoCadCli2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadCli2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCadCli2ActionPerformed

    private void botaoCadCli3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadCli3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCadCli3ActionPerformed

    private void botaoCadServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadServActionPerformed
        principal.entrarServico();
    }//GEN-LAST:event_botaoCadServActionPerformed

    private void botaoVisuAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVisuAgendamentoActionPerformed
        principal.entrarVisualizador();
    }//GEN-LAST:event_botaoVisuAgendamentoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Agendar;
    private javax.swing.JMenu AgendarHorario;
    private javax.swing.JMenu CadCliente;
    private javax.swing.JMenu CadFunc;
    private javax.swing.JMenu CadServ;
    private javax.swing.JMenu Cadastro;
    private javax.swing.JMenu Fechar;
    private javax.swing.JPanel FundoBranco;
    private javax.swing.JMenu Sair;
    private javax.swing.JButton botaoAgendar;
    private javax.swing.JButton botaoCadCli;
    private javax.swing.JButton botaoCadCli1;
    private javax.swing.JButton botaoCadCli2;
    private javax.swing.JButton botaoCadCli3;
    private javax.swing.JButton botaoCadFun;
    private javax.swing.JButton botaoCadServ;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoVisuAgendamento;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
