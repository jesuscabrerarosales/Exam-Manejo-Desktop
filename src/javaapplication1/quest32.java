
package javaapplication1;

import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;


public class quest32 extends javax.swing.JPanel {

    public quest32() {
        initComponents();
        p32_bg.add(p32_button_aOption);
        p32_bg.add(p32_button_bOption);
        p32_bg.add(p32_button_cOption);
        p32_bg.add(p32_button_dOption);
        
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                SwingUtilities.invokeLater(() -> setScaledIcon());
            }
        });
    }

    private void setScaledIcon() {
        int width = jlabelQuest02.getWidth();
        int height = jlabelQuest02.getHeight();
        if (width > 0 && height > 0) {
            ImageIcon imgquest3 = new ImageIcon(getClass().getResource("/img/pregunta32.png"));
            Icon fndquest3 = new ImageIcon(imgquest3.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
            jlabelQuest02.setIcon(fndquest3);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p32_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jlabelQuest02 = new javax.swing.JLabel();
        p32_button_aOption = new javax.swing.JRadioButton();
        p32_button_bOption = new javax.swing.JRadioButton();
        p32_button_cOption = new javax.swing.JRadioButton();
        p32_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("32.- ¿Que indica la siguiente señal R-23?");

        jlabelQuest02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pregunta32.png"))); // NOI18N

        p32_button_aOption.setText("a) Prohibida la circulación de motocicletas.");

        p32_button_bOption.setText("b) No estacionar motocicletas.");

        p32_button_cOption.setText("c) a) y b) son correctas.");

        p32_button_dOption.setText("d) No se encuentra regulada en la norma.");

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
                        .addContainerGap()
                        .addComponent(p32_button_aOption))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p32_button_bOption))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p32_button_cOption))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p32_button_dOption))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jlabelQuest02)))
                .addGap(0, 588, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlabelQuest02)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p32_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p32_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p32_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p32_button_dOption)
                .addContainerGap(107, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlabelQuest02;
    private javax.swing.ButtonGroup p32_bg;
    private javax.swing.JRadioButton p32_button_aOption;
    private javax.swing.JRadioButton p32_button_bOption;
    private javax.swing.JRadioButton p32_button_cOption;
    private javax.swing.JRadioButton p32_button_dOption;
    // End of variables declaration//GEN-END:variables
}
