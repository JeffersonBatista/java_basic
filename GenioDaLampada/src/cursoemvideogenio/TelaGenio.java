/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoemvideogenio;

/**
 *
 * @author jeffe
 */
public class TelaGenio extends javax.swing.JFrame {

    /**
     * Creates new form TelaGenio
     */
    public TelaGenio() {
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

        btnAdvinhar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        spnNum = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdvinhar.setBackground(new java.awt.Color(0, 102, 204));
        btnAdvinhar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdvinhar.setForeground(new java.awt.Color(153, 0, 0));
        btnAdvinhar.setText("Adivinhar");
        btnAdvinhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdvinharActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdvinhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Genio Projeto JAVA2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        spnNum.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        spnNum.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        getContentPane().add(spnNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 73, 34));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VALOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 97, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Estou pensando em um número!!! ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 330, 40));

        lblResultado.setBackground(new java.awt.Color(204, 0, 0));
        lblResultado.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(0, 204, 204));
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 320, 31));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Escolha um número de 0 á 10:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 330, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdvinharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdvinharActionPerformed
        // TODO add your handling code here:
        int sorteado = (int) (0 + Math.random()*(10-0));
        int palpite = Integer.parseInt(spnNum.getValue().toString());
        System.out.println(sorteado);
        System.out.println(palpite);
        String f1 = "Acertou eu Pensei no número: " + sorteado;
        String f2 = "Você errou, pensei no número: " + sorteado;
        String resultado = sorteado == palpite ? f1 : f2;
        lblResultado.setText(resultado); 
    }//GEN-LAST:event_btnAdvinharActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGenio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdvinhar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JSpinner spnNum;
    // End of variables declaration//GEN-END:variables
}