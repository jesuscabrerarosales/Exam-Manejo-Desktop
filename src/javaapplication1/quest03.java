
package javaapplication1;

import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

public class quest03 extends javax.swing.JPanel {

    public quest03() {
        initComponents();
        
        p3_bg.add(p3_button_aOption);
        p3_bg.add(p3_button_bOption);
        p3_bg.add(p3_button_cOption);
        p3_bg.add(p3_button_dOption);
        
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                SwingUtilities.invokeLater(() -> setScaledIcon());
            }
        });
    }

    private void setScaledIcon() {
        int width = jlabelQuest03.getWidth();
        int height = jlabelQuest03.getHeight();
        if (width > 0 && height > 0) {
            ImageIcon imgquest3 = new ImageIcon(getClass().getResource("/img/pregunta3.PNG"));
            Icon fndquest3 = new ImageIcon(imgquest3.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
            jlabelQuest03.setIcon(fndquest3);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p3_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jlabelQuest03 = new javax.swing.JLabel();
        p3_button_aOption = new javax.swing.JRadioButton();
        p3_button_bOption = new javax.swing.JRadioButton();
        p3_button_cOption = new javax.swing.JRadioButton();
        p3_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("3.- La señal vertical reglamentaria R-3 significa que:");

        jlabelQuest03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pregunta3.png"))); // NOI18N

        p3_button_aOption.setText("a) Nos acercamos a una zona restringida al tránsito.");

        p3_button_bOption.setText("b) Está permitido adelantar vehículos.");

        p3_button_cOption.setText("c) El único sentido de desplazamiento es continuar de frente.");
        p3_button_cOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3_button_cOptionActionPerformed(evt);
            }
        });

        p3_button_dOption.setText("d) Ninguna de las alternativas es correcta.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p3_button_aOption))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p3_button_bOption))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p3_button_cOption))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p3_button_dOption))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jlabelQuest03)))
                .addContainerGap(377, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlabelQuest03, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p3_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p3_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p3_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p3_button_dOption)
                .addContainerGap(124, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p3_button_cOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3_button_cOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p3_button_cOptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlabelQuest03;
    private javax.swing.ButtonGroup p3_bg;
    private javax.swing.JRadioButton p3_button_aOption;
    private javax.swing.JRadioButton p3_button_bOption;
    private javax.swing.JRadioButton p3_button_cOption;
    private javax.swing.JRadioButton p3_button_dOption;
    // End of variables declaration//GEN-END:variables
}
