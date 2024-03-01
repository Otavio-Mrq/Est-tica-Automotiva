package Telas;

import Controlador.ControladorAgendamento;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JTextField;
public class AgendarHora extends javax.swing.JFrame {
    
    
    private final ControladorAgendamento agendamento;
    
    public AgendarHora() {
        initComponents();
        
        agendamento = new ControladorAgendamento(this);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        FundoBranco = new javax.swing.JPanel();
        Nome = new javax.swing.JLabel();
        Agendar = new javax.swing.JLabel();
        AgendarNome = new javax.swing.JTextField();
        AgendarValor = new javax.swing.JTextField();
        AgendarOBS = new javax.swing.JTextField();
        AgendarData = new com.toedter.calendar.JDateChooser();
        AgendarServico = new javax.swing.JComboBox<>();
        Data = new javax.swing.JLabel();
        Valor = new javax.swing.JLabel();
        NomeCompleto = new javax.swing.JLabel();
        Serviço = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        ImagemFundo = new javax.swing.JLabel();
        FecharAgendamento = new javax.swing.JButton();
        BotaoAgendar = new javax.swing.JButton();
        btnPreco = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FundoBranco.setBackground(new java.awt.Color(255, 255, 255));
        FundoBranco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nome.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Nome.setForeground(new java.awt.Color(0, 224, 255));
        Nome.setText("Observação:");
        FundoBranco.add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 610, -1, -1));

        Agendar.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        Agendar.setForeground(new java.awt.Color(0, 224, 255));
        Agendar.setText("AGENDAR");
        FundoBranco.add(Agendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, -1, -1));

        AgendarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendarNomeActionPerformed(evt);
            }
        });
        FundoBranco.add(AgendarNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 360, 210, -1));

        AgendarValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendarValorActionPerformed(evt);
            }
        });
        FundoBranco.add(AgendarValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 460, 210, -1));

        AgendarOBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendarOBSActionPerformed(evt);
            }
        });
        FundoBranco.add(AgendarOBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 600, 210, -1));
        FundoBranco.add(AgendarData, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 510, -1, -1));

        AgendarServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------------------------------", "LIMPEZA INTERNA", "LIMPEZA EXTERNA", "LIMPEZA GERAL", "HIGIENIZAÇÃO DO AR CONDICIONADO", "LIMPEZA TÉCNICA DE MOTOR" }));
        AgendarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendarServicoActionPerformed(evt);
            }
        });
        FundoBranco.add(AgendarServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 410, 210, 20));

        Data.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Data.setForeground(new java.awt.Color(0, 224, 255));
        Data.setText("Data:");
        FundoBranco.add(Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 510, -1, -1));

        Valor.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Valor.setForeground(new java.awt.Color(0, 224, 255));
        Valor.setText("Valor:");
        FundoBranco.add(Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, -1, -1));

        NomeCompleto.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        NomeCompleto.setForeground(new java.awt.Color(0, 224, 255));
        NomeCompleto.setText("Nome Completo:");
        FundoBranco.add(NomeCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, -1, -1));

        Serviço.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Serviço.setForeground(new java.awt.Color(0, 224, 255));
        Serviço.setText("Serviço:");
        FundoBranco.add(Serviço, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, -1, -1));

        Hora.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Hora.setForeground(new java.awt.Color(0, 224, 255));
        Hora.setText("Hora:");
        FundoBranco.add(Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 560, -1, -1));
        FundoBranco.add(ImagemFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 3057, -1));

        FecharAgendamento.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        FecharAgendamento.setForeground(new java.awt.Color(0, 224, 255));
        FecharAgendamento.setText("Fechar");
        FecharAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharAgendamentoActionPerformed(evt);
            }
        });
        FundoBranco.add(FecharAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 670, 80, -1));

        BotaoAgendar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        BotaoAgendar.setForeground(new java.awt.Color(0, 224, 255));
        BotaoAgendar.setText("Agendar");
        BotaoAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAgendarActionPerformed(evt);
            }
        });
        FundoBranco.add(BotaoAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 670, -1, -1));

        btnPreco.setText("PREÇO");
        btnPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecoActionPerformed(evt);
            }
        });
        FundoBranco.add(btnPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 410, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FundoBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 3069, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FundoBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 3017, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgendarOBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendarOBSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgendarOBSActionPerformed

    private void AgendarValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendarValorActionPerformed
        agendamento.colocarPreço();
    }//GEN-LAST:event_AgendarValorActionPerformed

    private void BotaoAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAgendarActionPerformed
       
    }//GEN-LAST:event_BotaoAgendarActionPerformed

    private void AgendarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendarServicoActionPerformed
        agendamento.colocarPreço();
    }//GEN-LAST:event_AgendarServicoActionPerformed

    private void FecharAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharAgendamentoActionPerformed
        agendamento.entraPrincipal();
    }//GEN-LAST:event_FecharAgendamentoActionPerformed

    private void AgendarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendarNomeActionPerformed
        
    }//GEN-LAST:event_AgendarNomeActionPerformed

    private void btnPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecoActionPerformed
        agendamento.colocarPreço();
    }//GEN-LAST:event_btnPrecoActionPerformed

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
            java.util.logging.Logger.getLogger(AgendarHora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendarHora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendarHora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendarHora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendarHora().setVisible(true);
            }
        });
    }

    public JComboBox<String> getAgendarServico() {
        return AgendarServico;
    }

    public void setAgendarServico(JComboBox<String> AgendarServico) {
        this.AgendarServico = AgendarServico;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agendar;
    private com.toedter.calendar.JDateChooser AgendarData;
    private javax.swing.JTextField AgendarNome;
    private javax.swing.JTextField AgendarOBS;
    private javax.swing.JComboBox<String> AgendarServico;
    private javax.swing.JTextField AgendarValor;
    private javax.swing.JButton BotaoAgendar;
    private javax.swing.JLabel Data;
    private javax.swing.JButton FecharAgendamento;
    private javax.swing.JPanel FundoBranco;
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel ImagemFundo;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel NomeCompleto;
    private javax.swing.JLabel Serviço;
    private javax.swing.JLabel Valor;
    private javax.swing.JButton btnPreco;
    private javax.swing.ButtonGroup buttonGroup2;
    // End of variables declaration//GEN-END:variables

    public JTextField getAgendarValor() {
        return AgendarValor;
    }

    public void setAgendarValor(JTextField AgendarValor) {
        this.AgendarValor = AgendarValor;
    }

    public JDateChooser getAgendarData() {
        return AgendarData;
    }

    public void setAgendarData(JDateChooser AgendarData) {
        this.AgendarData = AgendarData;
    }

    public JTextField getAgendarNome() {
        return AgendarNome;
    }

    public void setAgendarNome(JTextField AgendarNome) {
        this.AgendarNome = AgendarNome;
    }
    
}
