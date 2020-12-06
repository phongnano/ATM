package Banks;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Demo {

    JFrame frame;

    Demo() {
        frame = new JFrame("ComboBox");
        String Sports[] = {"Select", "Tennis", "Cricket", "Football"};
        JComboBox comboBox = new JComboBox(Sports);
        comboBox.setBounds(50, 50, 90, 20);
        frame.add(comboBox, BorderLayout.CENTER);
        JCheckBox toggleVisibility = new JCheckBox("Hide/Show");
        toggleVisibility.setSelected(comboBox.isVisible());
        toggleVisibility.addItemListener(e -> {
            comboBox.setVisible(e.getStateChange() == ItemEvent.SELECTED);
        });
        frame.add(toggleVisibility, BorderLayout.SOUTH);
        //frame.setLayout(null);
        frame.setSize(600, 100);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
    }
}
