package GraphTheory;

import java.awt.Color;
import javax.swing.JColorChooser;

/**
 * @author Abdalkader_Manaa
 *
 */
public class FormSettings extends javax.swing.JFrame {

    public FormSettings() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combColorNode = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        combColorEdge = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        combColorSelectNode = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        combColorSelectEdge = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        combColorNodeNumber = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        combColorSelectNodeNumber = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Settings");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255), 3));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 50)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Settings");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("● Node Color:");

        combColorNode.setBackground(new java.awt.Color(204, 204, 255));
        combColorNode.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        combColorNode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Specific Color" }));
        combColorNode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255), 3));
        combColorNode.setFocusable(false);
        combColorNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combColorNodeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("● Edge Color: ");

        combColorEdge.setBackground(new java.awt.Color(204, 204, 255));
        combColorEdge.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        combColorEdge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Specific Color" }));
        combColorEdge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255), 3));
        combColorEdge.setFocusable(false);
        combColorEdge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combColorEdgeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("● Selected Node Color: ");

        combColorSelectNode.setBackground(new java.awt.Color(204, 204, 255));
        combColorSelectNode.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        combColorSelectNode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Specific Color" }));
        combColorSelectNode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255), 3));
        combColorSelectNode.setFocusable(false);
        combColorSelectNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combColorSelectNodeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("● Selected Edge Color: ");

        combColorSelectEdge.setBackground(new java.awt.Color(204, 204, 255));
        combColorSelectEdge.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        combColorSelectEdge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Specific Color" }));
        combColorSelectEdge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255), 3));
        combColorSelectEdge.setFocusable(false);
        combColorSelectEdge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combColorSelectEdgeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("● Nodes Number Color: ");

        combColorNodeNumber.setBackground(new java.awt.Color(204, 204, 255));
        combColorNodeNumber.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        combColorNodeNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Specific Color" }));
        combColorNodeNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255), 3));
        combColorNodeNumber.setFocusable(false);
        combColorNodeNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combColorNodeNumberActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("● Selected Node Number Color: ");

        combColorSelectNodeNumber.setBackground(new java.awt.Color(204, 204, 255));
        combColorSelectNodeNumber.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        combColorSelectNodeNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Specific Color" }));
        combColorSelectNodeNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255), 3));
        combColorSelectNodeNumber.setFocusable(false);
        combColorSelectNodeNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combColorSelectNodeNumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(combColorNode, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(combColorSelectNode, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(combColorEdge, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(combColorNodeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(combColorSelectNodeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(combColorSelectEdge, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combColorNodeNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combColorNode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combColorSelectNodeNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combColorSelectNode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combColorSelectEdge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combColorEdge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void combColorNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combColorNodeActionPerformed

        Node.changeColor = combColorNode.getSelectedIndex() == 0 ? null : JColorChooser.showDialog(this, "Change Color", Color.pink);
    }//GEN-LAST:event_combColorNodeActionPerformed

    private void combColorSelectNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combColorSelectNodeActionPerformed
        Node.selectedColorNode = combColorSelectNode.getSelectedIndex() == 0 ? null : JColorChooser.showDialog(this, "Change Color", Color.RED);
    }//GEN-LAST:event_combColorSelectNodeActionPerformed

    private void combColorEdgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combColorEdgeActionPerformed

        Edge.changeColor = combColorEdge.getSelectedIndex() == 0 ? null : JColorChooser.showDialog(this, "Change Color", Color.BLACK);


    }//GEN-LAST:event_combColorEdgeActionPerformed

    private void combColorSelectEdgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combColorSelectEdgeActionPerformed

        Edge.selectedColorEdge = combColorSelectEdge.getSelectedIndex() == 0 ? null : JColorChooser.showDialog(this, "Change Color", Color.RED);

    }//GEN-LAST:event_combColorSelectEdgeActionPerformed

    private void combColorNodeNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combColorNodeNumberActionPerformed

        Node.changeColorNumber = combColorNodeNumber.getSelectedIndex() == 0 ? null : JColorChooser.showDialog(this, "Change Color", Color.BLACK);

    }//GEN-LAST:event_combColorNodeNumberActionPerformed

    private void combColorSelectNodeNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combColorSelectNodeNumberActionPerformed

        Node.selectedColorNumber = combColorSelectNodeNumber.getSelectedIndex() == 0 ? null : JColorChooser.showDialog(this, "Change Color", Color.WHITE);

    }//GEN-LAST:event_combColorSelectNodeNumberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combColorEdge;
    private javax.swing.JComboBox<String> combColorNode;
    private javax.swing.JComboBox<String> combColorNodeNumber;
    private javax.swing.JComboBox<String> combColorSelectEdge;
    private javax.swing.JComboBox<String> combColorSelectNode;
    private javax.swing.JComboBox<String> combColorSelectNodeNumber;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
