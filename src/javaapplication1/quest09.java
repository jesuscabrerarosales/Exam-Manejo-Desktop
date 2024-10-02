
package javaapplication1;

public class quest09 extends javax.swing.JPanel {

    public quest09() {
        initComponents();
        
        p9_bg.add(p9_button_aOption);
        p9_bg.add(p9_button_bOption);
        p9_bg.add(p9_button_cOption);
        p9_bg.add(p9_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p9_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        p9_button_aOption = new javax.swing.JRadioButton();
        p9_button_bOption = new javax.swing.JRadioButton();
        p9_button_cOption = new javax.swing.JRadioButton();
        p9_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("9.-  Martes 3 de marzo de 2020 /  El Peruano  Si llega a una intersección y visualiza el semáforo con una flecha roja hacia");

        jLabel2.setText("la izquierda y la luz circular  verde prendidas al mismo tiempo, la acción correcta es:");

        p9_button_aOption.setText("a) Avanzar en cualquier sentido, ya que la luz circular está en verde.");
        p9_button_aOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p9_button_aOptionActionPerformed(evt);
            }
        });

        p9_button_bOption.setText("b) Avanzar, pero el giro a la izquierda está prohibido por la fl echa roja.");

        p9_button_cOption.setText("c) Avanzar únicamente hacia la izquierda, pues continuar de frente está prohibido.");

        p9_button_dOption.setText("d) Ninguna de las alternativas es correcta.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p9_button_aOption))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p9_button_bOption))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p9_button_cOption))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p9_button_dOption)))
                .addGap(0, 75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addComponent(p9_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p9_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p9_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p9_button_dOption)
                .addContainerGap(166, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p9_button_aOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p9_button_aOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p9_button_aOptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.ButtonGroup p9_bg;
    private javax.swing.JRadioButton p9_button_aOption;
    private javax.swing.JRadioButton p9_button_bOption;
    private javax.swing.JRadioButton p9_button_cOption;
    private javax.swing.JRadioButton p9_button_dOption;
    // End of variables declaration//GEN-END:variables
}
