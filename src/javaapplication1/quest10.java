
package javaapplication1;

public class quest10 extends javax.swing.JPanel {

    public quest10() {
        initComponents();
        p10_bg.add(p10_button_aOption);
        p10_bg.add(p10_button_bOption);
        p10_bg.add(p10_button_cOption);
        p10_bg.add(p10_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p10_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p10_button_aOption = new javax.swing.JRadioButton();
        p10_button_bOption = new javax.swing.JRadioButton();
        p10_button_cOption = new javax.swing.JRadioButton();
        p10_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("10.- Si llega a una intersección donde el semáforo muestra una luz intermitente, qué afi rmación es correcta:");

        p10_button_aOption.setText("a) Si la luz intermitente es roja, ésta es equivalente a un “CEDA EL PASO”.");

        p10_button_bOption.setText("b) Si la luz intermitente es ámbar, tiene preferencia, debiendo reducir la velocidad y continuar con precaución.");

        p10_button_cOption.setText("c) Si la luz intermitente es verde, ésta es equivalente a un “PARE”.");

        p10_button_dOption.setText("d) Ninguna de las alternativas es correcta.");

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
                            .addComponent(p10_button_aOption)
                            .addComponent(p10_button_bOption)
                            .addComponent(p10_button_cOption)
                            .addComponent(p10_button_dOption))
                        .addGap(0, 258, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p10_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p10_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p10_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p10_button_dOption)
                .addContainerGap(206, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p10_bg;
    private javax.swing.JRadioButton p10_button_aOption;
    private javax.swing.JRadioButton p10_button_bOption;
    private javax.swing.JRadioButton p10_button_cOption;
    private javax.swing.JRadioButton p10_button_dOption;
    // End of variables declaration//GEN-END:variables
}
