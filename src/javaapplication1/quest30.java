
package javaapplication1;

import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;


public class quest30 extends javax.swing.JPanel {

    public quest30() {
        initComponents();
        p30_bg.add(p30_button_aOption);
        p30_bg.add(p30_button_bOption);
        p30_bg.add(p30_button_cOption);
        p30_bg.add(p30_button_dOption);
        
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
            ImageIcon imgquest3 = new ImageIcon(getClass().getResource("/img/pregunta3.PNG"));
            Icon fndquest3 = new ImageIcon(imgquest3.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
            jlabelQuest02.setIcon(fndquest3);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p30_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jlabelQuest02 = new javax.swing.JLabel();
        p30_button_aOption = new javax.swing.JRadioButton();
        p30_button_bOption = new javax.swing.JRadioButton();
        p30_button_cOption = new javax.swing.JRadioButton();
        p30_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("30.-  ¿Cuál es la diferencia entre las señales P-2A y P-1A?");

        jlabelQuest02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pregunta29.png"))); // NOI18N

        p30_button_aOption.setText("a) No hay diferencia, se usan indistintamente.");

        p30_button_bOption.setText("b) La señal P-2A se utiliza en situaciones de mayor riesgo.");

        p30_button_cOption.setText("c) La señal P-1A advierte la presencia de curva pronunciada a la derecha mientras que la P-2A advierte la presencia  de curva suave a la derecha.");

        p30_button_dOption.setText("d) La señal P-2A advierte la presencia de curva pronunciada a la derecha mientras que la P-1A advierte la presencia  de curva suave a la derecha.");

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
                            .addComponent(jlabelQuest02, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p30_button_aOption)
                            .addComponent(p30_button_cOption)
                            .addComponent(p30_button_dOption)
                            .addComponent(p30_button_bOption))
                        .addGap(0, 65, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlabelQuest02, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p30_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p30_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p30_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p30_button_dOption)
                .addContainerGap(88, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlabelQuest02;
    private javax.swing.ButtonGroup p30_bg;
    private javax.swing.JRadioButton p30_button_aOption;
    private javax.swing.JRadioButton p30_button_bOption;
    private javax.swing.JRadioButton p30_button_cOption;
    private javax.swing.JRadioButton p30_button_dOption;
    // End of variables declaration//GEN-END:variables
}
