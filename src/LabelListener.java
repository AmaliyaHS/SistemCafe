/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author Amalia
 */
public class LabelListener implements ActionListener{
    JLabel lbl;
    
    public LabelListener(JLabel lblParam) {
        lbl = lblParam;
    }

    public void actionPerformed(ActionEvent act) {
        String text = lbl.getText();
        String text2 = text.substring(1) + text.substring(0, 1);
        lbl.setText(text2);
    }
    
}
