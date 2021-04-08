/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ravi
 */
public class ReturnBook extends javax.swing.JFrame {

    /**
     * Creates new form ReturnBook
     */
    public static int updatebook(int bookId){
        int status=0;    
        int quantity=0;
        try {
            Con con = new Con();
            PreparedStatement ps=con.c.prepareStatement("SELECT quantity from book where id=?");
            ps.setInt(1,bookId);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
		quantity=rs.getInt("quantity");
            }
            
            if(quantity>0){
		PreparedStatement ps2=con.c.prepareStatement("UPDATE book set quantity=? where id=?");
		ps2.setInt(1,quantity+1);
		ps2.setInt(2,bookId);
		status=ps2.executeUpdate();
            }
            
        } catch (SQLException e) {
            
        }
        return status;
    }
    
    public ReturnBook() {
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

        Heading = new javax.swing.JLabel();
        StudentId = new javax.swing.JLabel();
        StudentIdInput = new javax.swing.JTextField();
        BookIdInput = new javax.swing.JTextField();
        BookId = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        Confirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LIBRARY MANAGEMENT SYSTEM");

        Heading.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        Heading.setForeground(new java.awt.Color(51, 0, 24));
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("RETURN BOOK");

        StudentId.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        StudentId.setText("Student ID");

        StudentIdInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 2, true));
        StudentIdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentIdInputActionPerformed(evt);
            }
        });

        BookIdInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 2, true));
        BookIdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookIdInputActionPerformed(evt);
            }
        });

        BookId.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        BookId.setText("Book ID");

        Back.setBackground(new java.awt.Color(217, 83, 79));
        Back.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("Back");
        Back.setBorderPainted(false);
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Back.setOpaque(true);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Confirm.setBackground(new java.awt.Color(0, 255, 10));
        Confirm.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Confirm.setForeground(new java.awt.Color(255, 255, 255));
        Confirm.setText("Confirm");
        Confirm.setBorderPainted(false);
        Confirm.setOpaque(true);
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BookId, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BookIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(StudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(StudentIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BookId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StudentIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StudentIdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentIdInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentIdInputActionPerformed

    private void BookIdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookIdInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookIdInputActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        AdminMainPage amp = new AdminMainPage();
        amp.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        // TODO add your handling code here:
        try{
            Con con = new Con();
            int bookId = Integer.parseInt(BookIdInput.getText());
            updatebook(bookId);
            String sql = "DELETE FROM issueBook WHERE bookID=? AND studentID=?";
            PreparedStatement st = con.c.prepareStatement(sql);
            st.setInt(1,bookId);
            st.setInt(2,Integer.parseInt(StudentIdInput.getText()));
            
            int result = st.executeUpdate();
            if(result > 0){
                 JOptionPane.showMessageDialog(ReturnBook.this,"Book Returned Successfully","Returned Successfully!",JOptionPane.OK_OPTION);
                 new AdminMainPage().setVisible(true);
                 dispose();
            } else {
                JOptionPane.showMessageDialog(ReturnBook.this,"Unable to Return Book","Error",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_ConfirmActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel BookId;
    private javax.swing.JTextField BookIdInput;
    private javax.swing.JButton Confirm;
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel StudentId;
    private javax.swing.JTextField StudentIdInput;
    // End of variables declaration//GEN-END:variables
}