package frame;

import javax.swing.*;
import java.awt.event.*;

public class FrameButton2 extends JFrame implements ActionListener{
	private JButton button1,button2,button3;
    public FrameButton2() {
        setLayout(null);
        button1=new JButton("1");
        button1.setBounds(10,100,90,30);
        add(button1);
        button1.addActionListener(this);
        button2=new JButton("2");
        button2.setBounds(110,100,90,30);
        add(button2);
        button2.addActionListener(this);
        button3=new JButton("3");
        button3.setBounds(210,100,90,30);
        add(button3);
        button3.addActionListener(this);        	
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button1) {
            setTitle("boton 1");
        }
        if (e.getSource()==button2) {
            setTitle("boton 2");
        }
        if (e.getSource()==button3) {
            setTitle("boton 3");
        }        
    }
    
    public static void main(String[] ar){
    	FrameButton2 form=new FrameButton2();
        form.setBounds(0,0,350,200);
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
