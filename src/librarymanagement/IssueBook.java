/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author ravi
 */
public class IssueBook extends javax.swing.JFrame {

    /**
     * Creates new form IssueBook
     */
    public IssueBook() {
        initComponents();
    }
    
    static String currentDate() {
        LocalDate date = LocalDate.now();
        String Date = date.toString();
        return Date;
    }
    static String returnDate() {
        LocalDate date = LocalDate.now();
        LocalDate returnDate = date.plusDays(7);  
        String Date = returnDate.toString();
        return Date;
    }
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
		ps2.setInt(1,quantity-1);
		ps2.setInt(2,bookId);
		status=ps2.executeUpdate();
            }
            
        } catch (SQLException e) {
            
        }
        return status;
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
        Name = new javax.swing.JLabel();
        StudentIdInput = new javax.swing.JTextField();
        Author = new javax.swing.JLabel();
        BookIdInput = new javax.swing.JTextField();
        BookId = new javax.swing.JLabel();
        Contact = new javax.swing.JLabel();
        PhoneInput = new javax.swing.JTextField();
        StudentNameInput = new javax.swing.JTextField();
        Cancel = new javax.swing.JButton();
        Confirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LIBRARY MANAGEMENT SYSTEM");

        Heading.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        Heading.setForeground(new java.awt.Color(51, 0, 24));
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("ISSUE BOOKS");

        Name.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Name.setText("Student ID");

        StudentIdInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 2, true));
        StudentIdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentIdInputActionPerformed(evt);
            }
        });

        Author.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Author.setText("Student Name");

        BookIdInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 2, true));
        BookIdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookIdInputActionPerformed(evt);
            }
        });

        BookId.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        BookId.setText("Book ID");

        Contact.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Contact.setText("Contact No");

        PhoneInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 2, true));
        PhoneInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneInputActionPerformed(evt);
            }
        });

        StudentNameInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 2, true));
        StudentNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentNameInputActionPerformed(evt);
            }
        });

        Cancel.setBackground(new java.awt.Color(217, 83, 79));
        Cancel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Cancel.setForeground(new java.awt.Color(255, 255, 255));
        Cancel.setText("Cancel");
        Cancel.setBorderPainted(false);
        Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Cancel.setOpaque(true);
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BookId, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BookIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StudentIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Author, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Contact, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PhoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StudentNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BookId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StudentIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Author, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StudentNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contact, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StudentIdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentIdInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentIdInputActionPerformed

    private void BookIdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookIdInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookIdInputActionPerformed

    private void PhoneInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneInputActionPerformed

    private void StudentNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentNameInputActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        AdminMainPage adp = new AdminMainPage();
        adp.setVisible(true);
        dispose();
    }//GEN-LAST:event_CancelActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        // TODO add your handling code here:
        try {
            Con con = new Con();
            String sql = "INSERT into issueBook(bookID,studentID,studentName,phone,issueDate,returnDate) VALUES(?,?,?,?,?,?)";
            PreparedStatement st = con.c.prepareStatement(sql);
            int id = Integer.parseInt(BookIdInput.getText());
            updatebook(id);
            st.setInt(1,id);
            st.setInt(2,Integer.parseInt(StudentIdInput.getText()));
            st.setString(3,StudentNameInput.getText());
            st.setString(4,PhoneInput.getText());
            st.setString(5,currentDate());
            st.setString(6,returnDate());
            
            int result = st.executeUpdate();
            System.out.println(result);
            if(result > 0){
                 JOptionPane.showMessageDialog(IssueBook.this,"Book Issued Successfully","Issued Successfully!",JOptionPane.OK_OPTION);
                 new AdminMainPage().setVisible(true);
                 dispose();
            } else {
                JOptionPane.showMessageDialog(IssueBook.this,"Unable to Issue Book","Error",JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Author;
    private javax.swing.JLabel BookId;
    private javax.swing.JTextField BookIdInput;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Confirm;
    private javax.swing.JLabel Contact;
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel Name;
    private javax.swing.JTextField PhoneInput;
    private javax.swing.JTextField StudentIdInput;
    private javax.swing.JTextField StudentNameInput;
    // End of variables declaration//GEN-END:variables
}