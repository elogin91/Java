package examenPenultimo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class NewFrame extends JFrame implements ActionListener{
	JButton button1, button2;
    public NewFrame() {
        setLayout(null);
        button1=new JButton("Laborable");
        button1.setBounds(50,100,100,30);
        add(button1);
        button1.addActionListener(this);
        button2=new JButton("Festivo");
        button2.setBounds(50,200,100,30);
        add(button2);
        button2.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button1) {
            setTitle("Laborable");
        }
        if (e.getSource()==button2) {
            setTitle("Festivo");
        }
    }
    
    public static void main(String[] ar) {
    	NewFrame frame=new NewFrame();
        frame.setBounds(0,0,450,350);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
