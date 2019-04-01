
package visão;

import javax.swing.JLabel;
import javax.swing.JTextField;



abstract public class FormPadrao extends javax.swing.JInternalFrame {
    
//  Métodos abstratos que serão implementados pela classe filha.
    abstract public void inicializarComponentes();
    
//  Criando as variáveis para os componentes do painel de Consulta.
    
    JLabel jlConsulta;
    JTextField jtfConsulta;

//   Construtor
    public FormPadrao() {
        initComponents();
        habilitaBotoes(true);
        
        jtfId.setEditable(false);
        habilitaCampos(false);
        
        // jLabel para consulta
        jlConsulta = new JLabel("Consulta");
        jlConsulta.setBounds(9, 5, 50, 25);
        jpnConsulta.add(jlConsulta);
        
        // jTextField para consulta
        jtfConsulta = new JTextField();
        jtfConsulta.setBounds(60, 5, 615, 25);
        jpnConsulta.add(jtfConsulta);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnBotoes = new javax.swing.JPanel();
        jbNovo = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jpnFormulario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfDescricao = new javax.swing.JTextField();
        jpnConsulta = new javax.swing.JPanel();

        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novo.png"))); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/remove.png"))); // NOI18N
        jbExcluir.setText("Excluir");

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fechar.png"))); // NOI18N
        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnBotoesLayout = new javax.swing.GroupLayout(jpnBotoes);
        jpnBotoes.setLayout(jpnBotoesLayout);
        jpnBotoesLayout.setHorizontalGroup(
            jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbExcluir)
                .addGap(43, 43, 43)
                .addComponent(jbSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbFechar)
                .addGap(27, 27, 27))
        );
        jpnBotoesLayout.setVerticalGroup(
            jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovo)
                    .addComponent(jbAlterar)
                    .addComponent(jbExcluir)
                    .addComponent(jbSalvar)
                    .addComponent(jbCancelar)
                    .addComponent(jbFechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("ID");

        jLabel2.setText("Descrição");

        javax.swing.GroupLayout jpnFormularioLayout = new javax.swing.GroupLayout(jpnFormulario);
        jpnFormulario.setLayout(jpnFormularioLayout);
        jpnFormularioLayout.setHorizontalGroup(
            jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFormularioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jpnFormularioLayout.setVerticalGroup(
            jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFormularioLayout.createSequentialGroup()
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 110, Short.MAX_VALUE))
        );

        jpnConsulta.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jpnConsultaLayout = new javax.swing.GroupLayout(jpnConsulta);
        jpnConsulta.setLayout(jpnConsultaLayout);
        jpnConsultaLayout.setHorizontalGroup(
            jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnConsultaLayout.setVerticalGroup(
            jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        habilitaBotoes(false);
        habilitaCampos(true);
        jtfDescricao.requestFocus();
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        
        habilitaBotoes(false);
        habilitaCampos(true);
        limpaCampo();
        jtfDescricao.requestFocus();
        
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
        
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        
        habilitaBotoes(true);
        habilitaCampos(false);
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
       
        habilitaBotoes(true);
        habilitaCampos(false);
    }//GEN-LAST:event_jbCancelarActionPerformed
    
    // Metodo para habilitar e desabilitar Botões.
    public void habilitaBotoes(boolean estado) {
        jbNovo.setEnabled(estado);
        jbAlterar.setEnabled(estado);
        jbExcluir.setEnabled(estado);
        
        jbSalvar.setEnabled(!estado);
        jbCancelar.setEnabled(!estado);
    }
    
    //Método para habilitar e desabilitar acesso aos campos de edição.
    public void habilitaCampos(boolean estado){
        jtfDescricao.setEnabled(estado);
    }
    
    // Método para limpar os campos dos formulários.
    public void limpaCampo(){
        jtfDescricao.setText("");
    }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JPanel jpnBotoes;
    private javax.swing.JPanel jpnConsulta;
    public javax.swing.JPanel jpnFormulario;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextField jtfId;
    // End of variables declaration//GEN-END:variables
}
