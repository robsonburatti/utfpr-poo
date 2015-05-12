/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.view.cadastro;

import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author root
 */
public class FrmCadastroTreeView extends javax.swing.JInternalFrame implements TreeSelectionListener {

    private JTree jTreeDados;
    
    /**
     * Creates new form FrmCadastroTreeView
     */
    public FrmCadastroTreeView() {
        initComponents();
        carregaTreeView();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDados = new javax.swing.JTextArea();

        setClosable(true);
        setTitle("Cadastro TreeView");

        jTextAreaDados.setColumns(20);
        jTextAreaDados.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDados;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Método que carrega a árvore de elementos do componente TreeView
     */
    private void carregaTreeView() {
        // Adiciona o elemento filho de root com 3 filhos
        DefaultMutableTreeNode defaultMutableTreeNode1 = new DefaultMutableTreeNode("Elemento 1");
        // Adiciona os subelementos
        defaultMutableTreeNode1.add(new DefaultMutableTreeNode("Elemento filho 1"));
        defaultMutableTreeNode1.add(new DefaultMutableTreeNode("Elemento filho 2"));
        defaultMutableTreeNode1.add(new DefaultMutableTreeNode("Elemento filho 3"));
        
        // Adiciona outro subelemento de root com 3 filhos
        DefaultMutableTreeNode defaultMutableTreeNode2 = new DefaultMutableTreeNode("Elemento 2");
        // Adiciona os subelementos
        defaultMutableTreeNode2.add(new DefaultMutableTreeNode("Filho 1"));
        defaultMutableTreeNode2.add(new DefaultMutableTreeNode("Filho 2"));
        defaultMutableTreeNode2.add(new DefaultMutableTreeNode("Filho 3"));
        
        // Cria o elemento root e adiciona os DefaultMutableTreeNode filhos criados anteriormente
        DefaultMutableTreeNode defaultMutableTreeNodePrincipal = new DefaultMutableTreeNode("Principal");
        // Adiciona os DefaultMutableTreeNode filhos no elemento root
        defaultMutableTreeNodePrincipal.add(defaultMutableTreeNode1);
        defaultMutableTreeNodePrincipal.add(defaultMutableTreeNode2);
        
        // Instância o componente JTree passando para o construtor o DefaultMutableTreeNode root
        jTreeDados = new JTree(defaultMutableTreeNodePrincipal);
        // Adiciona o para o componente o evento que deve ser executando quando for selecionado um elemento final
        jTreeDados.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        jTreeDados.addTreeSelectionListener(this);
        // Atribui o tamanho do componente de 200 por 200 pixel
        jTreeDados.setSize(200, 200);
        
        // Estiliza a forma de apresentar as pastinhas no componente
//        jTreeDados.putClientProperty("JTree.lineStyle", "Angled"); // Linhas  (default)
//        jTreeDados.putClientProperty("JTree.lineStyle", "Horizontal"); // Linhas Horizontal
//        jTreeDados.putClientProperty("JTree.lineStyle", "None"); // Nenhuma linha
        
        // Adiciona o componente na tela do formulário
        this.add(jTreeDados);
    }

    /**
     * Implementação do evento de click em um elemento do componente TreeView
     * @param e 
     */
    @Override
    public void valueChanged(TreeSelectionEvent e) {
        // Recupera o elemento selecionado
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) jTreeDados.getLastSelectedPathComponent();
 
        // Efetua o teste se o componente não é nulo
        if (node == null) {
            // Caso for nulo retorna o método
            return;
        }
 
        // Recupera o objeto do elemento 
        Object nodeInfo = node.getUserObject();
        
        // Efetua teste se o componente não tem mais filhos e é um elemento final
        if (node.isLeaf()) {
            // Apresenta o nome do elemento no campo de texto
            jTextAreaDados.setText(nodeInfo.toString());
        }
    }
    
}

