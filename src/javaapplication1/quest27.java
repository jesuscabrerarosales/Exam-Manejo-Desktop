
package javaapplication1;

public class quest27 extends javax.swing.JPanel {

    public quest27() {
        initComponents();
        p27_bg.add(p27_button_aOption);
        p27_bg.add(p27_button_bOption);
        p27_bg.add(p27_button_cOption);
        p27_bg.add(p27_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p27_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p27_button_aOption = new javax.swing.JRadioButton();
        p27_button_bOption = new javax.swing.JRadioButton();
        p27_button_cOption = new javax.swing.JRadioButton();
        p27_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("27.- ¿En la conducción vehicular, existe excepción a la obligación de conservar la distancia obligatoria entre  vehículos?");

        p27_button_aOption.setText("a) Si existe, y es para los cortejos fúnebres, convoyes militares y policiales y caravanas autorizadas.");
        p27_button_aOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p27_button_aOptionActionPerformed(evt);
            }
        });

        p27_button_bOption.setText("b) No existe ninguna excepción.");

        p27_button_cOption.setText("c) Si existe, y es para el caso de congestión vehicular.");

        p27_button_dOption.setText("d) La norma no regula la obligación de conservar una distancia obligatoria entre vehículos.");

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
                            .addComponent(p27_button_aOption)
                            .addComponent(p27_button_bOption)
                            .addComponent(p27_button_cOption)
                            .addComponent(p27_button_dOption))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p27_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p27_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p27_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p27_button_dOption)
                .addContainerGap(221, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p27_button_aOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p27_button_aOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p27_button_aOptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p27_bg;
    private javax.swing.JRadioButton p27_button_aOption;
    private javax.swing.JRadioButton p27_button_bOption;
    private javax.swing.JRadioButton p27_button_cOption;
    private javax.swing.JRadioButton p27_button_dOption;
    // End of variables declaration//GEN-END:variables
}
