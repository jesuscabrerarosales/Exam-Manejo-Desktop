/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author user
 */
public class quest18 extends javax.swing.JPanel {

    /**
     * Creates new form quest18
     */
    public quest18() {
        initComponents();
        p18_bg.add(p18_button_aOption);
        p18_bg.add(p18_button_bOption);
        p18_bg.add(p18_button_cOption);
        p18_bg.add(p18_button_dOption);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p18_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p18_button_aOption = new javax.swing.JRadioButton();
        p18_button_bOption = new javax.swing.JRadioButton();
        p18_button_cOption = new javax.swing.JRadioButton();
        p18_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("18.- Se le impondrá el pago de una multa y no podrá obtener la licencia de conducir por 3 años a la persona  que:");

        p18_button_aOption.setText("a) Conduzca un vehículo automotor sin tener licencia de conducir.");

        p18_button_bOption.setText("b) Conduzca un vehículo que no cuente con el equipamiento para brindar una máxima comodidad a sus ocupantes.");

        p18_button_cOption.setText("c) Conduzca un vehículo sin contar con el SOAT.");

        p18_button_dOption.setText("d) a y c son correctas");

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
                            .addComponent(p18_button_aOption)
                            .addComponent(p18_button_bOption)
                            .addComponent(p18_button_cOption)
                            .addComponent(p18_button_dOption))
                        .addGap(0, 174, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(p18_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p18_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p18_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p18_button_dOption)
                .addContainerGap(173, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p18_bg;
    private javax.swing.JRadioButton p18_button_aOption;
    private javax.swing.JRadioButton p18_button_bOption;
    private javax.swing.JRadioButton p18_button_cOption;
    private javax.swing.JRadioButton p18_button_dOption;
    // End of variables declaration//GEN-END:variables
}
