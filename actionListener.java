package basic;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class actionListener implements ActionListener {
    JButton jb;
    JTextField t1,t2;
    JLabel jl;
    actionListener(){
    JFrame jf = new JFrame("frame");
    jf.setSize(500, 500);
    jf.setLayout(null);
    jb = new JButton("Click");
    jb.setBounds(20, 20, 100, 30);
    t1 = new JTextField("initial text 1");
    t2 = new JTextField("initial text 2");
    t1.setBounds(20,110,200,30);
    t2.setBounds(20,150,200,30);
    jf.add(t1);
    jf.add(t2);
    jl = new JLabel("this is initial text");
    jl.setBounds(20, 70, 200, 30);
    jf.add(jb);
    jf.add(t1);
    jf.add(t2);
    jf.add(jl);
    jb.addActionListener(this);
    jf.setVisible(true);

    }
    public void actionPerformed(ActionEvent el ){
      jl.setText("Button Clicked");
      t1.setText("Button Clicked ");
      t2.setText("Button Clicked ");
    }
     public static void main(String[] args) {
        new actionListener();
    
}
}
