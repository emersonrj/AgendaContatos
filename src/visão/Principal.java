
package visão;

import javax.swing.JFrame;


public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jmbBarraMenu = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        jmiContatos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiCadastro = new javax.swing.JMenu();
        jmiCidade = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmiBairro = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jmiTipoContato = new javax.swing.JMenuItem();
        jmSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGECON-Agenda de contatos");
        setResizable(false);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );

        jmCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arquivo.png"))); // NOI18N
        jmCadastro.setMnemonic('a');
        jmCadastro.setText("Arquivo");

        jmiContatos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jmiContatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/contato.png"))); // NOI18N
        jmiContatos.setText("Contatos");
        jmiContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiContatosActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiContatos);
        jmCadastro.add(jSeparator1);

        jmiCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novo.png"))); // NOI18N
        jmiCadastro.setMnemonic('c');
        jmiCadastro.setText("Cadastros");

        jmiCidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jmiCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_buildings_22767.png"))); // NOI18N
        jmiCidade.setText("Cidade");
        jmiCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCidadeActionPerformed(evt);
            }
        });
        jmiCadastro.add(jmiCidade);
        jmiCadastro.add(jSeparator2);

        jmiBairro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jmiBairro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bairro.png"))); // NOI18N
        jmiBairro.setText("Bairro");
        jmiBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBairroActionPerformed(evt);
            }
        });
        jmiCadastro.add(jmiBairro);
        jmiCadastro.add(jSeparator3);

        jmiTipoContato.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jmiTipoContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tipo.png"))); // NOI18N
        jmiTipoContato.setText("Tipo de Contato");
        jmiTipoContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTipoContatoActionPerformed(evt);
            }
        });
        jmiCadastro.add(jmiTipoContato);

        jmCadastro.add(jmiCadastro);

        jmbBarraMenu.add(jmCadastro);

        jmSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/me.png"))); // NOI18N
        jmSobre.setMnemonic('s');
        jmSobre.setText("Sobre");
        jmbBarraMenu.add(jmSobre);

        setJMenuBar(jmbBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiContatosActionPerformed
        ContatoVisao tela = new ContatoVisao();
        jDesktopPane1.add(tela);
        tela.setVisible(true);
                
        
    }//GEN-LAST:event_jmiContatosActionPerformed

    private void jmiCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCidadeActionPerformed
        CidadeVisao tela = new CidadeVisao();
        jDesktopPane1.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jmiCidadeActionPerformed

    private void jmiTipoContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTipoContatoActionPerformed
        TipoContatoVisao tela = new TipoContatoVisao();
        jDesktopPane1.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jmiTipoContatoActionPerformed

    private void jmiBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBairroActionPerformed
        BairroVisao tela = new BairroVisao();
        jDesktopPane1.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jmiBairroActionPerformed

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
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenu jmSobre;
    private javax.swing.JMenuBar jmbBarraMenu;
    private javax.swing.JMenuItem jmiBairro;
    private javax.swing.JMenu jmiCadastro;
    private javax.swing.JMenuItem jmiCidade;
    private javax.swing.JMenuItem jmiContatos;
    private javax.swing.JMenuItem jmiTipoContato;
    // End of variables declaration//GEN-END:variables
}
