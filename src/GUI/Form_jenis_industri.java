/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import CRUD.Database;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ACER
 */
public class Form_jenis_industri extends javax.swing.JFrame {
    // private
    private final Database dbConnect;
    /**
     * Creates new form Form_jenis_industri
     */
    public Form_jenis_industri() {
        initComponents();
        dbConnect = new Database();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Edit1 = new javax.swing.JTextField();
        Edit2 = new javax.swing.JTextField();
        ButtonI = new javax.swing.JButton();
        ButtonU = new javax.swing.JButton();
        ButtonD = new javax.swing.JButton();
        ScrollPanel = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        Label3 = new javax.swing.JLabel();
        Edit3 = new javax.swing.JTextField();
        ButtonC = new javax.swing.JButton();
        ButtonB = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        Label1.setText("Kode Industri:");

        Label2.setText("Nama Industri:");

        ButtonI.setText("Insert");
        ButtonI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIActionPerformed(evt);
            }
        });

        ButtonU.setText("Update");
        ButtonU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUActionPerformed(evt);
            }
        });

        ButtonD.setText("Delete");
        ButtonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDActionPerformed(evt);
            }
        });

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Kode Industri", "Nama Industri"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        ScrollPanel.setViewportView(Table1);

        Label3.setText("Cari Nama:");

        Edit3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Edit3KeyPressed(evt);
            }
        });

        ButtonC.setText("Clear");
        ButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCActionPerformed(evt);
            }
        });

        ButtonB.setText("Back");
        ButtonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(ButtonI)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonU)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonD)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonC)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonB))
                            .addComponent(ScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label2)
                                .addGap(18, 18, 18)
                                .addComponent(Edit2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Edit1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(Label3)
                        .addGap(18, 18, 18)
                        .addComponent(Edit3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(373, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label1)
                    .addComponent(Edit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonI)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonU)
                        .addComponent(ButtonD)
                        .addComponent(ButtonC)
                        .addComponent(ButtonB)))
                .addGap(18, 18, 18)
                .addComponent(ScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label3)
                    .addComponent(Edit3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel table1 = (DefaultTableModel) Table1.getModel();
            if(Edit1.getText().isEmpty() && Edit2.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Input tidak boleh kosong");
            }
            else{
                JOptionPane.showMessageDialog(null, (dbConnect.insertValueJenisIndustri(Edit1.getText(), Edit2.getText())));
                table1.setRowCount(0);
                dbConnect.showtTable((DefaultTableModel)Table1.getModel(), "jenis_industri");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_ButtonIActionPerformed

    private void ButtonUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel table1 = (DefaultTableModel) Table1.getModel();
            if(Edit1.getText().isEmpty() && Edit2.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Input tidak boleh kosong");
            }
            else{
                JOptionPane.showMessageDialog(null, (dbConnect.updateValueJenisIndustri(Edit1.getText(), Edit2.getText())));
                table1.setRowCount(0);
                dbConnect.showtTable((DefaultTableModel)Table1.getModel(), "jenis_industri");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }//GEN-LAST:event_ButtonUActionPerformed

    private void ButtonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel table1 = (DefaultTableModel) Table1.getModel();
            if(Edit1.getText().isEmpty() && Edit2.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Input tidak boleh kosong");
            }
            else{
                JOptionPane.showMessageDialog(null, (dbConnect.deleteValueJenisIndustri(Edit1.getText())));
                table1.setRowCount(0);
                dbConnect.showtTable((DefaultTableModel)Table1.getModel(), "jenis_industri");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }    
    }//GEN-LAST:event_ButtonDActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        dbConnect.showtTable((DefaultTableModel)Table1.getModel(), "jenis_industri");
    }//GEN-LAST:event_formComponentShown

    private void Edit3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Edit3KeyPressed
        // TODO add your handling code here:
        DefaultTableModel table1 = (DefaultTableModel) Table1.getModel();
        table1.setRowCount(0);
        dbConnect.searchTableLike((DefaultTableModel)Table1.getModel(), "jenis_industri", Edit3.getText());
    }//GEN-LAST:event_Edit3KeyPressed

    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked
        // TODO add your handling code here:
        int index = Table1.getSelectedRow();
        DefaultTableModel table1 = (DefaultTableModel) Table1.getModel();
        Edit1.setText(table1.getValueAt(index, 1).toString());
        Edit2.setText(table1.getValueAt(index, 2).toString());
    }//GEN-LAST:event_Table1MouseClicked

    private void ButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCActionPerformed
        // TODO add your handling code here:
        Edit1.setText("");
        Edit2.setText("");
        Edit3.setText("");
    }//GEN-LAST:event_ButtonCActionPerformed

    private void ButtonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBActionPerformed
        // TODO add your handling code here:
        new Form_Menu().setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_ButtonBActionPerformed

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
            java.util.logging.Logger.getLogger(Form_jenis_industri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_jenis_industri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_jenis_industri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_jenis_industri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_jenis_industri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonB;
    private javax.swing.JButton ButtonC;
    private javax.swing.JButton ButtonD;
    private javax.swing.JButton ButtonI;
    private javax.swing.JButton ButtonU;
    private javax.swing.JTextField Edit1;
    private javax.swing.JTextField Edit2;
    private javax.swing.JTextField Edit3;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JScrollPane ScrollPanel;
    private javax.swing.JTable Table1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
