
package com.mycompany.java_swing.forms;

import com.sun.tools.javac.Main;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lable {
    //ImageIcon icon = new ImageIcon(Main.class.getResource("java.png"));
    JLabel lbl = new JLabel("اسماعيل");
     JFrame frm = new JFrame("Test Lable");
    
    public Lable(){
        frm.setVisible(true);
        frm.setSize(500, 400);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.add(lbl);
        Font font = new Font("Serif" , Font.BOLD , 25);
        lbl.setFont(font);
        lbl.setForeground(Color.GREEN);
        
    }
    
            
}
