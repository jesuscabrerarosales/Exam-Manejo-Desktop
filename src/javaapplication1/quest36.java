
package javaapplication1;


public class quest36 extends javax.swing.JPanel {

    public quest36() {
        initComponents();
        p36_bg.add(p36_button_aOption);
        p36_bg.add(p36_button_bOption);
        p36_bg.add(p36_button_cOption);
        p36_bg.add(p36_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p36_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        p36_button_aOption = new javax.swing.JRadioButton();
        p36_button_bOption = new javax.swing.JRadioButton();
        p36_button_cOption = new javax.swing.JRadioButton();
        p36_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("36.- El sobrepaso o adelantamiento de un vehículo en movimiento se efectúa, salvo excepciones, por la  _________ retornando el vehículo después de la ");

        jLabel2.setText("maniobra a su carril original.");

        p36_button_aOption.setText("a) Derecha.");

        p36_button_bOption.setText("b) Izquierda.");

        p36_button_cOption.setText("c) Berma.");

        p36_button_dOption.setText("d) Por la derecha o izquierda.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 22, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p36_button_aOption)
                            .addComponent(p36_button_bOption)
                            .addComponent(p36_button_cOption)
                            .addComponent(p36_button_dOption))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(p36_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p36_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p36_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p36_button_dOption)
                .addContainerGap(234, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.ButtonGroup p36_bg;
    private javax.swing.JRadioButton p36_button_aOption;
    private javax.swing.JRadioButton p36_button_bOption;
    private javax.swing.JRadioButton p36_button_cOption;
    private javax.swing.JRadioButton p36_button_dOption;
    // End of variables declaration//GEN-END:variables
}
