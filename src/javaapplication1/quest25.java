
package javaapplication1;

public class quest25 extends javax.swing.JPanel {

    public quest25() {
        initComponents();
        p25_bg.add(p25_button_aOption);
        p25_bg.add(p25_button_bOption);
        p25_bg.add(p25_button_cOption);
        p25_bg.add(p25_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p25_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p25_button_aOption = new javax.swing.JRadioButton();
        p25_button_bOption = new javax.swing.JRadioButton();
        p25_button_cOption = new javax.swing.JRadioButton();
        p25_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("25.- Si por el carril por donde está conduciendo se aproxima a un vehículo de transporte escolar que se  encuentra detenido, recogiendo o dejando escolares ¿Qué debe hacer?");

        p25_button_aOption.setText("a) Detener el vehículo y no continuar la marcha hasta que haya culminado el ascenso o descenso de los escolares.");

        p25_button_bOption.setText("b) Adelantar por el lado izquierdo, pero con precaución.");

        p25_button_cOption.setText("c) Tocar el claxon para alertar que está pasando.");
        p25_button_cOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p25_button_cOptionActionPerformed(evt);
            }
        });

        p25_button_dOption.setText("d) Adelantar muy despacio.");

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
                            .addComponent(p25_button_aOption)
                            .addComponent(p25_button_bOption)
                            .addComponent(p25_button_cOption)
                            .addComponent(p25_button_dOption))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p25_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p25_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p25_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p25_button_dOption)
                .addContainerGap(211, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p25_button_cOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p25_button_cOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p25_button_cOptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p25_bg;
    private javax.swing.JRadioButton p25_button_aOption;
    private javax.swing.JRadioButton p25_button_bOption;
    private javax.swing.JRadioButton p25_button_cOption;
    private javax.swing.JRadioButton p25_button_dOption;
    // End of variables declaration//GEN-END:variables
}
