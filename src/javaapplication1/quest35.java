
package javaapplication1;

public class quest35 extends javax.swing.JPanel {

    public quest35() {
        initComponents();
        p35_bg.add(p35_button_aOption);
        p35_bg.add(p35_button_bOption);
        p35_bg.add(p35_button_cOption);
        p35_bg.add(p35_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p35_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p35_button_aOption = new javax.swing.JRadioButton();
        p35_button_bOption = new javax.swing.JRadioButton();
        p35_button_cOption = new javax.swing.JRadioButton();
        p35_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("35.- En una rotonda, tiene prioridad de paso el vehículo que:");

        p35_button_aOption.setText("a) Quiere ingresar a la rotonda.");

        p35_button_bOption.setText("b) Circula por ella.");

        p35_button_cOption.setText("c) Acelera primero.");

        p35_button_dOption.setText("d)  Hace sonar la bocina.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p35_button_aOption)
                            .addComponent(p35_button_bOption)
                            .addComponent(p35_button_cOption)
                            .addComponent(p35_button_dOption))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(p35_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p35_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p35_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p35_button_dOption)
                .addContainerGap(236, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p35_bg;
    private javax.swing.JRadioButton p35_button_aOption;
    private javax.swing.JRadioButton p35_button_bOption;
    private javax.swing.JRadioButton p35_button_cOption;
    private javax.swing.JRadioButton p35_button_dOption;
    // End of variables declaration//GEN-END:variables
}
