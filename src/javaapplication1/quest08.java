
package javaapplication1;

import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

public class quest08 extends javax.swing.JPanel {

    public quest08() {
        initComponents();
        
        p8_bg.add(p8_button_aOption);
        p8_bg.add(p8_button_bOption);
        p8_bg.add(p8_button_cOption);
        p8_bg.add(p8_button_dOption);
        
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                SwingUtilities.invokeLater(() -> setScaledIcon());
            }
        });
    }
    private void setScaledIcon() {
        int width = jlabelQuest08.getWidth();
        int height = jlabelQuest08.getHeight();
        if (width > 0 && height > 0) {
            ImageIcon imgquest3 = new ImageIcon(getClass().getResource("/img/pregunta3.PNG"));
            Icon fndquest3 = new ImageIcon(imgquest3.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
            jlabelQuest08.setIcon(fndquest3);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p8_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jlabelQuest08 = new javax.swing.JLabel();
        p8_button_aOption = new javax.swing.JRadioButton();
        p8_button_bOption = new javax.swing.JRadioButton();
        p8_button_cOption = new javax.swing.JRadioButton();
        p8_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("8.- La siguiente señal vertical reglamentaria R-53:");

        jlabelQuest08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pregunta8.png"))); // NOI18N

        p8_button_aOption.setText("a) Prohíbe estacionar.");

        p8_button_bOption.setText("b) Prohíbe al conductor detener el vehículo dentro del área de la intersección.");

        p8_button_cOption.setText("c) Prohíbe la carga y descarga.");

        p8_button_dOption.setText("d) Prohíbe la circulación de vehículos motorizados.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p8_button_aOption))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p8_button_bOption))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p8_button_cOption))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p8_button_dOption))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabelQuest08, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlabelQuest08, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p8_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p8_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p8_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p8_button_dOption)
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlabelQuest08;
    private javax.swing.ButtonGroup p8_bg;
    private javax.swing.JRadioButton p8_button_aOption;
    private javax.swing.JRadioButton p8_button_bOption;
    private javax.swing.JRadioButton p8_button_cOption;
    private javax.swing.JRadioButton p8_button_dOption;
    // End of variables declaration//GEN-END:variables
}
