/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

/**
 *
 * @author ravi
 */
public class AdminMainPage extends javax.swing.JFrame {

    /**
     * Creates new form AdminMainPage
     */
    public AdminMainPage() {
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

        jLabel1 = new javax.swing.JLabel();
        AddBooks = new javax.swing.JButton();
        ViewBooks = new javax.swing.JButton();
        IssueBooks = new javax.swing.JButton();
        ViewIssuedBooks = new javax.swing.JButton();
        ReturnBook = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        AddStudents = new javax.swing.JButton();
        ViewStudents = new javax.swing.JButton();
        DeleteStudents = new javax.swing.JButton();
        UpdateStudents = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LIBRARY MANAGEMENT SYSTEM");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 24));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMIN SECTION");

        AddBooks.setBackground(new java.awt.Color(2, 117, 216));
        AddBooks.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        AddBooks.setForeground(new java.awt.Color(247, 247, 247));
        AddBooks.setText("ADD BOOKS");
        AddBooks.setBorderPainted(false);
        AddBooks.setOpaque(true);
        AddBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBooksActionPerformed(evt);
            }
        });

        ViewBooks.setBackground(new java.awt.Color(149, 53, 206));
        ViewBooks.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        ViewBooks.setForeground(new java.awt.Color(247, 247, 247));
        ViewBooks.setText("VIEW BOOKS");
        ViewBooks.setBorderPainted(false);
        ViewBooks.setOpaque(true);
        ViewBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBooksActionPerformed(evt);
            }
        });

        IssueBooks.setBackground(new java.awt.Color(251, 152, 212));
        IssueBooks.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        IssueBooks.setText("ISSUE BOOKS");
        IssueBooks.setBorderPainted(false);
        IssueBooks.setOpaque(true);
        IssueBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssueBooksActionPerformed(evt);
            }
        });

        ViewIssuedBooks.setBackground(new java.awt.Color(41, 43, 44));
        ViewIssuedBooks.setForeground(new java.awt.Color(247, 247, 247));
        ViewIssuedBooks.setText("VIEW ISSUED BOOKS");
        ViewIssuedBooks.setBorderPainted(false);
        ViewIssuedBooks.setOpaque(true);
        ViewIssuedBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewIssuedBooksActionPerformed(evt);
            }
        });

        ReturnBook.setBackground(new java.awt.Color(240, 173, 78));
        ReturnBook.setText("RETURN BOOK");
        ReturnBook.setBorderPainted(false);
        ReturnBook.setOpaque(true);
        ReturnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBookActionPerformed(evt);
            }
        });

        Logout.setBackground(new java.awt.Color(217, 83, 79));
        Logout.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("LOGOUT");
        Logout.setBorderPainted(false);
        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Logout.setOpaque(true);
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        AddStudents.setBackground(new java.awt.Color(2, 117, 216));
        AddStudents.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        AddStudents.setForeground(new java.awt.Color(247, 247, 247));
        AddStudents.setText("ADD STUDENTS");
        AddStudents.setBorderPainted(false);
        AddStudents.setOpaque(true);
        AddStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentsActionPerformed(evt);
            }
        });

        ViewStudents.setBackground(new java.awt.Color(149, 53, 206));
        ViewStudents.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        ViewStudents.setForeground(new java.awt.Color(247, 247, 247));
        ViewStudents.setText("VIEW STUDENTS");
        ViewStudents.setBorderPainted(false);
        ViewStudents.setOpaque(true);
        ViewStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewStudentsActionPerformed(evt);
            }
        });

        DeleteStudents.setBackground(new java.awt.Color(251, 152, 212));
        DeleteStudents.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        DeleteStudents.setText("DELETE STUDENTS");
        DeleteStudents.setBorderPainted(false);
        DeleteStudents.setOpaque(true);
        DeleteStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteStudentsActionPerformed(evt);
            }
        });

        UpdateStudents.setBackground(new java.awt.Color(41, 43, 44));
        UpdateStudents.setForeground(new java.awt.Color(247, 247, 247));
        UpdateStudents.setText("UPDATE STUDENTS");
        UpdateStudents.setBorderPainted(false);
        UpdateStudents.setOpaque(true);
        UpdateStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateStudentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ViewStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ViewBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AddStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AddBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DeleteStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(IssueBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UpdateStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ViewIssuedBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReturnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(255, 255, 255))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IssueBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewIssuedBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ReturnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentsActionPerformed
        // TODO add your handling code here:
       AddStudents as = new AddStudents();
       as.setVisible(true);
       dispose();
    }//GEN-LAST:event_AddStudentsActionPerformed

    private void AddBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBooksActionPerformed
        // TODO add your handling code here:
        AddBooks ab = new AddBooks();
        ab.setVisible(true);
        dispose();
    }//GEN-LAST:event_AddBooksActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        Start s = new Start();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutActionPerformed

    private void ViewBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBooksActionPerformed
        // TODO add your handling code here:
        ViewBooks vb = new ViewBooks();
        vb.setVisible(true);
        dispose();
    }//GEN-LAST:event_ViewBooksActionPerformed

    private void ViewStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewStudentsActionPerformed
        // TODO add your handling code here:
        ViewStudents vs = new ViewStudents();
        vs.setVisible(true);
        dispose();
    }//GEN-LAST:event_ViewStudentsActionPerformed

    private void DeleteStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteStudentsActionPerformed
        // TODO add your handling code here:
        DeleteStudents ds = new DeleteStudents();
        ds.setVisible(true);
        dispose();
    }//GEN-LAST:event_DeleteStudentsActionPerformed

    private void IssueBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssueBooksActionPerformed
        // TODO add your handling code here:
        IssueBook ib = new IssueBook();
        ib.setVisible(true);
        dispose();
    }//GEN-LAST:event_IssueBooksActionPerformed

    private void ViewIssuedBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewIssuedBooksActionPerformed
        // TODO add your handling code here:
        ViewIssuedBooks vib = new ViewIssuedBooks();
        vib.setVisible(true);
        dispose();
    }//GEN-LAST:event_ViewIssuedBooksActionPerformed

    private void ReturnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnBookActionPerformed
        // TODO add your handling code here:
        ReturnBook rb = new ReturnBook();
        rb.setVisible(true);
        dispose();
    }//GEN-LAST:event_ReturnBookActionPerformed

    private void UpdateStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateStudentsActionPerformed
        // TODO add your handling code here:
        UpdateStudents us = new UpdateStudents();
        us.setVisible(true);
        dispose();
    }//GEN-LAST:event_UpdateStudentsActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBooks;
    private javax.swing.JButton AddStudents;
    private javax.swing.JButton DeleteStudents;
    private javax.swing.JButton IssueBooks;
    private javax.swing.JButton Logout;
    private javax.swing.JButton ReturnBook;
    private javax.swing.JButton UpdateStudents;
    private javax.swing.JButton ViewBooks;
    private javax.swing.JButton ViewIssuedBooks;
    private javax.swing.JButton ViewStudents;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
