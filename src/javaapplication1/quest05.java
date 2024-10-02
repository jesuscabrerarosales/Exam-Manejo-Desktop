
package javaapplication1;

public class quest05 extends javax.swing.JPanel {

    public quest05() {
        initComponents();
        p5_bg.add(p5_button_aOption);
        p5_bg.add(p5_button_bOption);
        p5_bg.add(p5_button_cOption);
        p5_bg.add(p5_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p5_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p5_button_aOption = new javax.swing.JRadioButton();
        p5_button_bOption = new javax.swing.JRadioButton();
        p5_button_cOption = new javax.swing.JRadioButton();
        p5_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("5.- El color ámbar o amarillo del semáforo signifi ca que:");

        p5_button_aOption.setText("a) Los vehículos deben avanzar.");

        p5_button_bOption.setText("b) Los vehículos deben detenerse.");
        p5_button_bOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5_button_bOptionActionPerformed(evt);
            }
        });

        p5_button_cOption.setText("c) Los vehículos deben acelerar la marcha.");

        p5_button_dOption.setText("d) Los vehículos deben detenerse antes de ingresar a la intersección si su velocidad y ubicación lo permiten; de lo  contrario, deberán cruzar y despejar la intersección.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p5_button_aOption)
                    .addComponent(p5_button_bOption)
                    .addComponent(p5_button_cOption)
                    .addComponent(p5_button_dOption))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(p5_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p5_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p5_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p5_button_dOption)
                .addContainerGap(163, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p5_button_bOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5_button_bOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p5_button_bOptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p5_bg;
    private javax.swing.JRadioButton p5_button_aOption;
    private javax.swing.JRadioButton p5_button_bOption;
    private javax.swing.JRadioButton p5_button_cOption;
    private javax.swing.JRadioButton p5_button_dOption;
    // End of variables declaration//GEN-END:variables
}
