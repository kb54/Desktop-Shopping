package Shopping;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LAP_1.java
 *
 * Created on Apr 19, 2016, 9:12:42 AM
 */

/**
 *
 * @author Sunil
 */
public class LAP_1 extends javax.swing.JFrame {

    /** Creates new form LAP_1 */
    public LAP_1() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setText("Lenovo IdeaPad 100-14IBD 80RK002UIH ");
        jLabel1.setBounds(20, 0, 400, 60);
        jDesktopPane2.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane1.setBounds(50, 370, 320, 220);
        jDesktopPane2.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LARGE_PICS/1.jpeg"))); // NOI18N
        jLabel2.setBounds(20, 50, 410, 310);
        jDesktopPane2.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setText("PRICE(Rs)");
        jLabel3.setBounds(50, 600, 80, 14);
        jDesktopPane2.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField1.setEditable(false);
        jTextField1.setText("30,000");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.setBounds(230, 600, 110, 20);
        jDesktopPane2.add(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton1.setText("CLICK TO PLACE ORDER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(100, 660, 190, 23);
        jDesktopPane2.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton2.setText("VIEW DETAILS");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(130, 630, 140, 23);
        jDesktopPane2.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.setBounds(340, 660, 73, 23);
        jDesktopPane2.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-446)/2, (screenSize.height-729)/2, 446, 729);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         jTextArea1.setText(" "+"BRAND:LENOVO \n MODEL:IDEAPAD \n RAM:4GB DDR3 \n ROM:500GB \n PROCESSOR:5th Generation i3 \n Windows:8.1 \n FREEBIE:EXTERNAL BLUETOOTH MOUSE \n AND HEDSET AND \nA COMPLIMENTARY LAPTOP BAG.");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new orderform().setVisible(true);
        LAP_1.this.dispose();
        orderform.jTextField6.setText(" "+LAP_1.jTextField1.getText());
        orderform.jTextField7.setText(LAP_1.jLabel1.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        LAP_1.this.dispose();
        new PRODUCT().setVisible(true);
}//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LAP_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane2;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    public static javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
