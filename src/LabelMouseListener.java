/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Timer;

/**
 *
 * @author Amalia
 */
public class LabelMouseListener extends MouseAdapter{
    Timer waktu;
    
    public LabelMouseListener(Timer waktuParam) {
        waktu = waktuParam;
    }
    
    public void mouseEntered(MouseEvent me) {
        waktu.stop();
    }
    
    public void mouseExited(MouseEvent me) {
        waktu.start();
    }
}
