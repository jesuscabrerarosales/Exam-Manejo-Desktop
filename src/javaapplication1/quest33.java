
package javaapplication1;

import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

public class quest33 extends javax.swing.JPanel {

    public quest33() {
        initComponents();
        p33_bg.add(p33_button_aOption);
        p33_bg.add(p33_button_bOption);
        p33_bg.add(p33_button_cOption);
        p33_bg.add(p33_button_dOption);
        
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
            ImageIcon imgquest3 = new ImageIcon(getClass().getResource("/img/pregunta33.PNG"));
            Icon fndquest3 = new ImageIcon(imgquest3.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
            jlabelQuest02.setIcon(fndquest3);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p33_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jlabelQuest02 = new javax.swing.JLabel();
        p33_button_aOption = new javax.swing.JRadioButton();
        p33_button_bOption = new javax.swing.JRadioButton();
        p33_button_cOption = new javax.swing.JRadioButton();
        p33_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("33.- Si dos vehículos se aproximan simultáneamente a una intersección no regulada (sin señalización)  procedentes de vías diferentes, ¿quién tiene preferencia de paso?");

        jlabelQuest02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pregunta33.png"))); // NOI18N

        p33_button_aOption.setText("a) Cualquiera de los dos.");

        p33_button_bOption.setText("b) El que se aproxime por la derecha del otro.");

        p33_button_cOption.setText("c) El que se aproxime por la izquierda del otro.");

        p33_button_dOption.setText("d) El que haga sonar la bocina primero.");

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
                        .addComponent(p33_button_aOption))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p33_button_bOption))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p33_button_cOption))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p33_button_dOption))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jlabelQuest02, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlabelQuest02, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p33_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p33_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p33_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p33_button_dOption)
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlabelQuest02;
    private javax.swing.ButtonGroup p33_bg;
    private javax.swing.JRadioButton p33_button_aOption;
    private javax.swing.JRadioButton p33_button_bOption;
    private javax.swing.JRadioButton p33_button_cOption;
    private javax.swing.JRadioButton p33_button_dOption;
    // End of variables declaration//GEN-END:variables
}
