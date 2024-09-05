package basic;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class checkBox implements ActionListener{
    JCheckBox b1,b2;
    JLabel l;
    JButton b;
    checkBox(){     // constructor
    JFrame jf = new JFrame("Frame");
    jf.setSize(600,600);
    jf.setLayout(null);
    b = new JButton("save");
    b1 = new JCheckBox("Male");
    b2 = new JCheckBox("Female");
    l = new JLabel("Select Your Gender");
    l.setBounds(20, 20, 150, 30);
    b1.setBounds(20, 60, 90, 30);
    b2.setBounds(20, 100, 90, 30);
    b.setBounds(20, 130, 90, 30);
    jf.add(l);
    jf.add(b1);
    jf.add(b2);
    jf.add(b);
    b.addActionListener(this);
    jf.setVisible(true); 
   }
   public void actionPerformed(ActionEvent el){
    if(b1.isSelected()){
        l.setText("you are  "+ b1.getText());
        b2.setEnabled(false);
    }
    else if(b2.isSelected()){
        l.setText("you are "+ b2.getText());
        b1.setEnabled(false);
    }else{
        l.setText("Koojja ");
     
    }

   }
public static void main(String[] args) {
    new checkBox();
}
}
