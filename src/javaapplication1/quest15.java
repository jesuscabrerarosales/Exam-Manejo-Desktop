
package javaapplication1;

public class quest15 extends javax.swing.JPanel {

    public quest15() {
        initComponents();
        
        p15_bg.add(p15_button_aOption);
        p15_bg.add(p15_button_bOption);
        p15_bg.add(p15_button_cOption);
        p15_bg.add(p15_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p15_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p15_button_aOption = new javax.swing.JRadioButton();
        p15_button_bOption = new javax.swing.JRadioButton();
        p15_button_cOption = new javax.swing.JRadioButton();
        p15_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("15.- Ante la señal de color rojo del semáforo y la indicación de continuar la marcha del efectivo de la Policiía  Nacional del Perú asignado al control del tránsito, corresponde:");

        p15_button_aOption.setText("a) Detenerse hasta que cambie a luz verde.");
        p15_button_aOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p15_button_aOptionActionPerformed(evt);
            }
        });

        p15_button_bOption.setText("b) Continuar la marcha.");

        p15_button_cOption.setText("c) Estar prevenido.");

        p15_button_dOption.setText("d) Ninguna de las alternativas es correcta.");

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
                            .addComponent(p15_button_aOption)
                            .addComponent(p15_button_bOption)
                            .addComponent(p15_button_cOption)
                            .addComponent(p15_button_dOption))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(p15_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p15_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p15_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p15_button_dOption)
                .addContainerGap(185, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p15_button_aOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p15_button_aOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p15_button_aOptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p15_bg;
    private javax.swing.JRadioButton p15_button_aOption;
    private javax.swing.JRadioButton p15_button_bOption;
    private javax.swing.JRadioButton p15_button_cOption;
    private javax.swing.JRadioButton p15_button_dOption;
    // End of variables declaration//GEN-END:variables
}
