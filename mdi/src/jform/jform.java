/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jform;

import javax.swing.JOptionPane;

/**
 *
 * @author L420
 */
public class jform extends javax.swing.JInternalFrame {

    /**
     * Creates new form jform
     */
    public jform() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cat1 = new javax.swing.JRadioButton();
        IDItem = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        Category = new javax.swing.JTextField();
        cat2 = new javax.swing.JRadioButton();
        Quantity = new javax.swing.JTextField();
        categ = new javax.swing.JComboBox();
        Unit = new javax.swing.JRadioButton();
        Sparepart = new javax.swing.JRadioButton();
        int1 = new javax.swing.JRadioButton();
        Lokas = new javax.swing.JTextField();
        int2 = new javax.swing.JRadioButton();
        lok = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        Harga = new javax.swing.JTextField();
        SUBMIT = new javax.swing.JButton();

        setTitle("::FORM::");

        jLabel1.setText("FORM");

        jLabel2.setText("IDItem");

        jLabel3.setText("Nama");

        jLabel4.setText("Kate...");

        jLabel5.setText("Quantity");

        jLabel6.setText("Type");

        jLabel7.setText("Lokasi");

        cat1.setText("Input New Category");
        cat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cat1ActionPerformed(evt);
            }
        });

        cat2.setText("Use Existing Category");
        cat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cat2ActionPerformed(evt);
            }
        });

        categ.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kungfu", "Silat", "Renang", "Panah", "Terbang" }));
        categ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categActionPerformed(evt);
            }
        });

        Unit.setText("Unit");
        Unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnitActionPerformed(evt);
            }
        });

        Sparepart.setText("Sparepart");
        Sparepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SparepartActionPerformed(evt);
            }
        });

        int1.setText("Input New Lokasi");
        int1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int1ActionPerformed(evt);
            }
        });

        int2.setText("Use Existing Lokasi");
        int2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int2ActionPerformed(evt);
            }
        });

        lok.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jakarta", "Bandung", "Surabaya", "Sumatera" }));
        lok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lokActionPerformed(evt);
            }
        });

        jLabel8.setText("Harga");

        SUBMIT.setText("SUBMIT");
        SUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBMITActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IDItem, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(Nama)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cat1)
                            .addComponent(cat2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(categ, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(int1)
                                    .addComponent(int2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lok, 0, 191, Short.MAX_VALUE)
                                            .addComponent(Lokas)
                                            .addComponent(SUBMIT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Unit)
                                        .addGap(18, 18, 18)
                                        .addComponent(Sparepart)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Harga)))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(IDItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(cat1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cat2)
                .addGap(7, 7, 7)
                .addComponent(categ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(Harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Unit)
                    .addComponent(Sparepart))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(int1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lokas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(int2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(SUBMIT)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void categActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categActionPerformed

    private void SUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBMITActionPerformed
        // TODO add your handling code here:
        String ID = IDItem.getText();
        String NAMA = Nama.getText();
        String QUANTITY = Quantity.getText();
        String HARGA = Harga.getText();
        
        String Jen="";
        if (Unit.isSelected()){
             Jen = Unit.getText();
        }else{
             Jen = Sparepart.getText();
        }
        String Jon="";
        if (cat1.isSelected()){
             Jon = Category.getText();
        }if (cat2.isSelected()){
             Jon = categ.getSelectedItem() + "";
        }
        String Jan="";
        if (int1.isSelected()){
             Jan = Lokas.getText();
        }if (int2.isSelected()){
             Jan = lok.getSelectedItem() + "";
        }        


        JOptionPane.showMessageDialog(this,"HASIL\nIDItem: "+ID+"\nNama: "+NAMA+"\nKate..: "+Jon+"\nQuantity: "+QUANTITY+"\nHarga: "+HARGA+"\nType: "+Jen+"\nLokasi: "+Jan);
    }//GEN-LAST:event_SUBMITActionPerformed

    private void cat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cat1ActionPerformed
        // TODO add your handling code here:
        if (cat1.isSelected())
            cat2.setSelected(false);
            categ.setEnabled(false);
            Category.setEnabled(true);
    }//GEN-LAST:event_cat1ActionPerformed

    private void cat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cat2ActionPerformed
        // TODO add your handling code here:
        if (cat2.isSelected())
            cat1.setSelected(false);
            Category.setEnabled(false);
            categ.setEnabled(true);
    }//GEN-LAST:event_cat2ActionPerformed

    private void lokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lokActionPerformed

    private void int1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_int1ActionPerformed
        // TODO add your handling code here:
        if (int1.isSelected())
            int2.setSelected(false);
            lok.setEnabled(false);
            Lokas.setEnabled(true);
    }//GEN-LAST:event_int1ActionPerformed

    private void int2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_int2ActionPerformed
        // TODO add your handling code here:
        if (int2.isSelected())
            int1.setSelected(false);
            Lokas.setEnabled(false);
            lok.setEnabled(true);       
    }//GEN-LAST:event_int2ActionPerformed

    private void UnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnitActionPerformed
        // TODO add your handling code here:
        if (Unit.isSelected())
            Sparepart.setSelected(false);        
    }//GEN-LAST:event_UnitActionPerformed

    private void SparepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SparepartActionPerformed
        // TODO add your handling code here:
        if (Sparepart.isSelected())
            Unit.setSelected(false);           
    }//GEN-LAST:event_SparepartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Category;
    private javax.swing.JTextField Harga;
    private javax.swing.JTextField IDItem;
    private javax.swing.JTextField Lokas;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Quantity;
    private javax.swing.JButton SUBMIT;
    private javax.swing.JRadioButton Sparepart;
    private javax.swing.JRadioButton Unit;
    private javax.swing.JRadioButton cat1;
    private javax.swing.JRadioButton cat2;
    private javax.swing.JComboBox categ;
    private javax.swing.JRadioButton int1;
    private javax.swing.JRadioButton int2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox lok;
    // End of variables declaration//GEN-END:variables
}
