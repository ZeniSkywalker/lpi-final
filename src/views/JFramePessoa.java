/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Luiza
 */
public class JFramePessoa extends javax.swing.JFrame {

    /**
     * Creates new form JFramePessoa
     */
    public JFramePessoa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        nomeLbl = new javax.swing.JLabel();
        cpfLbl = new javax.swing.JLabel();
        rgLbl = new javax.swing.JLabel();
        sexoLbl = new javax.swing.JLabel();
        dataNascLbl = new javax.swing.JLabel();
        grauAcadLbl = new javax.swing.JLabel();
        instituicaoLbl = new javax.swing.JLabel();
        areaPesqLbl = new javax.swing.JLabel();
        projetoLbl = new javax.swing.JLabel();
        nomeTxt = new javax.swing.JTextField();
        cpfTxt = new javax.swing.JTextField();
        rgTxt = new javax.swing.JTextField();
        sexoTxt = new javax.swing.JTextField();
        dataNascTxt = new javax.swing.JTextField();
        grauAcadTxt = new javax.swing.JTextField();
        areaPesqCbx = new javax.swing.JComboBox<>();
        instituicaoTxt = new javax.swing.JTextField();
        projetoTxt = new javax.swing.JTextField();
        voltarBtn = new javax.swing.JButton();
        cadastrarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeLbl.setText("Nome:");

        cpfLbl.setText("CPF:");

        rgLbl.setText("RG:");

        sexoLbl.setText("Sexo:");

        dataNascLbl.setText("Data Nasc.:");

        grauAcadLbl.setText("Grau Academico:");

        instituicaoLbl.setText("Instituição:");

        areaPesqLbl.setText("Area de Pesquisa:");

        projetoLbl.setText("Projeto:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, nomeLbl, org.jdesktop.beansbinding.ObjectProperty.create(), nomeTxt, org.jdesktop.beansbinding.BeanProperty.create("text"), "nomeTxt");
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cpfLbl, org.jdesktop.beansbinding.ObjectProperty.create(), cpfTxt, org.jdesktop.beansbinding.BeanProperty.create("text"), "cpfTxt");
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, rgLbl, org.jdesktop.beansbinding.ObjectProperty.create(), rgTxt, org.jdesktop.beansbinding.BeanProperty.create("text"), "rgTxt");
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, sexoLbl, org.jdesktop.beansbinding.ObjectProperty.create(), sexoTxt, org.jdesktop.beansbinding.BeanProperty.create("text"), "sexoTxt");
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, grauAcadLbl, org.jdesktop.beansbinding.ObjectProperty.create(), dataNascTxt, org.jdesktop.beansbinding.BeanProperty.create("text"), "dataTxt");
        bindingGroup.addBinding(binding);

        dataNascTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataNascTxtActionPerformed(evt);
            }
        });

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, grauAcadLbl, org.jdesktop.beansbinding.ObjectProperty.create(), grauAcadTxt, org.jdesktop.beansbinding.BeanProperty.create("text"), "grauAcadText");
        bindingGroup.addBinding(binding);

        grauAcadTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grauAcadTxtActionPerformed(evt);
            }
        });

        areaPesqCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, areaPesqCbx, org.jdesktop.beansbinding.ObjectProperty.create(), areaPesqCbx, org.jdesktop.beansbinding.BeanProperty.create("elements"), "areasPesquisaCbx");
        bindingGroup.addBinding(binding);

        areaPesqCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaPesqCbxActionPerformed(evt);
            }
        });

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, instituicaoLbl, org.jdesktop.beansbinding.ObjectProperty.create(), instituicaoTxt, org.jdesktop.beansbinding.BeanProperty.create("text"), "instituicaoTxt");
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, projetoTxt, org.jdesktop.beansbinding.ObjectProperty.create(), projetoTxt, org.jdesktop.beansbinding.BeanProperty.create("text"), "projetoTxt");
        bindingGroup.addBinding(binding);

        voltarBtn.setText("Voltar");
        voltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBtnActionPerformed(evt);
            }
        });

        cadastrarBtn.setText("Cadastrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeLbl)
                    .addComponent(projetoLbl)
                    .addComponent(areaPesqLbl)
                    .addComponent(instituicaoLbl)
                    .addComponent(grauAcadLbl)
                    .addComponent(dataNascLbl)
                    .addComponent(sexoLbl)
                    .addComponent(rgLbl)
                    .addComponent(cpfLbl)
                    .addComponent(voltarBtn))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(cpfTxt)
                            .addComponent(rgTxt)
                            .addComponent(sexoTxt)
                            .addComponent(dataNascTxt)
                            .addComponent(grauAcadTxt)
                            .addComponent(instituicaoTxt)
                            .addComponent(projetoTxt)
                            .addComponent(areaPesqCbx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cadastrarBtn)
                        .addContainerGap(145, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLbl)
                    .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfLbl)
                    .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rgLbl)
                    .addComponent(rgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexoLbl)
                    .addComponent(sexoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataNascLbl)
                    .addComponent(dataNascTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grauAcadLbl)
                    .addComponent(grauAcadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instituicaoLbl)
                    .addComponent(instituicaoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaPesqLbl)
                    .addComponent(areaPesqCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projetoLbl)
                    .addComponent(projetoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarBtn)
                    .addComponent(cadastrarBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dataNascTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataNascTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataNascTxtActionPerformed

    private void grauAcadTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grauAcadTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grauAcadTxtActionPerformed

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voltarBtnActionPerformed

    private void areaPesqCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaPesqCbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaPesqCbxActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> areaPesqCbx;
    private javax.swing.JLabel areaPesqLbl;
    private javax.swing.JButton cadastrarBtn;
    private javax.swing.JLabel cpfLbl;
    private javax.swing.JTextField cpfTxt;
    private javax.swing.JLabel dataNascLbl;
    private javax.swing.JTextField dataNascTxt;
    private javax.swing.JLabel grauAcadLbl;
    private javax.swing.JTextField grauAcadTxt;
    private javax.swing.JLabel instituicaoLbl;
    private javax.swing.JTextField instituicaoTxt;
    private javax.swing.JLabel nomeLbl;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JLabel projetoLbl;
    private javax.swing.JTextField projetoTxt;
    private javax.swing.JLabel rgLbl;
    private javax.swing.JTextField rgTxt;
    private javax.swing.JLabel sexoLbl;
    private javax.swing.JTextField sexoTxt;
    private javax.swing.JButton voltarBtn;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
