
package javaapplication1;


public class quest11 extends javax.swing.JPanel {

    public quest11() {
        initComponents();
        
        p11_bg.add(p11_button_aOption);
        p11_bg.add(p11_button_bOption);
        p11_bg.add(p11_button_cOption);
        p11_bg.add(p11_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p11_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p11_button_aOption = new javax.swing.JRadioButton();
        p11_button_bOption = new javax.swing.JRadioButton();
        p11_button_cOption = new javax.swing.JRadioButton();
        p11_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("11.-  ¿La luz intermitente roja es igual que una señal de PARE?");

        p11_button_aOption.setText(" a) Verdad.");
        p11_button_aOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p11_button_aOptionActionPerformed(evt);
            }
        });

        p11_button_bOption.setText("b)  Es verdad siempre y cuando también se encuentre un Policía de Tránsito indicando la señal de Pare.");

        p11_button_cOption.setText("c) Falso.");

        p11_button_dOption.setText("d)  Ninguna de las alternativas es correcta.");

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
                            .addComponent(p11_button_aOption)
                            .addComponent(p11_button_bOption)
                            .addComponent(p11_button_cOption)
                            .addComponent(p11_button_dOption))
                        .addGap(0, 258, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p11_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p11_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p11_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p11_button_dOption)
                .addContainerGap(207, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p11_button_aOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p11_button_aOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p11_button_aOptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p11_bg;
    private javax.swing.JRadioButton p11_button_aOption;
    private javax.swing.JRadioButton p11_button_bOption;
    private javax.swing.JRadioButton p11_button_cOption;
    private javax.swing.JRadioButton p11_button_dOption;
    // End of variables declaration//GEN-END:variables
}
