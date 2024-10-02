
package javaapplication1;

public class quest28 extends javax.swing.JPanel {

    public quest28() {
        initComponents();
        p28_bg.add(p28_button_aOption);
        p28_bg.add(p28_button_bOption);
        p28_bg.add(p28_button_cOption);
        p28_bg.add(p28_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p28_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        p28_button_aOption = new javax.swing.JRadioButton();
        p28_button_bOption = new javax.swing.JRadioButton();
        p28_button_cOption = new javax.swing.JRadioButton();
        p28_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("28.-  En intersecciones que no tienen señales de Pare, Ceda el Paso o Semáforo, ¿las vías de doble sentido  tienen prioridad de paso respecto a las vías ");

        jLabel2.setText("de un solo sentido de igual clasificación?");

        p28_button_aOption.setText("a) No.");

        p28_button_bOption.setText("b) Sí.");

        p28_button_cOption.setText("c)  Depende de la intersección.");

        p28_button_dOption.setText("d)  No se encuentra regulado en el reglamento.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 24, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p28_button_aOption)
                            .addComponent(p28_button_bOption)
                            .addComponent(p28_button_cOption)
                            .addComponent(p28_button_dOption))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(64, 64, 64)
                .addComponent(p28_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p28_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p28_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p28_button_dOption)
                .addContainerGap(193, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.ButtonGroup p28_bg;
    private javax.swing.JRadioButton p28_button_aOption;
    private javax.swing.JRadioButton p28_button_bOption;
    private javax.swing.JRadioButton p28_button_cOption;
    private javax.swing.JRadioButton p28_button_dOption;
    // End of variables declaration//GEN-END:variables
}
