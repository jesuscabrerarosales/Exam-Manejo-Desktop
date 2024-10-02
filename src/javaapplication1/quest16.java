
package javaapplication1;

public class quest16 extends javax.swing.JPanel {

    public quest16() {
        initComponents();
        p16_bg.add(p16_button_aOption);
        p16_bg.add(p16_button_bOption);
        p16_bg.add(p16_button_cOption);
        p16_bg.add(p16_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p16_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p16_button_aOption = new javax.swing.JRadioButton();
        p16_button_bOption = new javax.swing.JRadioButton();
        p16_button_cOption = new javax.swing.JRadioButton();
        p16_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("16.- Está prohibido estacionar un vehículo:");

        p16_button_aOption.setText("a) En las curvas.");

        p16_button_bOption.setText("b) Dentro de una intersección.");

        p16_button_cOption.setText("c) Frente a la entrada de garajes y de recintos militares o policiales.");
        p16_button_cOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p16_button_cOptionActionPerformed(evt);
            }
        });

        p16_button_dOption.setText("d) Todas las alternativas son correctas.");

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
                            .addComponent(p16_button_aOption)
                            .addComponent(p16_button_bOption)
                            .addComponent(p16_button_cOption)
                            .addComponent(p16_button_dOption))
                        .addGap(0, 515, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(p16_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p16_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p16_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p16_button_dOption)
                .addContainerGap(176, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p16_button_cOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p16_button_cOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p16_button_cOptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p16_bg;
    private javax.swing.JRadioButton p16_button_aOption;
    private javax.swing.JRadioButton p16_button_bOption;
    private javax.swing.JRadioButton p16_button_cOption;
    private javax.swing.JRadioButton p16_button_dOption;
    // End of variables declaration//GEN-END:variables
}
