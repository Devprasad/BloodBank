/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * records.java
 *
 * Created on Jan 4, 2014, 4:49:00 AM
 */
package forms;

import net.proteanit.sql.DbUtils;

/**
 *
 * @author Administrator
 */
public class FindDonorForm extends javax.swing.JFrame {

    /**
     * Creates new form records
     */
    public FindDonorForm() {
        initComponents();
        setLocation(200, 130);
        initiateComponent();
    }

    public void initiateComponent() {
        BusinessLogic.GetAllDonorInfo info = new BusinessLogic.GetAllDonorInfo();
        info.getTableFilled();
        //tableDonorname=info.getInfotable();
        tableDonorname.setModel(DbUtils.resultSetToTableModel(info.getRs()));
        tCity.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableDonorname = new javax.swing.JTable();
        lHeading = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        comboBlood = new javax.swing.JComboBox();
        comboStateSelection = new javax.swing.JComboBox();
        tCity = new javax.swing.JTextField();
        tBloodGroup = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tState = new javax.swing.JLabel();
        bGetinfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Blood Management-Find Donors");
        setResizable(false);

        tableDonorname.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        tableDonorname.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Donor name", "Address", "Phone No."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDonorname.setCellSelectionEnabled(true);
        tableDonorname.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tableDonorname);
        tableDonorname.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        lHeading.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        lHeading.setText("Donor Info");

        comboBlood.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        comboBlood.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "A+", "A-", "AB+", "AB-", "O+", "O-", "B+", "B-" }));
        comboBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBloodActionPerformed(evt);
            }
        });

        comboStateSelection.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        comboStateSelection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Karnataka", "Kerala", "Tamil Nadu", "Maharashtra" }));

        tCity.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N

        tBloodGroup.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        tBloodGroup.setText("Blood Group");

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel4.setText("City");

        tState.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        tState.setText("State");

        bGetinfo.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        bGetinfo.setText("Search");
        bGetinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGetinfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(tState))
                                .addGap(52, 52, 52))
                            .addComponent(tBloodGroup, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tCity)
                            .addComponent(comboStateSelection, javax.swing.GroupLayout.Alignment.TRAILING, 0, 1, Short.MAX_VALUE)
                            .addComponent(comboBlood, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 68, Short.MAX_VALUE)
                        .addComponent(bGetinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboStateSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tState))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBlood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tBloodGroup))
                .addGap(18, 18, 18)
                .addComponent(bGetinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lHeading)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lHeading)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBloodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBloodActionPerformed

    private void bGetinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGetinfoActionPerformed
//        JOptionPane.showConfirmDialog(this, "not done");
    }//GEN-LAST:event_bGetinfoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FindDonorForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bGetinfo;
    private javax.swing.JComboBox comboBlood;
    private javax.swing.JComboBox comboStateSelection;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lHeading;
    private javax.swing.JLabel tBloodGroup;
    private javax.swing.JTextField tCity;
    private javax.swing.JLabel tState;
    private javax.swing.JTable tableDonorname;
    // End of variables declaration//GEN-END:variables
}