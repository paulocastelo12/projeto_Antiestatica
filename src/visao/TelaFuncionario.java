/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import UTIL.ManipularImagem;
import br.com.cis.biox.sdk.CisBiox;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelo.bean.Funcionario;
import modelo.dao.FuncionarioDAO;

/**
 *
 * @author DTI
 */
public class TelaFuncionario extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaFuncionario
     */
    private static byte[] digital1;

    public TelaFuncionario() {
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

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTfunnome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTfunmatricula = new javax.swing.JTextField();
        jCfunsetor = new javax.swing.JComboBox<>();
        jCfuncargo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLimagem = new javax.swing.JLabel();
        btAdicionarGera = new javax.swing.JButton();
        btSalvarfun = new javax.swing.JButton();
        btLerdigital = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jClider = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setClosable(true);
        setTitle("Funcionário");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTfunnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfunnomeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("NOME:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("MATRICULA:");

        jCfunsetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECIONE>", "Produção 01", "Produção 02", "Almoxarifado", "Qualidade", "Área Técnica", "SMD", "DTI", "Engenharia", "Area Técnica", "Manutencação", "Subestoque" }));
        jCfunsetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCfunsetorActionPerformed(evt);
            }
        });

        jCfuncargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECIONE>", "Aux. produção", "Alimentador", "Aux. almoxarifado", "Assistente de TI", "Análista de Sistema", "Analista de Processo", "Assistente de Processo", "Auxiliar de Processo", "Engenheiro de Processo", "Inspetor Qualidade", "Analista Qualidade", "Líder Qualidade", "Líder Área Técnica", "Técnico Eletrônica", "Assistente Técnico", "Técnico SMD", "Analista de Processo", "Operador", "Revisora", " " }));
        jCfuncargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCfuncargoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("SETOR:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("CARGO:");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Foto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 0, 255))); // NOI18N

        jLimagem.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLimagem.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLimagem, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLimagem, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        btAdicionarGera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Foto.png"))); // NOI18N
        btAdicionarGera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAdicionarGera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarGeraActionPerformed(evt);
            }
        });

        btSalvarfun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar.png"))); // NOI18N
        btSalvarfun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarfunActionPerformed(evt);
            }
        });

        btLerdigital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/biomatria64.png"))); // NOI18N
        btLerdigital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLerdigitalActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Biometria");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Salvar");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Líder:");

        jClider.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECIONE>", "Heber", "Anne Kelly", "Regina Santos", "Pedro", "André Takao", "Zacarias", "Gutembergue", "Patrícia", "Vallio", "Debora" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCfuncargo, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfunnome, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCfunsetor, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTfunmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel6))
                                    .addComponent(btLerdigital, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jClider, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btSalvarfun))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel7)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAdicionarGera, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTfunmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addComponent(btLerdigital, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTfunnome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCfunsetor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSalvarfun)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(21, 21, 21))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jClider, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCfuncargo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAdicionarGera, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(44, Short.MAX_VALUE))))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Cadastro Funcionário");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(779, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(200, 30, 1036, 538);
    }// </editor-fold>//GEN-END:initComponents

    private void jTfunnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfunnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfunnomeActionPerformed

    private void btSalvarfunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarfunActionPerformed
        if (ValidarCampos()) {
            salvarFuncionario();

            jTfunmatricula.setText("");
            jTfunnome.setText("");
            jCfunsetor.setSelectedItem("<SELECIONE>");
            jCfuncargo.setSelectedItem("<SELECIONE>");
            jClider.setSelectedItem("<SELECIONE>");
            jLimagem.setIcon(null);
        }
    }//GEN-LAST:event_btSalvarfunActionPerformed

    BufferedImage imagem;

    private void btAdicionarGeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarGeraActionPerformed
        JFileChooser fc = new JFileChooser("C:\\Users\\DTI\\Pictures\\Camera Roll");
        int res = fc.showOpenDialog(null);

        if (res == JFileChooser.APPROVE_OPTION) {
            File arquivo = fc.getSelectedFile();

            try {
                imagem = ManipularImagem.setImagemDimensao(arquivo.getAbsolutePath(), 320, 240);
                jLimagem.setText("");
                jLimagem.setIcon(new ImageIcon(imagem));

            } catch (Exception ex) {
                // System.out.println(ex.printStackTrace().toString());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum arquivo.");
        }

    }//GEN-LAST:event_btAdicionarGeraActionPerformed

    private void btLerdigitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLerdigitalActionPerformed
        CisBiox biox = new CisBiox();
        biox.finalizar();
        int iRetorno = biox.iniciar();

        if (iRetorno != 1) {
            JOptionPane.showMessageDialog(null, "Erro: " + CisBiox.mensagens(iRetorno));
            return;
        }

        new Thread(LerDigital1).start();
    }//GEN-LAST:event_btLerdigitalActionPerformed

    private void jCfuncargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCfuncargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCfuncargoActionPerformed

    private void jCfunsetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCfunsetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCfunsetorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarGera;
    private javax.swing.JButton btLerdigital;
    private javax.swing.JButton btSalvarfun;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCfuncargo;
    private javax.swing.JComboBox<String> jCfunsetor;
    private javax.swing.JComboBox<String> jClider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLimagem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTfunmatricula;
    private javax.swing.JTextField jTfunnome;
    // End of variables declaration//GEN-END:variables

    private static Runnable LerDigital1 = new Runnable() {
        @Override
        public void run() {

            CisBiox biox = new CisBiox();

            digital1 = biox.capturarDigital();

            if (biox.getResultado() != 1) {
                biox.finalizar();
                return;
            }

            int iRetorno = biox.finalizar();

            if (iRetorno != 1) {
                JOptionPane.showMessageDialog(null, "Erro: " + CisBiox.mensagens(iRetorno));
                return;
            }

            JOptionPane.showMessageDialog(null, "Template Gerado!");

        }
    };

    public void salvarFuncionario() {
        Funcionario funcionario = new Funcionario();
        FuncionarioDAO funcionarioDao = new FuncionarioDAO();

        funcionario.setMatricula(Integer.parseInt(jTfunmatricula.getText()));
        funcionario.setNome(jTfunnome.getText());
        funcionario.setSetor(jCfunsetor.getSelectedItem().toString());
        funcionario.setCargo(jCfuncargo.getSelectedItem().toString());
        funcionario.setLider(jClider.getSelectedItem().toString());
        funcionario.setImagem(ManipularImagem.getImgBytes(imagem));
        funcionario.setBiometria(digital1);

        try {
            funcionarioDao.salvar(funcionario);
            JOptionPane.showMessageDialog(null, funcionario.getNome() + "Registrado(a) com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Registra Funcionario!" + ex.getMessage());
        }

    }

    private boolean ValidarCampos() {

        if (jTfunmatricula.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite o Matricula!");
            jTfunmatricula.requestFocus();
            return false;
        }
        if (jTfunnome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite o Nome!");
            jTfunnome.requestFocus();
            return false;
        }

        if (jCfunsetor.getSelectedItem().equals("<SELECIONE>")) {
            JOptionPane.showMessageDialog(null, "Selecione Setor!");
            jCfunsetor.requestFocus();
            return false;
        }

        if (jCfuncargo.getSelectedItem().equals("<SELECIONE>")) {
            JOptionPane.showMessageDialog(null, "Selecione Cargo!");
            jCfuncargo.requestFocus();
            return false;
        }
        if (jClider.getSelectedItem().equals("<SELECIONE>")) {
            JOptionPane.showMessageDialog(null, "Selecione Líder!");
            jClider.requestFocus();
            return false;
        }

        return true;
    }

}
