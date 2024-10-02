
package javaapplication1;

import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;


public class quest29 extends javax.swing.JPanel {

    public quest29() {
        initComponents();
        p29_bg.add(p29_button_aOption);
        p29_bg.add(p29_button_bOption);
        p29_bg.add(p29_button_cOption);
        p29_bg.add(p29_button_dOption);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p29_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        p29_button_aOption = new javax.swing.JRadioButton();
        p29_button_bOption = new javax.swing.JRadioButton();
        p29_button_cOption = new javax.swing.JRadioButton();
        p29_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("29.- Si usted se aproxima a una señal de PARE colocada verticalmente o pintada en la vía, la acción correcta  es:");

        p29_button_aOption.setText("a) Disminuir su velocidad y cederle el paso a los vehículos que circulan por la transversal.");

        p29_button_bOption.setText("b) Disminuir su velocidad y pasar con cuidado.");

        p29_button_cOption.setText("c) Sobre parar y pasar rápidamente.");

        p29_button_dOption.setText("d) Parar por completo, ceder el paso a los usuarios que tengan preferencia y luego continuar con precaución.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p29_button_dOption)
                    .addComponent(p29_button_cOption)
                    .addComponent(p29_button_bOption)
                    .addComponent(p29_button_aOption))
                .addGap(0, 218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(p29_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p29_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p29_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p29_button_dOption)
                .addContainerGap(225, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup p29_bg;
    private javax.swing.JRadioButton p29_button_aOption;
    private javax.swing.JRadioButton p29_button_bOption;
    private javax.swing.JRadioButton p29_button_cOption;
    private javax.swing.JRadioButton p29_button_dOption;
    // End of variables declaration//GEN-END:variables
}
