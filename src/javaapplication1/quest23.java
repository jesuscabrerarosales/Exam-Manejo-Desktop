
package javaapplication1;

public class quest23 extends javax.swing.JPanel {

    public quest23() {
        initComponents();
        p23_bg.add(p23_button_aOption);
        p23_bg.add(p23_button_bOption);
        p23_bg.add(p23_button_cOption);
        p23_bg.add(p23_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p23_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p23_button_aOption = new javax.swing.JRadioButton();
        p23_button_bOption = new javax.swing.JRadioButton();
        p23_button_cOption = new javax.swing.JRadioButton();
        p23_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("23.- ¿Cuál de los siguientes seguros es exigible para conducir un vehículo automotor?");

        p23_button_aOption.setText("a) Cualquier tipo de seguro de accidentes personales que comercialicen las empresas de seguro.");

        p23_button_bOption.setText("b) Cualquier tipo de seguro vehicular, siempre que cubra a los ocupantes del vehículo y terceros afectados por un  accidente de tránsito.");

        p23_button_cOption.setText("c) El Seguro Obligatorio de Accidentes de Tránsito - SOAT.");
        p23_button_cOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p23_button_cOptionActionPerformed(evt);
            }
        });

        p23_button_dOption.setText("d) No es obligatorio contar con un seguro.");

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
                            .addComponent(p23_button_aOption)
                            .addComponent(p23_button_bOption)
                            .addComponent(p23_button_cOption)
                            .addComponent(p23_button_dOption))
                        .addGap(0, 104, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p23_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p23_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p23_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p23_button_dOption)
                .addContainerGap(207, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p23_button_cOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p23_button_cOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p23_button_cOptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p23_bg;
    private javax.swing.JRadioButton p23_button_aOption;
    private javax.swing.JRadioButton p23_button_bOption;
    private javax.swing.JRadioButton p23_button_cOption;
    private javax.swing.JRadioButton p23_button_dOption;
    // End of variables declaration//GEN-END:variables
}
