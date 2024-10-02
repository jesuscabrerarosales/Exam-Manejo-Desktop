
package javaapplication1;

public class quest21 extends javax.swing.JPanel {

    public quest21() {
        initComponents();
        p21_bg.add(p21_button_aOption);
        p21_bg.add(p21_button_bOption);
        p21_bg.add(p21_button_cOption);
        p21_bg.add(p21_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p21_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p21_button_aOption = new javax.swing.JRadioButton();
        p21_button_bOption = new javax.swing.JRadioButton();
        p21_button_cOption = new javax.swing.JRadioButton();
        p21_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("21.- En la circulación vehicular, es correcto afi rmar que:");

        p21_button_aOption.setText("a) Los vehículos deben circular sobre líneas continuas delimitadoras de carriles, ante la congestion vehicular.");

        p21_button_bOption.setText("b) Los vehículos pueden circular sobre líneas continuas delimitadoras de carriles, ante la congestion vehicular.");

        p21_button_cOption.setText("c) Los vehículos deben circular dentro de las líneas de carril, salvo cuando se realicen las maniobras que indica el  Reglamento Nacional de Tránsito.");

        p21_button_dOption.setText("d) Ninguna de las alternativas es correcta.");

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
                            .addComponent(p21_button_aOption)
                            .addComponent(p21_button_bOption)
                            .addComponent(p21_button_cOption)
                            .addComponent(p21_button_dOption))
                        .addGap(0, 30, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(p21_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p21_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p21_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p21_button_dOption)
                .addContainerGap(208, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p21_bg;
    private javax.swing.JRadioButton p21_button_aOption;
    private javax.swing.JRadioButton p21_button_bOption;
    private javax.swing.JRadioButton p21_button_cOption;
    private javax.swing.JRadioButton p21_button_dOption;
    // End of variables declaration//GEN-END:variables
}
