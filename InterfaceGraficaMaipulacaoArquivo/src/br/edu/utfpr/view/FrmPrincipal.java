/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.view;

import br.edu.utfpr.view.arquivo.FrmMapaAcervo;
import br.edu.utfpr.view.cadastro.FrmCadastroBiblioteca;
import br.edu.utfpr.view.cadastro.FrmCadastroLivro;
import br.edu.utfpr.view.relatorio.FrmRelatorioBiblioteca;
import javax.swing.JFrame;

/**
 *
 * @author root
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemMapaAcervo = new javax.swing.JMenuItem();
        jMenuItemFechar = new javax.swing.JMenuItem();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadastroBiblioteca = new javax.swing.JMenuItem();
        jMenuItemCadastroLivro = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuItemRelatorioBiblioteca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal Sistema Avaliação");

        jMenuArquivo.setText("Arquivo");

        jMenuItemMapaAcervo.setText("Mapa Acervo");
        jMenuItemMapaAcervo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMapaAcervoActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemMapaAcervo);

        jMenuItemFechar.setText("Fechar");
        jMenuItemFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFecharActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemFechar);

        jMenuBarPrincipal.add(jMenuArquivo);

        jMenuCadastro.setText("Cadastro");

        jMenuItemCadastroBiblioteca.setText("Cadastro Biblioteca");
        jMenuItemCadastroBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroBibliotecaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroBiblioteca);

        jMenuItemCadastroLivro.setText("Cadastro Livro");
        jMenuItemCadastroLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroLivroActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroLivro);

        jMenuBarPrincipal.add(jMenuCadastro);

        jMenuRelatorio.setText("Relatório");

        jMenuItemRelatorioBiblioteca.setText("Relatório Biblioteca");
        jMenuItemRelatorioBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatorioBibliotecaActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItemRelatorioBiblioteca);

        jMenuBarPrincipal.add(jMenuRelatorio);

        setJMenuBar(jMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemMapaAcervoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMapaAcervoActionPerformed
        // TODO add your handling code here:
        onClickedMapaAcervo();
    }//GEN-LAST:event_jMenuItemMapaAcervoActionPerformed

    private void jMenuItemFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFecharActionPerformed
        // TODO add your handling code here:
        onClickedFechar();
    }//GEN-LAST:event_jMenuItemFecharActionPerformed

    private void jMenuItemCadastroBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroBibliotecaActionPerformed
        // TODO add your handling code here:
        onCLickedCadastroBiblioteca();
    }//GEN-LAST:event_jMenuItemCadastroBibliotecaActionPerformed

    private void jMenuItemCadastroLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroLivroActionPerformed
        // TODO add your handling code here:
        onClickedCadastroLivro();
    }//GEN-LAST:event_jMenuItemCadastroLivroActionPerformed

    private void jMenuItemRelatorioBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatorioBibliotecaActionPerformed
        // TODO add your handling code here:
        onClickedRelatorioBiblioteca();
    }//GEN-LAST:event_jMenuItemRelatorioBibliotecaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemCadastroBiblioteca;
    private javax.swing.JMenuItem jMenuItemCadastroLivro;
    private javax.swing.JMenuItem jMenuItemFechar;
    private javax.swing.JMenuItem jMenuItemMapaAcervo;
    private javax.swing.JMenuItem jMenuItemRelatorioBiblioteca;
    private javax.swing.JMenu jMenuRelatorio;
    // End of variables declaration//GEN-END:variables

    private void onClickedMapaAcervo() {
        FrmMapaAcervo frmMapaAcervo = new FrmMapaAcervo();
        this.add(frmMapaAcervo);
        frmMapaAcervo.setVisible(true);
    }

    private void onClickedFechar() {
        this.dispose();
    }

    private void onCLickedCadastroBiblioteca() {
        FrmCadastroBiblioteca frmCadastroBiblioteca = new FrmCadastroBiblioteca();
        this.add(frmCadastroBiblioteca);
        frmCadastroBiblioteca.setVisible(true);
    }

    private void onClickedCadastroLivro() {
        FrmCadastroLivro frmCadastroLivro = new FrmCadastroLivro();
        this.add(frmCadastroLivro);
        frmCadastroLivro.setVisible(true);
    }

    private void onClickedRelatorioBiblioteca() {
        FrmRelatorioBiblioteca frmRelatorioBiblioteca = new FrmRelatorioBiblioteca();
        this.add(frmRelatorioBiblioteca);
        frmRelatorioBiblioteca.setVisible(true);
    }
}
