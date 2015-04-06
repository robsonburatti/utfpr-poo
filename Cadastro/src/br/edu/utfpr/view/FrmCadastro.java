/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class FrmCadastro extends javax.swing.JFrame {

    /**
     * Creates new form FrmCadastro
     */
    public FrmCadastro() {
        initComponents();
        
        // Adiciona os botões de opção de sexo em um grupo para que seja aceito somente um dos botões selecionado
        buttonGroupSexo.add(jRadioButtonMasculino);
        buttonGroupSexo.add(jRadioButtonFeminino);
        
        // Instância a classe de eventos crianada nesta mesma classe
//        ButtonHandler handler = new ButtonHandler();
        
        // Atribui para os botões da tela os eventos da classe criada
//        jButtonGravar.addActionListener(handler);
//        jButtonLimpar.addActionListener(handler);
//        jButtonCancelar.addActionListener(handler);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSexo = new javax.swing.ButtonGroup();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelOcupacao = new javax.swing.JLabel();
        jCheckBoxEstudante = new javax.swing.JCheckBox();
        jLabelSexo = new javax.swing.JLabel();
        jRadioButtonMasculino = new javax.swing.JRadioButton();
        jRadioButtonFeminino = new javax.swing.JRadioButton();
        jLabelComentario = new javax.swing.JLabel();
        jButtonGravar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaComentario = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNome.setText("Nome");

        jLabelOcupacao.setText("Ocupação");

        jCheckBoxEstudante.setText("Estudante");

        jLabelSexo.setText("Sexo");

        jRadioButtonMasculino.setText("Masculino");

        jRadioButtonFeminino.setText("Feminino");

        jLabelComentario.setText("Breve comentário sobre você");

        jButtonGravar.setText("Gravar");
        jButtonGravar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGravarMouseClicked(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLimparMouseClicked(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelarMouseClicked(evt);
            }
        });

        jTextAreaComentario.setColumns(20);
        jTextAreaComentario.setRows(5);
        jScrollPane1.setViewportView(jTextAreaComentario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNome))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelOcupacao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBoxEstudante))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelSexo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonMasculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonFeminino))
                                    .addComponent(jLabelComentario))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jButtonGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)
                        .addGap(0, 76, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOcupacao)
                    .addComponent(jCheckBoxEstudante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSexo)
                    .addComponent(jRadioButtonMasculino)
                    .addComponent(jRadioButtonFeminino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelComentario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGravar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGravarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGravarMouseClicked
        // TODO add your handling code here:
        // Direciona para o método que efetua a ação de executar a gravação dos dados no sistema
        onClickedGravar();
    }//GEN-LAST:event_jButtonGravarMouseClicked

    private void jButtonLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLimparMouseClicked
        // TODO add your handling code here:
        // Direciona para o método que efetua a ação de executar a limpeza dos dados da tela
        onClikedLimpar();
    }//GEN-LAST:event_jButtonLimparMouseClicked

    private void jButtonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMouseClicked
        // TODO add your handling code here:
        // Direciona para o método que efetua a ação de executar o cancelamento dos dados no sistema
        onClickedCancelar();
    }//GEN-LAST:event_jButtonCancelarMouseClicked

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
            java.util.logging.Logger.getLogger(FrmCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JCheckBox jCheckBoxEstudante;
    private javax.swing.JLabel jLabelComentario;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelOcupacao;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JRadioButton jRadioButtonFeminino;
    private javax.swing.JRadioButton jRadioButtonMasculino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaComentario;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables

    /**
     * Método que executa a ação do botão "Gravar" os dados da tela no sistema
     */
    private void onClickedGravar() {
        // Deve apresentar uma mensagem de gravado com sucesso
        
        // Deve apresentar outra mensagem com os dados: 
        //  Nome se ele é estudante qual o sexo e comentario
        
        // Solicitar com JOptionPane se o usuário deseja cadastrar um novo estudante
        
        // Se desejar cadastar um novo limpar os campos
        
        // Senão finalizar a aplicação ou retornar para a tela de login
        
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("O nome é: ").append(jTextFieldNome.getText()).append("\n");
        String ocupacao = ((jCheckBoxEstudante.isSelected()) ? "é estudante": "não é estudante" );
        stringBuilder.append("A ocupação é: ").append(ocupacao).append("\n");
        
        // Explicar diferença entre stringbuilder e stringbuffer
        
        JOptionPane.showMessageDialog(this, stringBuilder.toString());
    }

    /**
     * Método que executa a ação do botão "Limpar" os dados dos campos da tela
     */
    private void onClikedLimpar() {
        jTextFieldNome.setText("");
        jCheckBoxEstudante.setSelected(false);
        jRadioButtonMasculino.setSelected(false);
        jRadioButtonFeminino.setSelected(false);
        jTextAreaComentario.setText("");
    }

    /**
     * Método que executa a ação do botão "Cancelar" os dados no sistema
     */
    private void onClickedCancelar() {
        // Deve retornar para a tela de login
        
    }

    /**
     * Classe interna para tramento de eventos de botões
     */
    private class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            JOptionPane.showMessageDialog(FrmCadastro.this, 
                    String.format("Você precionou: %s", 
                            evento.getActionCommand()));
        }
        
    }
}
