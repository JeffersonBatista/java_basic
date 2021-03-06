/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor.exercicio.com;

import java.util.Arrays;
import javax.swing.DefaultListModel;

/**
 *
 * @author jeffe
 */
public class VetorExercicioJava extends javax.swing.JFrame {

    int vetor[] = new int[10];
    DefaultListModel lista = new DefaultListModel();
    int selecionado = 0;
    /**
     * Creates new form VetorExercicioJava
     */
    public VetorExercicioJava() {
        initComponents();
        for (int c = 0; c < vetor.length; c++){
            lista.addElement(vetor[c]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnNum = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        btnRmv = new javax.swing.JButton();
        btnOrd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstVetor = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        lblVetor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        spnNum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 153, 255));
        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRmv.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRmv.setForeground(new java.awt.Color(255, 0, 0));
        btnRmv.setText("Remover");
        btnRmv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRmvActionPerformed(evt);
            }
        });

        btnOrd.setBackground(new java.awt.Color(0, 0, 0));
        btnOrd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnOrd.setForeground(new java.awt.Color(255, 255, 0));
        btnOrd.setText("Ordenar");
        btnOrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdActionPerformed(evt);
            }
        });

        lstVetor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lstVetor.setModel(lista);
        lstVetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstVetorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstVetor);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Vetor Selecionado");

        lblVetor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblVetor.setForeground(new java.awt.Color(255, 0, 0));
        lblVetor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVetor.setText("[ - - ]");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRmv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVetor)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(spnNum, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnNum, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVetor))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnAdd)
                        .addGap(34, 34, 34)
                        .addComponent(btnRmv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btnOrd)
                        .addGap(47, 47, 47))))
        );

        lblVetor.getAccessibleContext().setAccessibleName("- - -");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        vetor[selecionado] = Integer.parseInt(spnNum.getValue().toString());
        lista.removeAllElements();
        for (int c = 0; c < vetor.length; c++){
            lista.addElement(vetor[c]);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRmvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRmvActionPerformed
        // TODO add your handling code here:
        vetor[selecionado] = 0;
        lista.removeAllElements();
        for (int c = 0; c < vetor.length; c++){
            lista.addElement(vetor[c]);
    }//GEN-LAST:event_btnRmvActionPerformed
}
    private void btnOrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdActionPerformed
        // TODO add your handling code here:
        Arrays.sort(vetor);
        lista.removeAllElements();
        for (int c = 0; c < vetor.length; c++){
            lista.addElement(vetor[c]);
    }//GEN-LAST:event_btnOrdActionPerformed
}
    private void lstVetorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstVetorMouseClicked
        // TODO add your handling code here:
        selecionado = lstVetor.getSelectedIndex();
        lblVetor.setText("[" + selecionado + "]");
    }//GEN-LAST:event_lstVetorMouseClicked

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
            java.util.logging.Logger.getLogger(VetorExercicioJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VetorExercicioJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VetorExercicioJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VetorExercicioJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VetorExercicioJava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnOrd;
    private javax.swing.JButton btnRmv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblVetor;
    private javax.swing.JList<String> lstVetor;
    private javax.swing.JSpinner spnNum;
    // End of variables declaration//GEN-END:variables
}
