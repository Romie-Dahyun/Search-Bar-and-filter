
package com.mycompany.okay;

import javax.swing.*;
import java.util.*;


public class frame extends javax.swing.JFrame {
    
    DefaultListModel defaultListModel = new DefaultListModel();

    public frame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.bindData();
    }
    
    private ArrayList getStars(){
        ArrayList stars = new ArrayList();
        stars.add("Patty");
        stars.add("Burger");
        stars.add("Tomato");
        stars.add("Onion");
        stars.add("Garlic");
        
        
        return stars;
    }
    
    private void bindData(){
        getStars().stream().forEach((star) ->{
            defaultListModel.addElement(star);
        });
        myJList.setModel(defaultListModel);
        myJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }
    
    private void searchFilter(String searchTerm){
        DefaultListModel filteredItems = new DefaultListModel();
        ArrayList stars = getStars();
        
        stars.stream().forEach((star) ->{
            String starName = star.toString().toLowerCase();
            if(starName.contains(searchTerm.toLowerCase())){
                filteredItems.addElement(star);
            }
        });
        defaultListModel=filteredItems;
        myJList.setModel(defaultListModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        myJList = new javax.swing.JList<>();
        txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 700));

        myJList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        myJList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myJListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(myJList);

        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(399, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(332, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myJListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myJListMouseClicked
        JOptionPane.showMessageDialog(rootPane, myJList.getSelectedValue(), "Selected Star", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_myJListMouseClicked

    private void txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyReleased
        searchFilter(txt.getText());
    }//GEN-LAST:event_txtKeyReleased
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> myJList;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}