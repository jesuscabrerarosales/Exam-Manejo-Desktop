
package javaapplication1;

public class quest01 extends javax.swing.JPanel {

    
    public quest01() {
        initComponents();
        p1_bg.add(p1_button_aOption);
        p1_bg.add(p1_button_bOption);
        p1_bg.add(p1_button_cOption);
        p1_bg.add(p1_button_dOption);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1_bg = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        p1_button_aOption = new javax.swing.JRadioButton();
        p1_button_bOption = new javax.swing.JRadioButton();
        p1_button_cOption = new javax.swing.JRadioButton();
        p1_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("1.- Respecto de los dispositivos de control o regulación del tránsito:");

        p1_button_aOption.setText("a) Solo los peatones están obligados a su obediencia.");
        p1_button_aOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1_button_aOptionActionPerformed(evt);
            }
        });

        p1_button_bOption.setText("b) Los conductores y los peatones están obligados a su obediencia, salvo instrucción de la Policía Nacional del Perú  asignada al tránsito que indique lo contrario. ");
        p1_button_bOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1_button_bOptionActionPerformed(evt);
            }
        });

        p1_button_cOption.setText("c) Solo los conductores están obligados a su obediencia.");

        p1_button_dOption.setText("d) Los conductores están obligados a su obediencia, aun cuando la Policía Nacional del Perú asignada al tránsito  pueda indicar lo contrario.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p1_button_aOption))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p1_button_bOption))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p1_button_cOption))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p1_button_dOption)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(p1_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p1_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p1_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p1_button_dOption)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p1_button_aOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1_button_aOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1_button_aOptionActionPerformed

    private void p1_button_bOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1_button_bOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1_button_bOptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.ButtonGroup p1_bg;
    private javax.swing.JRadioButton p1_button_aOption;
    private javax.swing.JRadioButton p1_button_bOption;
    private javax.swing.JRadioButton p1_button_cOption;
    private javax.swing.JRadioButton p1_button_dOption;
    // End of variables declaration//GEN-END:variables
}
