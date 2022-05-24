package frame;

import javax.swing.*;

public class BasicFrame2 extends JFrame {
    private JLabel label1,label2, label3;
    public BasicFrame2() {
        setLayout(null);
        label1=new JLabel("Color Rojo");
        label1.setBounds(10,20,300,30);
        add(label1);
        label2=new JLabel("Color Azul");
        label2.setBounds(10,50,100,30);
        add(label2);
        label3=new JLabel("Color Amarillo");
        label3.setBounds(10,80,100,30);
        add(label3);
    }
    
    public static void main(String[] ar) {
    	BasicFrame2 form=new BasicFrame2();
        form.setBounds(0,0,300,200);
        form.setResizable(false);
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
