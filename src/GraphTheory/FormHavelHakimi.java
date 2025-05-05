package GraphTheory;

import java.awt.Color;
import javax.swing.JFrame;

/**
 * @author Abdalkader_Manaa
 *
 */
public class FormHavelHakimi extends JFrame {

    static String drawHavel = "Square";
    static int[] arrHavel = new int[0];

    public FormHavelHakimi() {
        initComponents();

        String placeholder = "ex: 2,2,2,2";

        txtHavelHakiki.setText(placeholder);

        txtHavelHakiki.setForeground(Color.GRAY);

        txtHavelHakiki.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtHavelHakiki.getText().equals(placeholder)) {
                    txtHavelHakiki.setText("");
                    txtHavelHakiki.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (txtHavelHakiki.getText().isEmpty()) {
                    txtHavelHakiki.setText(placeholder);
                    txtHavelHakiki.setForeground(Color.GRAY);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        pnlMain = new javax.swing.JPanel();
        rdoSquare = new javax.swing.JRadioButton();
        rdoRandom1 = new javax.swing.JRadioButton();
        rdoRandom2 = new javax.swing.JRadioButton();
        rdoCircle = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtHavelHakiki = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Havel-Hakimi");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        pnlMain.setBackground(new java.awt.Color(153, 153, 255));
        pnlMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255), 3));

        rdoSquare.setBackground(new java.awt.Color(153, 153, 255));
        btnGroup.add(rdoSquare);
        rdoSquare.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rdoSquare.setForeground(new java.awt.Color(51, 51, 51));
        rdoSquare.setSelected(true);
        rdoSquare.setText("Square");

        rdoRandom1.setBackground(new java.awt.Color(153, 153, 255));
        btnGroup.add(rdoRandom1);
        rdoRandom1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rdoRandom1.setForeground(new java.awt.Color(51, 51, 51));
        rdoRandom1.setText("Random 1");
        rdoRandom1.setFocusable(false);

        rdoRandom2.setBackground(new java.awt.Color(153, 153, 255));
        btnGroup.add(rdoRandom2);
        rdoRandom2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rdoRandom2.setForeground(new java.awt.Color(51, 51, 51));
        rdoRandom2.setText("Random 2");
        rdoRandom2.setFocusable(false);

        rdoCircle.setBackground(new java.awt.Color(153, 153, 255));
        btnGroup.add(rdoCircle);
        rdoCircle.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rdoCircle.setForeground(new java.awt.Color(51, 51, 51));
        rdoCircle.setText("Circle");
        rdoCircle.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Havel-Hakimi");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Choose the graph shape:");

        txtHavelHakiki.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        txtHavelHakiki.setForeground(new java.awt.Color(102, 102, 102));
        txtHavelHakiki.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHavelHakiki.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255), 3));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter the Havel-Hakimi Arrays:");

        btnCancel.setBackground(new java.awt.Color(102, 102, 255));
        btnCancel.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255), 3));
        btnCancel.setFocusable(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnOk.setBackground(new java.awt.Color(102, 102, 255));
        btnOk.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        btnOk.setForeground(new java.awt.Color(255, 255, 255));
        btnOk.setText("OK");
        btnOk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255), 3));
        btnOk.setFocusable(false);
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdoSquare)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoCircle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoRandom1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoRandom2)
                .addGap(53, 53, 53))
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(txtHavelHakiki, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rdoRandom2)
                    .addComponent(rdoRandom1)
                    .addComponent(rdoCircle)
                    .addComponent(rdoSquare))
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtHavelHakiki, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnOk))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, 463, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        arrHavel = new int[0];
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        try {
            if (!txtHavelHakiki.getText().equals("ex: 2,2,2,2")) {
                if (rdoSquare.isSelected()) {
                    drawHavel = "Square";
                } else if (rdoCircle.isSelected()) {
                    drawHavel = "Circle";
                } else if (rdoRandom1.isSelected()) {
                    drawHavel = "Random1";
                } else {
                    drawHavel = "Random2";
                }

                arrHavel = Tools.convertStringToArray(txtHavelHakiki.getText());
                dispose();
            }
        } catch (Exception e) {
            Tools.messageBox("Invalid input. Please check your entry.");

        }
    }//GEN-LAST:event_btnOkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JRadioButton rdoCircle;
    private javax.swing.JRadioButton rdoRandom1;
    private javax.swing.JRadioButton rdoRandom2;
    private javax.swing.JRadioButton rdoSquare;
    private javax.swing.JTextField txtHavelHakiki;
    // End of variables declaration//GEN-END:variables
}
