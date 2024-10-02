
package javaapplication1;


public class quest12 extends javax.swing.JPanel {


    public quest12() {
        initComponents();
        p12_bg.add(p12_button_aOption);
        p12_bg.add(p12_button_bOption);
        p12_bg.add(p12_button_cOption);
        p12_bg.add(p12_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p12_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p12_button_aOption = new javax.swing.JRadioButton();
        p12_button_bOption = new javax.swing.JRadioButton();
        p12_button_cOption = new javax.swing.JRadioButton();
        p12_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("12.- Al aproximarse a una intersección con giro permitido a la izquierda, la conducta correcta es:");

        p12_button_aOption.setText("a) Girar desde cualquier carril.");

        p12_button_bOption.setText("b) Colocarse en el carril derecho, luego girar con precaución.");

        p12_button_cOption.setText("c) Colocarse en el carril más despejado de tráfico, luego girar con precaución.");
        p12_button_cOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p12_button_cOptionActionPerformed(evt);
            }
        });

        p12_button_dOption.setText("d) Hacer la señal de volteo a la izquierda con las luces direccionales, ubicar con antelación el vehículo en el carril de  circulación de la izquierda y girar con precaución.");

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
                            .addComponent(p12_button_aOption)
                            .addComponent(p12_button_bOption)
                            .addComponent(p12_button_cOption)
                            .addComponent(p12_button_dOption))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p12_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p12_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p12_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p12_button_dOption)
                .addContainerGap(174, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p12_button_cOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p12_button_cOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p12_button_cOptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p12_bg;
    private javax.swing.JRadioButton p12_button_aOption;
    private javax.swing.JRadioButton p12_button_bOption;
    private javax.swing.JRadioButton p12_button_cOption;
    private javax.swing.JRadioButton p12_button_dOption;
    // End of variables declaration//GEN-END:variables
}
