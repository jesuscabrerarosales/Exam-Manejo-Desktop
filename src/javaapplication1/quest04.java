
package javaapplication1;

public class quest04 extends javax.swing.JPanel {

    public quest04() {
        initComponents();
        
        p4_bg.add(p4_button_aOption);
        p4_bg.add(p4_button_bOption);
        p4_bg.add(p4_button_cOption);
        p4_bg.add(p4_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        p4_bg = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        p4_button_aOption = new javax.swing.JRadioButton();
        p4_button_bOption = new javax.swing.JRadioButton();
        p4_button_cOption = new javax.swing.JRadioButton();
        p4_button_dOption = new javax.swing.JRadioButton();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("4.- En las vías, las marcas en el pavimento que son del tipo central discontinua y de color amarillo significan  que:");

        p4_button_aOption.setText("a) Está permitido cruzar al otro carril para el adelantamiento vehicular, si es que es seguro hacerlo.");

        p4_button_bOption.setText("b) No está permitido cruzar al otro carril para el adelantamiento vehicular.");

        p4_button_cOption.setText("c) Se está reduciendo el ancho de la calzada de la vía por donde se circula.");

        p4_button_dOption.setText("d) Se está frente a un lugar de cruce peatonal.");
        p4_button_dOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4_button_dOptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4_button_aOption)
                    .addComponent(p4_button_bOption)
                    .addComponent(p4_button_cOption)
                    .addComponent(p4_button_dOption))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(p4_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p4_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p4_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p4_button_dOption)
                .addContainerGap(170, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p4_button_dOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4_button_dOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p4_button_dOptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.ButtonGroup p4_bg;
    private javax.swing.JRadioButton p4_button_aOption;
    private javax.swing.JRadioButton p4_button_bOption;
    private javax.swing.JRadioButton p4_button_cOption;
    private javax.swing.JRadioButton p4_button_dOption;
    // End of variables declaration//GEN-END:variables
}
