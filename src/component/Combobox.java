
package component;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicColorChooserUI;
import javax.swing.plaf.basic.BasicComboBoxUI;

public class Combobox<E> extends JComboBox<E>{
    private String labeText = "Label";
    private Color lineColor = new Color(3, 155, 216);
    private boolean mouseOver;

    public Combobox() {
        setBackground(Color.WHITE);
        setBorder(new EmptyBorder(15,3,5,3));
        setUI(new ComboUI());
    }

    public String getLabeText() {
        return labeText;
    }

    public void setLabeText(String labeText) {
        this.labeText = labeText;
    }

    public Color getLineColor() {
        return lineColor;
    }

    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }

    public boolean isMouseOver() {
        return mouseOver;
    }

    public void setMouseOver(boolean mouseOver) {
        this.mouseOver = mouseOver;
    }
    
    private class ComboUI extends BasicComboBoxUI{

        public ComboUI() {
        }
        
    }
    
}
