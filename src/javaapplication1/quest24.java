
package javaapplication1;

public class quest24 extends javax.swing.JPanel {

    public quest24() {
        initComponents();
        p24_bg.add(p24_button_aOption);
        p24_bg.add(p24_button_bOption);
        p24_bg.add(p24_button_cOption);
        p24_bg.add(p24_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p24_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p24_button_aOption = new javax.swing.JRadioButton();
        p24_button_bOption = new javax.swing.JRadioButton();
        p24_button_cOption = new javax.swing.JRadioButton();
        p24_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("24.- Cuándo es obligatorio darle preferencia de paso a un vehículo de emergencia o vehículo oficial:");

        p24_button_aOption.setText("a) Cuando emita señales visibles.");

        p24_button_bOption.setText("b) Cuando emita señales audibles.");

        p24_button_cOption.setText("c) Cuando emita señales audibles y visibles.");

        p24_button_dOption.setText("d) Ninguna de las alternativas es correcta.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p24_button_aOption)
                            .addComponent(p24_button_bOption)
                            .addComponent(p24_button_cOption)
                            .addComponent(p24_button_dOption))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p24_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p24_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p24_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p24_button_dOption)
                .addContainerGap(217, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p24_bg;
    private javax.swing.JRadioButton p24_button_aOption;
    private javax.swing.JRadioButton p24_button_bOption;
    private javax.swing.JRadioButton p24_button_cOption;
    private javax.swing.JRadioButton p24_button_dOption;
    // End of variables declaration//GEN-END:variables
}
