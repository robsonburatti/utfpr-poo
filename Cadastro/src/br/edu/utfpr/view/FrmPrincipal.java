/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.view;

import br.edu.utfpr.view.cadastro.FrmCadastroArquivo;
import br.edu.utfpr.view.cadastro.FrmCadastroListas;
import br.edu.utfpr.view.cadastro.FrmCadastroTreeView;
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
        jMenuItemSalvarArquivo = new javax.swing.JMenuItem();
        jMenuItemSalvarBanco = new javax.swing.JMenuItem();
        jMenuItemConfiguracoes = new javax.swing.JMenuItem();
        jMenuItemFechar = new javax.swing.JMenuItem();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemClienteArquivo = new javax.swing.JMenuItem();
        jMenuItemCadastroBanco = new javax.swing.JMenuItem();
        jMenuItemCadastroListas = new javax.swing.JMenuItem();
        jMenuItemCadstroTreeView = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuItemListaClienteArquivo = new javax.swing.JMenuItem();
        jMenuItemListaClienteBanco = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal Do Sistema");

        jMenuArquivo.setText("Arquivo");

        jMenuItemSalvarArquivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSalvarArquivo.setText("Salvar Arquivo");
        jMenuArquivo.add(jMenuItemSalvarArquivo);

        jMenuItemSalvarBanco.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSalvarBanco.setText("Salvar Banco");
        jMenuArquivo.add(jMenuItemSalvarBanco);

        jMenuItemConfiguracoes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemConfiguracoes.setText("Configuração");
        jMenuArquivo.add(jMenuItemConfiguracoes);

        jMenuItemFechar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemFechar.setText("Fechar");
        jMenuItemFechar.setToolTipText("Finaliza o sistema");
        jMenuItemFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFecharActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemFechar);

        jMenuBarPrincipal.add(jMenuArquivo);

        jMenuCadastro.setText("Cadastro");

        jMenuItemClienteArquivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemClienteArquivo.setText("Cliente Arquivo");
        jMenuItemClienteArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteArquivoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemClienteArquivo);

        jMenuItemCadastroBanco.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemCadastroBanco.setText("Cliente Banco");
        jMenuCadastro.add(jMenuItemCadastroBanco);

        jMenuItemCadastroListas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemCadastroListas.setText("Cadastro Listas");
        jMenuItemCadastroListas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroListasActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroListas);

        jMenuItemCadstroTreeView.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemCadstroTreeView.setText("Cadastro TreeView");
        jMenuItemCadstroTreeView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadstroTreeViewActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadstroTreeView);

        jMenuBarPrincipal.add(jMenuCadastro);

        jMenuRelatorio.setText("Relatório");

        jMenuItemListaClienteArquivo.setText("Lista Cliente Arquivo");
        jMenuRelatorio.add(jMenuItemListaClienteArquivo);

        jMenuItemListaClienteBanco.setText("Lista Cliente Banco");
        jMenuRelatorio.add(jMenuItemListaClienteBanco);

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

    private void jMenuItemFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFecharActionPerformed
        // TODO add your handling code here:
        onClickedFechar();
    }//GEN-LAST:event_jMenuItemFecharActionPerformed

    private void jMenuItemClienteArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteArquivoActionPerformed
        // TODO add your handling code here:
        onClickedClienteArquivo();
    }//GEN-LAST:event_jMenuItemClienteArquivoActionPerformed

    private void jMenuItemCadastroListasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroListasActionPerformed
        // TODO add your handling code here:
        onClickedCadastroListas();
    }//GEN-LAST:event_jMenuItemCadastroListasActionPerformed

    private void jMenuItemCadstroTreeViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadstroTreeViewActionPerformed
        // TODO add your handling code here:
        onClickedCadastroTreeView();
    }//GEN-LAST:event_jMenuItemCadstroTreeViewActionPerformed

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
    private javax.swing.JMenuItem jMenuItemCadastroBanco;
    private javax.swing.JMenuItem jMenuItemCadastroListas;
    private javax.swing.JMenuItem jMenuItemCadstroTreeView;
    private javax.swing.JMenuItem jMenuItemClienteArquivo;
    private javax.swing.JMenuItem jMenuItemConfiguracoes;
    private javax.swing.JMenuItem jMenuItemFechar;
    private javax.swing.JMenuItem jMenuItemListaClienteArquivo;
    private javax.swing.JMenuItem jMenuItemListaClienteBanco;
    private javax.swing.JMenuItem jMenuItemSalvarArquivo;
    private javax.swing.JMenuItem jMenuItemSalvarBanco;
    private javax.swing.JMenu jMenuRelatorio;
    // End of variables declaration//GEN-END:variables

    /**
     * Fecha o sistema
     */
    private void onClickedFechar() {
        this.dispose();
    }

    private void onClickedClienteArquivo() {
//        TelaInterna telaInterna = new TelaInterna();
//        this.add(telaInterna);
//        telaInterna.setVisible(true);
        FrmCadastroArquivo frmCadastroArquivo = new FrmCadastroArquivo();
        this.add(frmCadastroArquivo);
        frmCadastroArquivo.setVisible(true);
    }
    
    private void onClickedCadastroListas() {
        FrmCadastroListas frmCadastroListas = new FrmCadastroListas();
        this.add(frmCadastroListas);
        frmCadastroListas.setVisible(true);
    }

    private void onClickedCadastroTreeView() {
        FrmCadastroTreeView frmCadastroTreeView = new FrmCadastroTreeView();
        this.add(frmCadastroTreeView);
        frmCadastroTreeView.setVisible(true);
    }

}
