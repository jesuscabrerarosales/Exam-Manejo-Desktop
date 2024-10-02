
package javaapplication1;


public class quest38 extends javax.swing.JPanel {

    public quest38() {
        initComponents();
        p38_bg.add(p38_button_aOption);
        p38_bg.add(p38_button_bOption);
        p38_bg.add(p38_button_cOption);
        p38_bg.add(p38_button_dOption);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p38_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p38_button_aOption = new javax.swing.JRadioButton();
        p38_button_bOption = new javax.swing.JRadioButton();
        p38_button_cOption = new javax.swing.JRadioButton();
        p38_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("38.- Son documentos que deben portarse obligatoriamente, durante la conducción del vehículo, y exhibirse  cuando la autoridad competente lo solicite:");

        p38_button_aOption.setText("a)  Documento de identidad, SOAT vigente (puede ser virtual) y tarjeta de identifi cación vehicular.");

        p38_button_bOption.setText("b) Certificado de Inspección Técnica Vehicular y contrato de compraventa del vehículo.");
        p38_button_bOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p38_button_bOptionActionPerformed(evt);
            }
        });

        p38_button_cOption.setText("c)  Contrato de compraventa del vehículo.");

        p38_button_dOption.setText("d)  Todas las alternativas son correctas.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p38_button_aOption)
                            .addComponent(p38_button_bOption)
                            .addComponent(p38_button_cOption)
                            .addComponent(p38_button_dOption))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(p38_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p38_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p38_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p38_button_dOption)
                .addContainerGap(234, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p38_button_bOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p38_button_bOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p38_button_bOptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p38_bg;
    private javax.swing.JRadioButton p38_button_aOption;
    private javax.swing.JRadioButton p38_button_bOption;
    private javax.swing.JRadioButton p38_button_cOption;
    private javax.swing.JRadioButton p38_button_dOption;
    // End of variables declaration//GEN-END:variables
}
