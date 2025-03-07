
package com.mycompany.java_swing.forms;

import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Frame {
    
    JFrame frm = new JFrame("Test Form");

    public Frame() {
        frm.setVisible(true);
        frm.setSize(500 , 400);
        frm.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frm.setLocationRelativeTo(null);
    }
    
    
    
    
    
        
    
}
