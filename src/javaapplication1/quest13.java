
package javaapplication1;

public class quest13 extends javax.swing.JPanel {

    public quest13() {
        initComponents();
        p13_bg.add(p13_button_aOption);
        p13_bg.add(p13_button_bOption);
        p13_bg.add(p13_button_cOption);
        p13_bg.add(p13_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p13_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p13_button_aOption = new javax.swing.JRadioButton();
        p13_button_bOption = new javax.swing.JRadioButton();
        p13_button_cOption = new javax.swing.JRadioButton();
        p13_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("13.- Al cambiar de carril en una vía de un solo sentido con múltiples carriles, ¿cuál es la conducta correcta?");

        p13_button_aOption.setText("a) Se deben encender las luces direccionales primero, buscar una brecha y realizar el cambio de carril con  precaución.");

        p13_button_bOption.setText("b) Se debe encontrar una brecha, luego cambiar de carril con precaución; no es necesario el uso de luces  direccionales para cambios de carril.");

        p13_button_cOption.setText("c) Se debe advertir utilizando el claxon, identifi car una brecha y realizar el cambio de carril con precaución.");

        p13_button_dOption.setText("e) Está prohibido el cambio de carril en vías de un solo sentido.");
        p13_button_dOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p13_button_dOptionActionPerformed(evt);
            }
        });

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
                            .addComponent(p13_button_aOption)
                            .addComponent(p13_button_bOption)
                            .addComponent(p13_button_cOption)
                            .addComponent(p13_button_dOption))
                        .addGap(0, 68, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p13_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p13_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p13_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p13_button_dOption)
                .addContainerGap(170, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p13_button_dOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p13_button_dOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p13_button_dOptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p13_bg;
    private javax.swing.JRadioButton p13_button_aOption;
    private javax.swing.JRadioButton p13_button_bOption;
    private javax.swing.JRadioButton p13_button_cOption;
    private javax.swing.JRadioButton p13_button_dOption;
    // End of variables declaration//GEN-END:variables
}
