
package javaapplication1;

public class quest20 extends javax.swing.JPanel {

    public quest20() {
        initComponents();
        p20_bg.add(p20_button_aOption);
        p20_bg.add(p20_button_bOption);
        p20_bg.add(p20_button_cOption);
        p20_bg.add(p20_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p20_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p20_button_aOption = new javax.swing.JRadioButton();
        p20_button_bOption = new javax.swing.JRadioButton();
        p20_button_cOption = new javax.swing.JRadioButton();
        p20_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("20.- ¿Cuál de las siguientes afi rmaciones es correcta?");

        p20_button_aOption.setText("a) El conductor debe respetar los límites máximos y mínimos de velocidad establecidos.");

        p20_button_bOption.setText("b) El conductor debe respetar únicamente los límites máximos de velocidad, pues no existen límites mínimos.");

        p20_button_cOption.setText("c) El conductor puede conducir a la velocidad que desee, siempre que lo haga de manera prudente.");
        p20_button_cOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p20_button_cOptionActionPerformed(evt);
            }
        });

        p20_button_dOption.setText("d) Ninguna de las alternativas es correcta.");

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
                            .addComponent(p20_button_aOption)
                            .addComponent(p20_button_bOption)
                            .addComponent(p20_button_cOption)
                            .addComponent(p20_button_dOption))
                        .addGap(0, 265, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p20_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p20_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p20_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p20_button_dOption)
                .addContainerGap(254, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p20_button_cOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p20_button_cOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p20_button_cOptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p20_bg;
    private javax.swing.JRadioButton p20_button_aOption;
    private javax.swing.JRadioButton p20_button_bOption;
    private javax.swing.JRadioButton p20_button_cOption;
    private javax.swing.JRadioButton p20_button_dOption;
    // End of variables declaration//GEN-END:variables
}
