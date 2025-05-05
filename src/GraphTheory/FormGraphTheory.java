package GraphTheory;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Point;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.awt.event.MouseEvent;
import java.util.StringJoiner;
import javax.swing.SwingUtilities;

/**
 * @author Abdalkader_Manaa
 *
 */
public class FormGraphTheory extends javax.swing.JFrame {

    private static ImageBackgroundPanel imageLogo = null;

    int indexNode = 0;
    static int arrNebgers[][] = new int[0][0];
    ArrayList<Node> node = new ArrayList<>();
    ArrayList<Edge> edge = new ArrayList<>();

    public FormGraphTheory() {

        initComponents();
        String coloredText = "<html>"
                + "<font color='rgb(66,72,116)'>G</font>raph "
                + "<font color='rgb(66,72,116)'>T</font>heory"
                + "</html>";

        lblGragh.setText(coloredText);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        pnlButtons = new javax.swing.JPanel();
        btnDeleteEdge = new javax.swing.JButton();
        btnDeleteNode = new javax.swing.JButton();
        btnSettings = new javax.swing.JButton();
        btnCheck = new javax.swing.JButton();
        btnDispalyArrays = new javax.swing.JButton();
        btnPrufer = new javax.swing.JButton();
        btnBFS = new javax.swing.JButton();
        btnDFS = new javax.swing.JButton();
        btnHavelHakimi = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        lblGragh = new javax.swing.JLabel();
        pnlFooter = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GraphTheory");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlMain.setBackground(new java.awt.Color(244, 238, 255));
        pnlMain.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        pnlMain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlMain.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlMainMouseMoved(evt);
            }
        });
        pnlMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlMainMouseClicked(evt);
            }
        });

        pnlHeader.setBackground(new java.awt.Color(166, 177, 225));

        pnlButtons.setBackground(new java.awt.Color(166, 177, 225));
        pnlButtons.setPreferredSize(new java.awt.Dimension(724, 87));

        btnDeleteEdge.setBackground(new java.awt.Color(66, 72, 116));
        btnDeleteEdge.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnDeleteEdge.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteEdge.setText("Delete Edge");
        btnDeleteEdge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 214, 247), 3));
        btnDeleteEdge.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteEdge.setFocusable(false);
        btnDeleteEdge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEdgeActionPerformed(evt);
            }
        });

        btnDeleteNode.setBackground(new java.awt.Color(66, 72, 116));
        btnDeleteNode.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnDeleteNode.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteNode.setText("Delete Node");
        btnDeleteNode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 214, 247), 3));
        btnDeleteNode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteNode.setFocusable(false);
        btnDeleteNode.setHideActionText(true);
        btnDeleteNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteNodeActionPerformed(evt);
            }
        });

        btnSettings.setBackground(new java.awt.Color(66, 72, 116));
        btnSettings.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnSettings.setForeground(new java.awt.Color(255, 255, 255));
        btnSettings.setText("Settings");
        btnSettings.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 214, 247), 3));
        btnSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSettings.setFocusable(false);
        btnSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingsActionPerformed(evt);
            }
        });

        btnCheck.setBackground(new java.awt.Color(66, 72, 116));
        btnCheck.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnCheck.setForeground(new java.awt.Color(255, 255, 255));
        btnCheck.setText("Check");
        btnCheck.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 214, 247), 3));
        btnCheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCheck.setFocusable(false);
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        btnDispalyArrays.setBackground(new java.awt.Color(66, 72, 116));
        btnDispalyArrays.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnDispalyArrays.setForeground(new java.awt.Color(255, 255, 255));
        btnDispalyArrays.setText("Dispaly Arrays");
        btnDispalyArrays.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 214, 247), 3));
        btnDispalyArrays.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDispalyArrays.setFocusable(false);
        btnDispalyArrays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDispalyArraysActionPerformed(evt);
            }
        });

        btnPrufer.setBackground(new java.awt.Color(66, 72, 116));
        btnPrufer.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnPrufer.setForeground(new java.awt.Color(255, 255, 255));
        btnPrufer.setText("Prüfer-Code");
        btnPrufer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 214, 247), 3));
        btnPrufer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrufer.setFocusable(false);
        btnPrufer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPruferActionPerformed(evt);
            }
        });

        btnBFS.setBackground(new java.awt.Color(66, 72, 116));
        btnBFS.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnBFS.setForeground(new java.awt.Color(255, 255, 255));
        btnBFS.setText("BFS");
        btnBFS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 214, 247), 3));
        btnBFS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBFS.setFocusable(false);
        btnBFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBFSActionPerformed(evt);
            }
        });

        btnDFS.setBackground(new java.awt.Color(66, 72, 116));
        btnDFS.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnDFS.setForeground(new java.awt.Color(255, 255, 255));
        btnDFS.setText("DFS");
        btnDFS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 214, 247), 3));
        btnDFS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDFS.setFocusable(false);
        btnDFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDFSActionPerformed(evt);
            }
        });

        btnHavelHakimi.setBackground(new java.awt.Color(66, 72, 116));
        btnHavelHakimi.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnHavelHakimi.setForeground(new java.awt.Color(255, 255, 255));
        btnHavelHakimi.setText("Havel-Hakimi");
        btnHavelHakimi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 214, 247), 3));
        btnHavelHakimi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHavelHakimi.setFocusable(false);
        btnHavelHakimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHavelHakimiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlButtonsLayout = new javax.swing.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, pnlButtonsLayout.createSequentialGroup()
                        .addComponent(btnDeleteNode, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnDeleteEdge, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnDispalyArrays, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlButtonsLayout.createSequentialGroup()
                        .addComponent(btnHavelHakimi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDFS, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBFS, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrufer, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnDeleteNode, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteEdge, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDispalyArrays, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDFS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnHavelHakimi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBFS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrufer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        label1.setAlignment(java.awt.Label.RIGHT);
        label1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("كلية الهندسة المعلوماتيـة");

        label2.setAlignment(java.awt.Label.RIGHT);
        label2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("الســــــــنـــة الــثــالــثـــة");

        label3.setAlignment(java.awt.Label.RIGHT);
        label3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("جــــــــــامــعـــة إدلـــــــب");

        lblGragh.setBackground(new java.awt.Color(166, 177, 225));
        lblGragh.setFont(new java.awt.Font("Segoe Script", 1, 28)); // NOI18N
        lblGragh.setForeground(new java.awt.Color(102, 102, 255));
        lblGragh.setText("Graph Theory");

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblGragh)
                .addGap(37, 37, 37)
                .addComponent(pnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlHeaderLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlButtons, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblGragh))))
        );

        pnlFooter.setBackground(new java.awt.Color(166, 177, 225));

        btnClear.setBackground(new java.awt.Color(66, 72, 116));
        btnClear.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("clear");
        btnClear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(220, 214, 247), 3, true));
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.setFocusable(false);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFooterLayout = new javax.swing.GroupLayout(pnlFooter);
        pnlFooter.setLayout(pnlFooterLayout);
        pnlFooterLayout.setHorizontalGroup(
            pnlFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFooterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlFooterLayout.setVerticalGroup(
            pnlFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 563, Short.MAX_VALUE)
                .addComponent(pnlFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        if (imageLogo != null) {
            pnlMain.remove(imageLogo);
            imageLogo = new ImageBackgroundPanel("/images/logo.png", 0.05f);
            imageLogo.setBounds(350, 150, getWidth() - 700, getHeight() - 250);
            pnlMain.add(imageLogo);
        }
        pnlButtons.setLocation((this.getWidth() / 2) - (pnlButtons.getWidth() / 2) - 7, pnlButtons.getLocation().y);
    }//GEN-LAST:event_formComponentResized

    private void btnDeleteEdgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEdgeActionPerformed

        boolean isEdgeDeleted = false;

        for (int i = edge.size() - 1; i >= 0; i--) {
            Edge e = edge.get(i);
            if (e.isSelected) {
                updateAdjacencyMatrix(e, i);
                isEdgeDeleted = true;
            }
        }

        pnlMain.repaint();

        if (isEdgeDeleted) {
            Tools.messageBox("Deleted Successfully!");
        } else {
            Tools.messageBox("Please select at least Two Nodes!");
        }


    }//GEN-LAST:event_btnDeleteEdgeActionPerformed

    private void btnDeleteNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteNodeActionPerformed

        boolean isNodeDeleted = false;
        for (int i = node.size() - 1; i >= 0; i--) {

            int n = node.get(i).indexNode;

            if (node.get(i).isSelected) {

                arrNebgers[n - 1][n - 1] = -1;

                for (int j = edge.size() - 1; j >= 0; j--) {

                    Edge e = edge.get(j);

                    if (e.node1.indexNode == n || e.node2.indexNode == n) {
                        updateAdjacencyMatrix(e, j);

                    }
                }

                pnlMain.remove(node.get(i));
                node.remove(i);
                isNodeDeleted = true;
            }
        }

        if (isNodeDeleted) {
            pnlMain.repaint();
            Tools.messageBox("Deleted Successfully!");
        } else {
            Tools.messageBox("Please select at least One Node!");
        }

    }//GEN-LAST:event_btnDeleteNodeActionPerformed

    private void updateAdjacencyMatrix(Edge e, int edgeIndex) {
        pnlMain.remove(e);
        edge.remove(edgeIndex);
        arrNebgers[e.node1.indexNode - 1][e.node2.indexNode - 1] = 0;
        arrNebgers[e.node2.indexNode - 1][e.node1.indexNode - 1] = 0;
    }

    private void btnHavelHakimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHavelHakimiActionPerformed

        FormHavelHakimi frame = new FormHavelHakimi();
        frame.setVisible(true);

        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                Point[] point = null;
                if (FormHavelHakimi.arrHavel.length != 0) {
                    switch (FormHavelHakimi.drawHavel) {
                        case "Square" ->
                            point = Tools.getSquarePoint(FormHavelHakimi.arrHavel.length, 20, 130, (getWidth() * 3) / FormHavelHakimi.arrHavel.length, 200);
                        case "Circle" ->
                            point = Tools.getCirclePoint(FormHavelHakimi.arrHavel.length, 220, getWidth() / 2, getWidth() / 4 + 20);
                        case "Random1" ->
                            point = Tools.getRandomPoint(FormHavelHakimi.arrHavel.length, 20, 950, 130, 520);
                        case "Random2" ->
                            point = Tools.getRandomPointBySpace(FormHavelHakimi.arrHavel.length, 20, 950, 130, 520, 30, 15);
                    }
                }
                if (point != null) {
                    HavelHakimi(point, FormHavelHakimi.arrHavel);
                }
            }
        });


    }//GEN-LAST:event_btnHavelHakimiActionPerformed

    private void btnDFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDFSActionPerformed
        int start = Tools.returnSelectedNode(node);
        if (start == -1) {
            return;
        }
        EventQueue.invokeLater(() -> {
            new TraceBack(Tools.DFS(arrNebgers, start)).setVisible(true);
        });
    }//GEN-LAST:event_btnDFSActionPerformed

    private void btnBFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBFSActionPerformed
        int start = Tools.returnSelectedNode(node);
        if (start == -1) {
            return;
        }
        SwingUtilities.invokeLater(() -> {
            new TraceBack(Tools.BFS(arrNebgers, start)).setVisible(true);
        });
    }//GEN-LAST:event_btnBFSActionPerformed

    private void pnlMainMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMainMouseMoved

        Tools.drawTextOnPanel(pnlFooter, "X : " + evt.getX() + "  ,  Y : " + (evt.getY() - 110));

    }//GEN-LAST:event_pnlMainMouseMoved

    private void pnlMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMainMouseClicked

        if (evt.getButton() == MouseEvent.BUTTON1) {
            if (Tools.isInsideBounds(evt.getX(), evt.getY(), 20, getWidth() - 40, 130, getHeight() - 100)) {
                int missingIndex = Tools.findMissingIndex(node);
                Node n1 = new Node(evt.getX(), evt.getY(), missingIndex);
                n1.setLocation(evt.getX() - 20, evt.getY() - 20);

                try {

                    arrNebgers[missingIndex - 1][missingIndex - 1] = 0;
                } catch (Exception e) {
                }
                if (missingIndex > arrNebgers.length) {

                    arrNebgers = Tools.addColumnByZero(arrNebgers);
                }

                pnlMain.add(n1);
                node.add(n1);
                deselectAll();
                pnlMain.repaint();

            }

        } else if (evt.getButton() == MouseEvent.BUTTON3) {
            List<Node> selectedNodes = new ArrayList<>();

            for (Node n : node) {
                if (n.isSelected) {
                    selectedNodes.add(n);
                }
            }
            node.forEach(Node::unSelected);

            if (selectedNodes.size() >= 2) {
                for (int i = 0; i < selectedNodes.size(); i++) {
                    for (int j = i + 1; j < selectedNodes.size(); j++) {

                        Node n1 = selectedNodes.get(i);
                        Node n2 = selectedNodes.get(j);
                        Edge e = new Edge(n1, n2);
                        arrNebgers[n1.indexNode - 1][n2.indexNode - 1] = 1;
                        arrNebgers[n2.indexNode - 1][n1.indexNode - 1] = 1;
                        e.setLocation(Math.min(n1.getX(), n2.getX()),
                                Math.min(n1.getY(), n2.getY()));

                        pnlMain.add(e);
                        edge.add(e);
                        deselectAll();
                        pnlMain.repaint();
                    }
                }

            } else {
                Tools.messageBox("Please select at least Two Nodes!");
            }

        }
    }//GEN-LAST:event_pnlMainMouseClicked

    private void deselectAll() {
        edge.forEach(Edge::unSelected);
        node.forEach(Node::unSelected);
    }
    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        if (Tools.countCurrentNode(arrNebgers) > 0) {
            EventQueue.invokeLater(() -> {
                new FormCheck().setVisible(true);
            });
        } else {
            Tools.messageBox("No graph available!");

        }

    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingsActionPerformed

        EventQueue.invokeLater(() -> {
            new FormSettings().setVisible(true);
        });
    }//GEN-LAST:event_btnSettingsActionPerformed


    private void btnPruferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPruferActionPerformed

        if (Tools.countCurrentNode(arrNebgers) > 2) {
            int[] x = Tools.PruferSequence(arrNebgers);

            if (x.length > 0) {
                StringJoiner joiner = new StringJoiner(" , ", "[ ", " ]");
                for (int a : x) {
                    joiner.add(String.valueOf(a));
                }
                Tools.messageBox("Prüfer: " + joiner.toString());
            }
        } else {
            Tools.messageBox("Prüfer coding not applicable!");
        }

    }//GEN-LAST:event_btnPruferActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        ImageBackgroundPanel imageGragh = new ImageBackgroundPanel("/images/gragh.png", 1);
        imageGragh.setBounds(20, 0, 210, 80);
        pnlHeader.add(imageGragh);

        imageLogo = new ImageBackgroundPanel("/images/logo.png", 0.05f);
        imageLogo.setBounds(350, 150, getWidth() - 700, getHeight() - 250);
        pnlMain.add(imageLogo);

        pnlMain.repaint();
    }//GEN-LAST:event_formWindowOpened

    private void btnDispalyArraysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDispalyArraysActionPerformed

        if (Tools.countCurrentNode(arrNebgers) > 0) {
            int size = arrNebgers.length;
            String[][] extendedMatrix = new String[size + 1][size + 1];

            extendedMatrix[0][0] = "N";
            for (int i = 1; i <= size; i++) {
                extendedMatrix[0][i] = "N" + i;
                extendedMatrix[i][0] = "N" + i;
            }

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    extendedMatrix[i + 1][j + 1] = arrNebgers[i][j] + "";
                }
            }

            EventQueue.invokeLater(() -> {
                new MatrixTableWindow(extendedMatrix).setVisible(true);
            });

        } else {
            Tools.messageBox("No graph available!");
        }


    }//GEN-LAST:event_btnDispalyArraysActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        for (Component c : pnlMain.getComponents()) {
            if (c instanceof Node || c instanceof Edge) {
                pnlMain.remove(c);

            }

        }
        node.clear();
        edge.clear();
        arrNebgers = new int[0][0];
        pnlMain.repaint();


    }//GEN-LAST:event_btnClearActionPerformed

    private void HavelHakimi(Point[] arrPoint, int[] graphicSequence) {

        boolean isOK = false;

        int tempArr[] = Arrays.copyOf(graphicSequence, graphicSequence.length);

        if (Tools.containsValueGreaterLen(graphicSequence) || !Tools.isCountElementsOddIsEven(graphicSequence)) {
            Tools.messageBox("No graph available!");
            return;
        }

        while (true) {

            if (Tools.isContainsNegativeElement(graphicSequence)) {
                Tools.messageBox("No graph available!");
                return;
            }

            if (Tools.isAllElementsByZero(graphicSequence)) {
                Tools.messageBox("There is a Graph Available!");

                isOK = true;
                break;
            }

            Tools.mergeSort(graphicSequence);
            Tools.decrementArrElementsByOne(graphicSequence, graphicSequence[0]);
            graphicSequence[0] = 0;
        }

        if (isOK) {

            indexNode = Tools.clearForm(pnlMain, node, edge);
            Tools.mergeSort(tempArr);
            arrNebgers = Tools.createNebgersArray(tempArr);
            Tools.addNodes(pnlMain, node, edge, indexNode, arrPoint);
            Tools.addEdges(pnlMain, node, edge, arrNebgers);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new FormGraphTheory().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBFS;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDFS;
    private javax.swing.JButton btnDeleteEdge;
    private javax.swing.JButton btnDeleteNode;
    private javax.swing.JButton btnDispalyArrays;
    private javax.swing.JButton btnHavelHakimi;
    private javax.swing.JButton btnPrufer;
    private javax.swing.JButton btnSettings;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private javax.swing.JLabel lblGragh;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMain;
    // End of variables declaration//GEN-END:variables
}
