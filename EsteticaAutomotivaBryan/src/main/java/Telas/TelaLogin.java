package Telas;

import Controlador.ControladorDoLogin;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin extends javax.swing.JFrame {
    
    private final ControladorDoLogin controlador;
    
    public TelaLogin() {
        initComponents();
        controlador = new ControladorDoLogin(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FundoBranco = new javax.swing.JPanel();
        NomeCompletoLogin = new javax.swing.JLabel();
        PegaNomeLogin = new javax.swing.JTextField();
        SenhaLogin = new javax.swing.JLabel();
        BotaoLogar = new javax.swing.JButton();
        PegaSenhaLogin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FundoBranco.setBackground(new java.awt.Color(255, 255, 255));
        FundoBranco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NomeCompletoLogin.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        NomeCompletoLogin.setForeground(new java.awt.Color(0, 224, 255));
        NomeCompletoLogin.setText("Nome Completo:");
        FundoBranco.add(NomeCompletoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        PegaNomeLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PegaNomeLoginActionPerformed(evt);
            }
        });
        FundoBranco.add(PegaNomeLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 250, -1));

        SenhaLogin.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        SenhaLogin.setForeground(new java.awt.Color(0, 224, 255));
        SenhaLogin.setText("Senha:");
        FundoBranco.add(SenhaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        BotaoLogar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        BotaoLogar.setForeground(new java.awt.Color(0, 224, 255));
        BotaoLogar.setText("Login");
        BotaoLogar.setBorder(null);
        BotaoLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLogarActionPerformed(evt);
            }
        });
        FundoBranco.add(BotaoLogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 110, 30));
        FundoBranco.add(PegaSenhaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 250, -1));

        getContentPane().add(FundoBranco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLogarActionPerformed
        controlador.entrarNoSistema();
            }//GEN-LAST:event_BotaoLogarActionPerformed

    private void PegaNomeLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PegaNomeLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PegaNomeLoginActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoLogar;
    private javax.swing.JPanel FundoBranco;
    private javax.swing.JLabel NomeCompletoLogin;
    private javax.swing.JTextField PegaNomeLogin;
    private javax.swing.JPasswordField PegaSenhaLogin;
    private javax.swing.JLabel SenhaLogin;
    // End of variables declaration//GEN-END:variables

    private void entrarnosistema() {
        this.controlador.entrarNoSistema();
    }

    public JButton getBotaoLogar() {
        return BotaoLogar;
    }

    public void setBotaoLogar(JButton BotaoLogar) {
        this.BotaoLogar = BotaoLogar;
    }

    public JLabel getNomeCompletoLogin() {
        return NomeCompletoLogin;
    }

    public void setNomeCompletoLogin(JLabel NomeCompletoLogin) {
        this.NomeCompletoLogin = NomeCompletoLogin;
    }

    public JTextField getPegaNomeLogin() {
        
        return PegaNomeLogin;
    }

    public void setPegaNomeLogin(JTextField PegaNomeLogin) {
        this.PegaNomeLogin = PegaNomeLogin;
    }

    public JPasswordField getPegaSenhaLogin() {
        return PegaSenhaLogin;
    }

    public void setPegaSenhaLogin(JPasswordField PegaSenhaLogin) {
        this.PegaSenhaLogin = PegaSenhaLogin;
    }

    public JLabel getSenhaLogin() {
        return SenhaLogin;
    }

    public void setSenhaLogin(JLabel SenhaLogin) {
        this.SenhaLogin = SenhaLogin;
    }

    
    
    
}
