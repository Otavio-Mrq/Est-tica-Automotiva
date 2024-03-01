package Telas;

import Controlador.ControladorServico;

public class CadastrarServico extends javax.swing.JFrame {
    
    private final Controlador.ControladorServico servico;
    
    public CadastrarServico() {
        initComponents();
        servico = new ControladorServico(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Cadastro = new javax.swing.JLabel();
        Serv = new javax.swing.JLabel();
        NomedoServico = new javax.swing.JLabel();
        NomeServico = new javax.swing.JTextField();
        Valor = new javax.swing.JLabel();
        ValorServico = new javax.swing.JTextField();
        BotaoCadastrarServico = new javax.swing.JButton();
        FecharCadastroFunc = new javax.swing.JButton();
        Valor1 = new javax.swing.JLabel();
        ValorServico1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Cadastro.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        Cadastro.setForeground(new java.awt.Color(0, 224, 255));
        Cadastro.setText("CADASTRO");

        Serv.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Serv.setForeground(new java.awt.Color(0, 224, 255));
        Serv.setText("Serv");

        NomedoServico.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        NomedoServico.setForeground(new java.awt.Color(0, 224, 255));
        NomedoServico.setText("Nome do Serviço:");

        Valor.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Valor.setForeground(new java.awt.Color(0, 224, 255));
        Valor.setText("Valor:");

        BotaoCadastrarServico.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        BotaoCadastrarServico.setForeground(new java.awt.Color(0, 224, 255));
        BotaoCadastrarServico.setText("Cadastrar");

        FecharCadastroFunc.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        FecharCadastroFunc.setForeground(new java.awt.Color(0, 224, 255));
        FecharCadastroFunc.setText("Fechar");
        FecharCadastroFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharCadastroFuncActionPerformed(evt);
            }
        });

        Valor1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Valor1.setForeground(new java.awt.Color(0, 224, 255));
        Valor1.setText("Obs:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(965, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(Serv))
                            .addComponent(Cadastro)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(BotaoCadastrarServico)
                        .addGap(18, 18, 18)
                        .addComponent(FecharCadastroFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomedoServico)
                            .addComponent(Valor)
                            .addComponent(Valor1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ValorServico1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomeServico, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ValorServico, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(802, 802, 802))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(706, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Serv))
                    .addComponent(Cadastro))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NomedoServico)
                    .addComponent(NomeServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Valor)
                    .addComponent(ValorServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Valor1)
                    .addComponent(ValorServico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoCadastrarServico)
                    .addComponent(FecharCadastroFunc))
                .addGap(373, 373, 373))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FecharCadastroFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharCadastroFuncActionPerformed
       servico.EntrarPrincipal();
    }//GEN-LAST:event_FecharCadastroFuncActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrarServico;
    private javax.swing.JLabel Cadastro;
    private javax.swing.JButton FecharCadastroFunc;
    private javax.swing.JTextField NomeServico;
    private javax.swing.JLabel NomedoServico;
    private javax.swing.JLabel Serv;
    private javax.swing.JLabel Valor;
    private javax.swing.JLabel Valor1;
    private javax.swing.JTextField ValorServico;
    private javax.swing.JTextField ValorServico1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
