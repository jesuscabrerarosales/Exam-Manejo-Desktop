
package javaapplication1;

public class quest26 extends javax.swing.JPanel {

    public quest26() {
        initComponents();
        p26_bg.add(p26_button_aOption);
        p26_bg.add(p26_button_bOption);
        p26_bg.add(p26_button_cOption);
        p26_bg.add(p26_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p26_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p26_button_aOption = new javax.swing.JRadioButton();
        p26_button_bOption = new javax.swing.JRadioButton();
        p26_button_cOption = new javax.swing.JRadioButton();
        p26_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("26.- ¿Qué signifi ca un triángulo rojo de seguridad colocado en la calzada?");

        p26_button_aOption.setText("a) La presencia de un vehículo inmovilizado en la vía pública por alguna circunstancia.");
        p26_button_aOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p26_button_aOptionActionPerformed(evt);
            }
        });

        p26_button_bOption.setText("b) Zona de obras por reparación en la calzada.");

        p26_button_cOption.setText("c) Que el vehículo que lo enfrenta debe detenerse.");
        p26_button_cOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p26_button_cOptionActionPerformed(evt);
            }
        });

        p26_button_dOption.setText("d) a  y c son correctas.");

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
                            .addComponent(p26_button_aOption)
                            .addComponent(p26_button_bOption)
                            .addComponent(p26_button_cOption)
                            .addComponent(p26_button_dOption))
                        .addGap(0, 364, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p26_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p26_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p26_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p26_button_dOption)
                .addContainerGap(211, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p26_button_aOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p26_button_aOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p26_button_aOptionActionPerformed

    private void p26_button_cOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p26_button_cOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p26_button_cOptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p26_bg;
    private javax.swing.JRadioButton p26_button_aOption;
    private javax.swing.JRadioButton p26_button_bOption;
    private javax.swing.JRadioButton p26_button_cOption;
    private javax.swing.JRadioButton p26_button_dOption;
    // End of variables declaration//GEN-END:variables
}
