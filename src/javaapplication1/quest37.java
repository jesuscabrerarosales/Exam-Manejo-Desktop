
package javaapplication1;


public class quest37 extends javax.swing.JPanel {

    public quest37() {
        initComponents();
        p37_bg.add(p37_button_aOption);
        p37_bg.add(p37_button_bOption);
        p37_bg.add(p37_button_cOption);
        p37_bg.add(p37_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p37_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p37_button_aOption = new javax.swing.JRadioButton();
        p37_button_bOption = new javax.swing.JRadioButton();
        p37_button_cOption = new javax.swing.JRadioButton();
        p37_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("37.- Si un conductor está tomando medicamentos y por ello siente sueño ¿qué debe hacer?");

        p37_button_aOption.setText("a) Manejar normalmente.");

        p37_button_bOption.setText("b) Manejar despacio.");

        p37_button_cOption.setText("c)  Abstenerse de manejar.");

        p37_button_dOption.setText("d)  Manejar con un copiloto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p37_button_aOption)
                            .addComponent(p37_button_bOption)
                            .addComponent(p37_button_cOption)
                            .addComponent(p37_button_dOption))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(p37_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p37_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p37_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p37_button_dOption)
                .addContainerGap(200, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p37_bg;
    private javax.swing.JRadioButton p37_button_aOption;
    private javax.swing.JRadioButton p37_button_bOption;
    private javax.swing.JRadioButton p37_button_cOption;
    private javax.swing.JRadioButton p37_button_dOption;
    // End of variables declaration//GEN-END:variables
}
