
package javaapplication1;

public class quest34 extends javax.swing.JPanel {

    public quest34() {
        initComponents();
        p34_bg.add(p34_button_aOption);
        p34_bg.add(p34_button_bOption);
        p34_bg.add(p34_button_cOption);
        p34_bg.add(p34_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p34_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p34_button_aOption = new javax.swing.JRadioButton();
        p34_button_bOption = new javax.swing.JRadioButton();
        p34_button_cOption = new javax.swing.JRadioButton();
        p34_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("34.- En una intersección no regulada (sin señalización) tiene preferencia de paso:");

        p34_button_aOption.setText("a) El vehículo que ingresó primero a la intersección.");

        p34_button_bOption.setText("b) El vehículo que haga sonar la bocina primero.");

        p34_button_cOption.setText("c) El vehículo que haga cambio de luces primero.");

        p34_button_dOption.setText("d) Cualquier vehículo.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p34_button_aOption)
                            .addComponent(p34_button_bOption)
                            .addComponent(p34_button_cOption)
                            .addComponent(p34_button_dOption))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p34_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p34_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p34_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p34_button_dOption)
                .addContainerGap(237, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p34_bg;
    private javax.swing.JRadioButton p34_button_aOption;
    private javax.swing.JRadioButton p34_button_bOption;
    private javax.swing.JRadioButton p34_button_cOption;
    private javax.swing.JRadioButton p34_button_dOption;
    // End of variables declaration//GEN-END:variables
}
