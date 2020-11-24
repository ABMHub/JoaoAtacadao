/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static joaoatacadao.BancoDeDados.pesquisa;
import joaoatacadao.ItemPedido;

/**
 *
 * @author João Víctor
 */
public class Caixa extends javax.swing.JFrame {
    ArrayList <ItemPedido> itens = new ArrayList<>();
    ItemPedido item;
    /**
     * Creates new form Caixa
     */
    public Caixa() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        pnlCaixa = new javax.swing.JPanel();
        lblPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaDadosProduto = new javax.swing.JTextArea();
        btnPagar = new javax.swing.JButton();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlCaixa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "CAIXA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11)))); // NOI18N

        lblPesquisar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPesquisar.setText("Informe o código de barras:");

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pesquisar1.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Preço", "Quantidade", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        txaDadosProduto.setEditable(false);
        txaDadosProduto.setColumns(20);
        txaDadosProduto.setRows(5);
        jScrollPane3.setViewportView(txaDadosProduto);

        btnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pagar1.png"))); // NOI18N
        btnPagar.setText("Pagar");

        lblQuantidade.setText("Informe a quantidade:");

        txtQuantidade.setEditable(false);

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar1.png"))); // NOI18N
        btnAdicionar.setText("Adicionar");

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir1.png"))); // NOI18N
        btnExcluir.setText("Excluir");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alerta1.png"))); // NOI18N
        jButton1.setText("Perigo");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar1.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCaixaLayout = new javax.swing.GroupLayout(pnlCaixa);
        pnlCaixa.setLayout(pnlCaixaLayout);
        pnlCaixaLayout.setHorizontalGroup(
            pnlCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCaixaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnPesquisar)
                    .addComponent(jScrollPane3)
                    .addGroup(pnlCaixaLayout.createSequentialGroup()
                        .addGroup(pnlCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPesquisar)
                            .addComponent(lblQuantidade, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCaixaLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButton1)
                .addGap(47, 47, 47)
                .addComponent(btnPagar)
                .addGap(63, 63, 63)
                .addComponent(btnAdicionar)
                .addGap(54, 54, 54)
                .addComponent(btnExcluir)
                .addGap(50, 50, 50)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCaixaLayout.setVerticalGroup(
            pnlCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCaixaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCaixaLayout.createSequentialGroup()
                        .addGroup(pnlCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPesquisar)
                            .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar)
                        .addGap(6, 6, 6)
                        .addGroup(pnlCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQuantidade)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnExcluir)
                    .addComponent(btnPagar)
                    .addComponent(jButton1)
                    .addComponent(btnCancelar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String codigo = txtPesquisar.getText();
        String arquivo;
        String [] dados = null;
        switch(codigo.charAt(0))
        {
            case 'a': 
            case 'A':
                arquivo = "celulares.txt";
                break;
            
            case 'b': 
            case 'B':
                arquivo = "computadores.txt";
                break;
                
            case 'c': 
            case 'C':
                arquivo = "eletroeletronicos.txt";
                break;
                
            case 'd': 
            case 'D':
                arquivo = "filmes.txt";
                break;    
            
            case 'e': 
            case 'E':
                arquivo = "perifericos.txt";
                break;
            
            case 'f': 
            case 'F':
                arquivo = "vestuario.txt";
                break;    
                
            case 'g':
            case 'G':
                arquivo = "livros.txt";
                break;
                
            default:
                arquivo = "choremos.txt";   //Deu ruim
               
        }
        
        try {
            dados = pesquisa("dados/" + arquivo, codigo);
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        if(dados != null){
            item = new ItemPedido(dados);
            //itens.add(item);
            txtQuantidade.setEditable(true);
            txaDadosProduto.setText((item.getProduto()).toString());
        }else
            JOptionPane.showMessageDialog(null, "Produto não encontrado!", "Falha na Busca", JOptionPane.ERROR_MESSAGE);
    
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtPesquisar.setText("");
        txaDadosProduto.setText("");
        txtQuantidade.setText("");
        txtQuantidade.setEditable(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JPanel pnlCaixa;
    private javax.swing.JTextArea txaDadosProduto;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
