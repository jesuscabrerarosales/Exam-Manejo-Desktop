
package javaapplication1;

public class quest07 extends javax.swing.JPanel {

    public quest07() {
        initComponents();
        p7_bg.add(p7_button_aOption);
        p7_bg.add(p7_button_bOption);
        p7_bg.add(p7_button_cOption);
        p7_bg.add(p7_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p7_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p7_button_aOption = new javax.swing.JRadioButton();
        p7_button_bOption = new javax.swing.JRadioButton();
        p7_button_cOption = new javax.swing.JRadioButton();
        p7_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("7.- ¿Qué indica una fl echa verde en un semáforo vehicular?");

        p7_button_aOption.setText("a) Se puede continuar con precaución únicamente en la dirección de la fl echa y desde el carril que esta flecha  controla.");

        p7_button_bOption.setText("b) No está permitida la circulación en el sentido que indica la flecha.");

        p7_button_cOption.setText("c) Se debe respetar únicamente la luz circular.");

        p7_button_dOption.setText("d) Ninguna de las alternativas es correcta.");

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
                            .addComponent(p7_button_aOption)
                            .addComponent(p7_button_bOption)
                            .addComponent(p7_button_cOption)
                            .addComponent(p7_button_dOption))
                        .addGap(0, 90, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p7_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p7_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p7_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p7_button_dOption)
                .addContainerGap(154, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p7_bg;
    private javax.swing.JRadioButton p7_button_aOption;
    private javax.swing.JRadioButton p7_button_bOption;
    private javax.swing.JRadioButton p7_button_cOption;
    private javax.swing.JRadioButton p7_button_dOption;
    // End of variables declaration//GEN-END:variables
}
