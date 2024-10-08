
package javaapplication1;

import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;


public class quest17 extends javax.swing.JPanel {

    public quest17() {
        initComponents();
        
        p17_bg.add(p17_button_aOption);
        p17_bg.add(p17_button_bOption);
        p17_bg.add(p17_button_cOption);
        p17_bg.add(p17_button_dOption);
        
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                SwingUtilities.invokeLater(() -> setScaledIcon());
            }
        });
    }

    private void setScaledIcon() {
        int width = jlabelQuest17.getWidth();
        int height = jlabelQuest17.getHeight();
        if (width > 0 && height > 0) {
            ImageIcon imgquest3 = new ImageIcon(getClass().getResource("/img/pregunta3.PNG"));
            Icon fndquest3 = new ImageIcon(imgquest3.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
            jlabelQuest17.setIcon(fndquest3);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p17_bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jlabelQuest17 = new javax.swing.JLabel();
        p17_button_aOption = new javax.swing.JRadioButton();
        p17_button_bOption = new javax.swing.JRadioButton();
        p17_button_cOption = new javax.swing.JRadioButton();
        p17_button_dOption = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("17.- La siguiente señal vertical reglamentaria (R-29:");

        p17_button_aOption.setText("a) Prohíbe el uso de la bocina en vías urbanas.");
        p17_button_aOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p17_button_aOptionActionPerformed(evt);
            }
        });

        p17_button_bOption.setText("b) Prohíbe el uso de la bocina en carreteras.");

        p17_button_cOption.setText("c) Prohíbe el uso de la bocina.");

        p17_button_dOption.setText("d) Prohíbe hacer ruido.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p17_button_aOption))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p17_button_bOption))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p17_button_cOption))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p17_button_dOption))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jlabelQuest17, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(561, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlabelQuest17, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p17_button_aOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p17_button_bOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p17_button_cOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p17_button_dOption)
                .addContainerGap(112, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p17_button_aOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p17_button_aOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p17_button_aOptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlabelQuest17;
    private javax.swing.ButtonGroup p17_bg;
    private javax.swing.JRadioButton p17_button_aOption;
    private javax.swing.JRadioButton p17_button_bOption;
    private javax.swing.JRadioButton p17_button_cOption;
    private javax.swing.JRadioButton p17_button_dOption;
    // End of variables declaration//GEN-END:variables
}
