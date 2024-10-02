
package javaapplication1;

public class quest22 extends javax.swing.JPanel {

    public quest22() {
        initComponents();
        p22_bg.add(p22_button_aOption);
        p22_bg.add(p22_button_bOption);
        p22_bg.add(p22_button_cOption);
        p22_bg.add(p22_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p22_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p22_button_aOption = new javax.swing.JRadioButton();
        p22_button_bOption = new javax.swing.JRadioButton();
        p22_button_cOption = new javax.swing.JRadioButton();
        p22_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("22.- En caso de accidentes, el SOAT cubre los daños que sufren:");

        p22_button_aOption.setText("a) Solo los ocupantes del vehículo.");

        p22_button_bOption.setText("b) Los ocupantes y terceros no ocupantes del vehículo.");

        p22_button_cOption.setText("c) Solo terceros afectados.");
        p22_button_cOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p22_button_cOptionActionPerformed(evt);
            }
        });

        p22_button_dOption.setText("d) Solo el conductor del vehículo.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p22_button_aOption)
                            .addComponent(p22_button_bOption)
                            .addComponent(p22_button_cOption)
                            .addComponent(p22_button_dOption))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p22_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p22_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p22_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p22_button_dOption)
                .addContainerGap(209, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p22_button_cOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p22_button_cOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p22_button_cOptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p22_bg;
    private javax.swing.JRadioButton p22_button_aOption;
    private javax.swing.JRadioButton p22_button_bOption;
    private javax.swing.JRadioButton p22_button_cOption;
    private javax.swing.JRadioButton p22_button_dOption;
    // End of variables declaration//GEN-END:variables
}
