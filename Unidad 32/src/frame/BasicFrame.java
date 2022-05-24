package frame;

import javax.swing.*;

public class BasicFrame extends JFrame {
    private JLabel label1,label2;
    public BasicFrame() {
        setLayout(null);
        label1=new JLabel("Sistema de Facturación.");
        label1.setBounds(10,20,300,30);
        add(label1);
        label2=new JLabel("Vesion 1.0");
        label2.setBounds(10,100,100,30);
        add(label2);
    }
    
    public static void main(String[] ar) {
    	BasicFrame form=new BasicFrame();
        form.setBounds(0,0,300,200);
        form.setResizable(false);
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}