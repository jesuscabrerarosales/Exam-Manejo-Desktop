
package javaapplication1;

public class quest06 extends javax.swing.JPanel {

    public quest06() {
        initComponents();
        p6_bg.add(p6_button_aOption);
        p6_bg.add(p6_button_bOption);
        p6_bg.add(p6_button_cOption);
        p6_bg.add(p6_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p6_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p6_button_aOption = new javax.swing.JRadioButton();
        p6_button_bOption = new javax.swing.JRadioButton();
        p6_button_cOption = new javax.swing.JRadioButton();
        p6_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("6.- Los colores del semáforo tienen el siguiente significado: rojo:_____; ámbar o amarillo: _____; verde:___.");

        p6_button_aOption.setText("a) Detención - prevención - paso.");

        p6_button_bOption.setText("b) Detención - paso con prevención - circulación rápida.");

        p6_button_cOption.setText("c) Disminución de la velocidad - prevención - paso rápido.");

        p6_button_dOption.setText("d) Ninguna de las alternativas es correcta.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p6_button_aOption)
                            .addComponent(p6_button_bOption)
                            .addComponent(p6_button_cOption)
                            .addComponent(p6_button_dOption))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p6_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p6_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p6_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p6_button_dOption)
                .addContainerGap(195, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p6_bg;
    private javax.swing.JRadioButton p6_button_aOption;
    private javax.swing.JRadioButton p6_button_bOption;
    private javax.swing.JRadioButton p6_button_cOption;
    private javax.swing.JRadioButton p6_button_dOption;
    // End of variables declaration//GEN-END:variables
}
