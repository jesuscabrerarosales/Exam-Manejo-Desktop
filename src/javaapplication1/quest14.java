
package javaapplication1;

public class quest14 extends javax.swing.JPanel {

    public quest14() {
        initComponents();
        p14_bg.add(p14_button_aOption);
        p14_bg.add(p14_button_bOption);
        p14_bg.add(p14_button_cOption);
        p14_bg.add(p14_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p14_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p14_button_aOption = new javax.swing.JRadioButton();
        p14_button_bOption = new javax.swing.JRadioButton();
        p14_button_cOption = new javax.swing.JRadioButton();
        p14_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("14.- Respecto a los cruces a nivel con vías férreas, señale la afi rmación correcta:");

        p14_button_aOption.setText("a) Los vehículos que transitan por la vía férrea tienen preferencia de paso sobre los que transitan por la vía que la  cruza.");

        p14_button_bOption.setText("b) Los vehículos que transitan por la vía que cruza la línea férrea tienen preferencia de paso sobre los que transitan  por la vía férrea.");
        p14_button_bOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p14_button_bOptionActionPerformed(evt);
            }
        });

        p14_button_cOption.setText("c) El vehículo que llegue primero tiene preferencia.");

        p14_button_dOption.setText("d) Tiene preferencia el conductor que viene por la derecha del otro.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p14_button_aOption)
                            .addComponent(p14_button_bOption)
                            .addComponent(p14_button_cOption)
                            .addComponent(p14_button_dOption))
                        .addGap(0, 113, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p14_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p14_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p14_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p14_button_dOption)
                .addContainerGap(202, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p14_button_bOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p14_button_bOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p14_button_bOptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p14_bg;
    private javax.swing.JRadioButton p14_button_aOption;
    private javax.swing.JRadioButton p14_button_bOption;
    private javax.swing.JRadioButton p14_button_cOption;
    private javax.swing.JRadioButton p14_button_dOption;
    // End of variables declaration//GEN-END:variables
}
