import java.awt.Color;

/**
 *
 * @author rohan.aney
 */
public class Options extends javax.swing.JFrame {

    /**
     * Creates new form Options
     */
    public Options() {
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
    	
    	this.getContentPane().setBackground(Color.decode("#3a4660"));
    	
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setForeground(Color.decode("#feda6a"));
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setForeground(Color.decode("#feda6a"));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setForeground(Color.decode("#feda6a"));
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setForeground(Color.decode("#feda6a"));
        displayTables = new javax.swing.JButton();
        displayTables.setBackground(Color.decode("#feda6a"));
        displayClassTAs = new javax.swing.JButton();
        displayClassTAs.setBackground(Color.decode("#feda6a"));
        getPrerequisites = new javax.swing.JButton();
        getPrerequisites.setBackground(Color.decode("#feda6a"));
        addStudent = new javax.swing.JButton();
        addStudent.setBackground(Color.decode("#feda6a"));
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setForeground(Color.decode("#feda6a"));
        addStudent1 = new javax.swing.JButton();
        addStudent1.setBackground(Color.decode("#feda6a"));
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setForeground(Color.decode("#feda6a"));
        addStudent2 = new javax.swing.JButton();
        addStudent2.setBackground(Color.decode("#feda6a"));
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("1. Display Tables");

        jLabel2.setText("2. Display Class TAs");

        jLabel3.setText("3. Get Prerequisites");

        jLabel4.setText("4. Enroll Student");

        displayTables.setText("show");
        displayTables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayTablesActionPerformed(evt);
            }
        });

        displayClassTAs.setText("show");
        displayClassTAs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayClassTAsMouseClicked(evt);
            }
        });
        displayClassTAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayClassTAsActionPerformed(evt);
            }
        });

        getPrerequisites.setText("show");
        getPrerequisites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPrerequisitesActionPerformed(evt);
            }
        });

        addStudent.setText("show");
        addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentActionPerformed(evt);
            }
        });

        jLabel5.setText("5. Drop student from a class");

        addStudent1.setText("show");
        addStudent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudent1ActionPerformed(evt);
            }
        });

        jLabel6.setText("6. Delete student");

        addStudent2.setText("show");
        addStudent2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudent2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayTables, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(displayClassTAs, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(getPrerequisites, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addStudent, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addStudent1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addStudent2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(displayTables))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(displayClassTAs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(getPrerequisites))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(addStudent))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(addStudent1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(addStudent2))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayTablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayTablesActionPerformed
        // TODO add your handling code here:
    	getTableDisplay gtDisp=new getTableDisplay();
    	gtDisp.setVisible(true);
    }//GEN-LAST:event_displayTablesActionPerformed

    private void displayClassTAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayClassTAsActionPerformed
        // TODO add your handling code here:
        ClassTADisplay classTADisplay = new ClassTADisplay();
    }//GEN-LAST:event_displayClassTAsActionPerformed

    private void displayClassTAsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayClassTAsMouseClicked
        // TODO add your handling code here:
        new ClassTADisplay().setVisible(true);
    }//GEN-LAST:event_displayClassTAsMouseClicked

    private void getPrerequisitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPrerequisitesActionPerformed
        new getPrereqDisplay().setVisible(true);
    }//GEN-LAST:event_getPrerequisitesActionPerformed

    private void addStudent2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudent2ActionPerformed
        // TODO add your handling code here:
         new getDropStudentDisplay().setVisible(true);
    }//GEN-LAST:event_addStudent2ActionPerformed

    private void addStudent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudent1ActionPerformed
        // TODO add your handling code here:
        new dropStudentFromClassDisplay().setVisible(true);
    }//GEN-LAST:event_addStudent1ActionPerformed

    private void addStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentActionPerformed
        new getEnrollStudentDisplay().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_addStudentActionPerformed

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
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Options().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudent;
    private javax.swing.JButton addStudent1;
    private javax.swing.JButton addStudent2;
    private javax.swing.JButton displayClassTAs;
    private javax.swing.JButton displayTables;
    private javax.swing.JButton getPrerequisites;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

    private void GetPrereqDisplay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
