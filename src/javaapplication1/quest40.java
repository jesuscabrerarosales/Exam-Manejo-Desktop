/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author user
 */
public class quest40 extends javax.swing.JPanel {

    /**
     * Creates new form quest40
     */
    public quest40() {
        initComponents();
        p40_bg.add(p40_button_aOption);
        p40_bg.add(p40_button_bOption);
        p40_bg.add(p40_button_cOption);
        p40_bg.add(p40_button_dOption);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p40_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p40_button_aOption = new javax.swing.JRadioButton();
        p40_button_bOption = new javax.swing.JRadioButton();
        p40_button_cOption = new javax.swing.JRadioButton();
        p40_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("40.- Al cambiar de dirección, un conductor debe:");

        p40_button_aOption.setText("a) Señalizar toda la maniobra hasta su culminación.");

        p40_button_bOption.setText("b) Cambiar de dirección y luego señalizar.");

        p40_button_cOption.setText("c) No existe ninguna obligación.");

        p40_button_dOption.setText("d) Ninguna de las alternativas es correcta.");

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
                            .addComponent(p40_button_aOption)
                            .addComponent(p40_button_bOption)
                            .addComponent(p40_button_cOption)
                            .addComponent(p40_button_dOption))
                        .addGap(0, 557, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(p40_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p40_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p40_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p40_button_dOption)
                .addContainerGap(211, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p40_bg;
    private javax.swing.JRadioButton p40_button_aOption;
    private javax.swing.JRadioButton p40_button_bOption;
    private javax.swing.JRadioButton p40_button_cOption;
    private javax.swing.JRadioButton p40_button_dOption;
    // End of variables declaration//GEN-END:variables
}