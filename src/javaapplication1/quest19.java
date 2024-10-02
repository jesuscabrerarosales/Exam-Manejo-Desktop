
package javaapplication1;

public class quest19 extends javax.swing.JPanel {

    public quest19() {
        initComponents();
        p19_bg.add(p19_button_aOption);
        p19_bg.add(p19_button_bOption);
        p19_bg.add(p19_button_cOption);
        p19_bg.add(p19_button_dOption);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p19_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p19_button_aOption = new javax.swing.JRadioButton();
        p19_button_bOption = new javax.swing.JRadioButton();
        p19_button_cOption = new javax.swing.JRadioButton();
        p19_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("19.- En el supuesto que se encuentre manejando y un vehículo que tiene la intención de sobrepasarlo o  adelantarlo lo alcance, ¿qué debería hacer usted?");

        p19_button_aOption.setText("a) Debe aumentar la velocidad para no dejar que el otro vehículo lo pase.");
        p19_button_aOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p19_button_aOptionActionPerformed(evt);
            }
        });

        p19_button_bOption.setText("b) No debe aumentar la velocidad hasta que el vehículo lo sobrepase.");

        p19_button_cOption.setText("c) Debe disminuir drásticamente la velocidad de su vehículo.");

        p19_button_dOption.setText("d) Debe detener su vehículo.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p19_button_aOption)
                            .addComponent(p19_button_bOption)
                            .addComponent(p19_button_cOption)
                            .addComponent(p19_button_dOption))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p19_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p19_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p19_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p19_button_dOption)
                .addContainerGap(224, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p19_button_aOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p19_button_aOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p19_button_aOptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p19_bg;
    private javax.swing.JRadioButton p19_button_aOption;
    private javax.swing.JRadioButton p19_button_bOption;
    private javax.swing.JRadioButton p19_button_cOption;
    private javax.swing.JRadioButton p19_button_dOption;
    // End of variables declaration//GEN-END:variables
}
