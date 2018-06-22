/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import classes.ConexaoBD;
import classes.Pessoa;
import java.sql.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiza
 */
public class JFramePessoa extends javax.swing.JFrame {

    Connection conn = null;
    ConexaoBD conect;
    PreparedStatement stm = null;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");

    /**
     * Creates new form JFramePessoa
     */
    public JFramePessoa() throws SQLException {
        initComponents();
        conn = conect.conectar();

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
        cpfTxt = new javax.swing.JTextField();
        rgTxt = new javax.swing.JTextField();
        sexoTxt = new javax.swing.JTextField();
        grauAcadTxt = new javax.swing.JTextField();
        instituicaoTxt = new javax.swing.JTextField();
        voltarBtn = new javax.swing.JButton();
        cadastrarBtn = new javax.swing.JButton();
        avaliadorBtn = new javax.swing.JRadioButton();
        pesquisadorBtn = new javax.swing.JRadioButton();
        dataNascTxt = new javax.swing.JFormattedTextField();
        excluirBtn = new javax.swing.JButton();
        carregarBtn = new javax.swing.JButton();
        atualizarBtn = new javax.swing.JButton();
        nomeTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeLbl.setText("Nome:");

        cpfLbl.setText("CPF:");

        rgLbl.setText("RG:");

        sexoLbl.setText("Sexo:");

        dataNascLbl.setText("Data Nasc.:");

        grauAcadLbl.setText("Grau Academico:");

        instituicaoLbl.setText("Instituição:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cpfLbl, org.jdesktop.beansbinding.ObjectProperty.create(), cpfTxt, org.jdesktop.beansbinding.BeanProperty.create("text"), "cpfTxt");
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, rgLbl, org.jdesktop.beansbinding.ObjectProperty.create(), rgTxt, org.jdesktop.beansbinding.BeanProperty.create("text"), "rgTxt");
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, sexoLbl, org.jdesktop.beansbinding.ObjectProperty.create(), sexoTxt, org.jdesktop.beansbinding.BeanProperty.create("text"), "sexoTxt");
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, grauAcadLbl, org.jdesktop.beansbinding.ObjectProperty.create(), grauAcadTxt, org.jdesktop.beansbinding.BeanProperty.create("text"), "grauAcadText");
        bindingGroup.addBinding(binding);

        grauAcadTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grauAcadTxtActionPerformed(evt);
            }
        });

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, instituicaoLbl, org.jdesktop.beansbinding.ObjectProperty.create(), instituicaoTxt, org.jdesktop.beansbinding.BeanProperty.create("text"), "instituicaoTxt");
        bindingGroup.addBinding(binding);

        voltarBtn.setText("Voltar");
        voltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBtnActionPerformed(evt);
            }
        });

        cadastrarBtn.setText("Cadastrar");
        cadastrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try{
                  cadastrarBtnActionPerformed(evt);
                }
                catch(SQLException e){
                }
            }
        });

        avaliadorBtn.setText("Avaliador");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, pesquisadorBtn, org.jdesktop.beansbinding.ELProperty.create("${selected}"), avaliadorBtn, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        pesquisadorBtn.setText("Pesquisador");

        dataNascTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        excluirBtn.setText("Excluir");
        excluirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirBtnActionPerformed(evt);
            }
        });

        carregarBtn.setText("Carregar");
        carregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregarBtnActionPerformed(evt);
            }
        });

        atualizarBtn.setText("Atualizar");
        atualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(avaliadorBtn)
                .addGap(40, 40, 40)
                .addComponent(pesquisadorBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeLbl)
                            .addComponent(instituicaoLbl)
                            .addComponent(grauAcadLbl)
                            .addComponent(dataNascLbl)
                            .addComponent(sexoLbl)
                            .addComponent(rgLbl)
                            .addComponent(cpfLbl))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cpfTxt)
                            .addComponent(rgTxt)
                            .addComponent(sexoTxt)
                            .addComponent(grauAcadTxt)
                            .addComponent(instituicaoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(dataNascTxt)
                            .addComponent(nomeTxt)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(13, Short.MAX_VALUE)
                        .addComponent(voltarBtn)
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(atualizarBtn))
                            .addComponent(excluirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cadastrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(carregarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avaliadorBtn)
                    .addComponent(pesquisadorBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarBtn)
                    .addComponent(excluirBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarBtn)
                    .addComponent(carregarBtn)
                    .addComponent(atualizarBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );


        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void grauAcadTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grauAcadTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grauAcadTxtActionPerformed

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
        JFrameMenu abc = new JFrameMenu();
        dispose();
    }//GEN-LAST:event_voltarBtnActionPerformed

    private void inserir()throws SQLException {//GEN-FIRST:event_cadastrarBtnActionPerformed
        try {
            if (pesquisadorBtn.isSelected()) {
                String sql = "INSERT INTO pesquisador (cpf, rg, nome, sexo, data_nascimento, grau_academico, instituicao) VALUES (?, ?, ?, ?, ?, ?, ?)";
                try {
                    stm = conn.prepareStatement(sql);
                    stm.setString(3, nomeTxt.getText());
                    stm.setString(1, cpfTxt.getText());
                    stm.setString(2, rgTxt.getText());
                    stm.setString(4, sexoTxt.getText());
                    String strDataNasc = dataNascTxt.getText();
                    Date dataNasc = new Date(dateFormat.parse(strDataNasc).getTime());
                    stm.setDate(5, dataNasc);
                    stm.setString(6, grauAcadTxt.getText());
                    stm.setString(7, instituicaoTxt.getText());
                    //  pesquisador.incluirPesquisador(conn);
                } catch (Exception e) {
                }
            } else {
                String sql = "INSERT INTO avaliador (cpf, rg, nome, sexo, data_nascimento, grau_academico, instituicao) VALUES (?, ?, ?, ?, ?, ?, ?)";
                try {
                    stm = conn.prepareStatement(sql);
                    stm.setString(3, nomeTxt.getText());
                    stm.setString(1, cpfTxt.getText());
                    stm.setString(2, rgTxt.getText());
                    stm.setString(4, sexoTxt.getText());
                     String strDataNasc = dataNascTxt.getText();
                    Date dataNasc = new Date(dateFormat.parse(strDataNasc).getTime());
                    stm.setDate(5, dataNasc);
                    stm.setString(6, grauAcadTxt.getText());
                    stm.setString(7, instituicaoTxt.getText());
                    //  pesquisador.incluirPesquisador(conn);
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cadastrarBtnActionPerformed

    private void carregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carregarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carregarBtnActionPerformed

    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed
        try {
            if (pesquisadorBtn.isSelected()) {
                String sql = "DELETE FROM pesquisador WHERE id_pesquisador = ?";
                try {
                    stm = conn.prepareStatement(sql);
                    
                    int idPesquisador = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID que deseja deletar: "));
                    stm.setInt(1, idPesquisador);
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            } else {
                String sql = "DELETE FROM avaliador WHERE id_avaliador = ?";
                try {
                    stm = conn.prepareStatement(sql);
                    
                    int idAvaliador = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID que deseja deletar: "));
                    stm.setInt(1, idAvaliador);
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_excluirBtnActionPerformed

    private void atualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarBtnActionPerformed
        try {
            if (pesquisadorBtn.isSelected()) {
                String sql = "UPDATE pesquisador SET cpf = ?, rg = ?, nome = ?, sexo = ?, data_nascimento = ?, grau_academico = ?, instituicao = ? WHERE id_pesquisador = ?";
                try {
                    stm = conn.prepareStatement(sql);
                    stm.setString(3, nomeTxt.getText());
                    stm.setString(1, cpfTxt.getText());
                    stm.setString(2, rgTxt.getText());
                    stm.setString(4, sexoTxt.getText());
                    stm.setString(5, dataNascTxt.getText());
                    stm.setString(6, grauAcadTxt.getText());
                    stm.setString(7, instituicaoTxt.getText());
                    int idPesquisador = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID que deseja modificar: "));
                    stm.setInt(8, idPesquisador);
                    //  pesquisador.incluirPesquisador(conn);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            } else {
                String sql = "UPDATE avaliador SET cpf = ?, rg = ?, nome = ?, sexo = ?, data_nascimento = ?, grau_academico = ?, instituicao = ?, WHERE id_avaliador = ?";
                try {
                    stm = conn.prepareStatement(sql);
                    stm.setString(3, nomeTxt.getText());
                    stm.setString(1, cpfTxt.getText());
                    stm.setString(2, rgTxt.getText());
                    stm.setString(4, sexoTxt.getText());
                    stm.setString(5, dataNascTxt.getText());
                    stm.setString(6, grauAcadTxt.getText());
                    stm.setString(7, instituicaoTxt.getText());
                    int idAvaliador = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID que deseja modificar: "));
                    stm.setInt(8, idAvaliador);

                    //  pesquisador.incluirPesquisador(conn);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_atualizarBtnActionPerformed
   
   private void cadastrarBtnActionPerformed(java.awt.event.ActionEvent evt) throws SQLException{
      inserir();
   }


    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarBtn;
    private javax.swing.JRadioButton avaliadorBtn;
    private javax.swing.JButton cadastrarBtn;
    private javax.swing.JButton carregarBtn;
    private javax.swing.JLabel cpfLbl;
    private javax.swing.JTextField cpfTxt;
    private javax.swing.JLabel dataNascLbl;
    private javax.swing.JFormattedTextField dataNascTxt;
    private javax.swing.JButton excluirBtn;
    private javax.swing.JLabel grauAcadLbl;
    private javax.swing.JTextField grauAcadTxt;
    private javax.swing.JLabel instituicaoLbl;
    private javax.swing.JTextField instituicaoTxt;
    private javax.swing.JLabel nomeLbl;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JRadioButton pesquisadorBtn;
    private javax.swing.JLabel rgLbl;
    private javax.swing.JTextField rgTxt;
    private javax.swing.JLabel sexoLbl;
    private javax.swing.JTextField sexoTxt;
    private javax.swing.JButton voltarBtn;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
