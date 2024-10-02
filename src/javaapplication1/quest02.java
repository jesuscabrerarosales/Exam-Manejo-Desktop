
package javaapplication1;

public class quest02 extends javax.swing.JPanel {

    public quest02() {
        initComponents();
        p2_bg.add(p2_button_aOption);
        p2_bg.add(p2_button_bOption);
        p2_bg.add(p2_button_cOption);
        p2_bg.add(p2_button_dOption);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p2_bg = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        p2_button_aOption = new javax.swing.JRadioButton();
        p2_button_bOption = new javax.swing.JRadioButton();
        p2_button_cOption = new javax.swing.JRadioButton();
        p2_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("2.- La señal vertical reglamentaria R-6 “prohibido voltear a la izquierda”, significa que:");

        p2_button_aOption.setText("a) Está prohibido voltear a la izquierda y, por lo tanto también está prohibido el giro en U.");
        p2_button_aOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2_button_aOptionActionPerformed(evt);
            }
        });

        p2_button_bOption.setText("b) Está prohibido voltear a la izquierda, sin embargo, está permitido el giro en U. ");

        p2_button_cOption.setText("c) El único sentido de desplazamiento es continuar de frente.");

        p2_button_dOption.setText("d)  Ninguna de las alternativas es correcta.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(p2_button_aOption)
                    .addComponent(p2_button_bOption)
                    .addComponent(p2_button_cOption)
                    .addComponent(p2_button_dOption))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(p2_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p2_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p2_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p2_button_dOption)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p2_button_aOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2_button_aOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2_button_aOptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.ButtonGroup p2_bg;
    private javax.swing.JRadioButton p2_button_aOption;
    private javax.swing.JRadioButton p2_button_bOption;
    private javax.swing.JRadioButton p2_button_cOption;
    private javax.swing.JRadioButton p2_button_dOption;
    // End of variables declaration//GEN-END:variables
}
