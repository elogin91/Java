package frame;

import javax.swing.*;
import java.awt.event.*;

public class FrameButton extends JFrame implements ActionListener{
	JButton button1;
    public FrameButton() {
        setLayout(null);
        button1=new JButton("Finalizar");
        button1.setBounds(300,250,100,30);
        add(button1);
        button1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button1) {
            System.exit(0);
        }
    }
    
    public static void main(String[] ar) {
    	FrameButton form=new FrameButton();
        form.setBounds(0,0,450,350);
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
