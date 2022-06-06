package textField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextField2 extends JFrame implements ActionListener{
    private JTextField textfield1, textfield2;
    private JLabel label1;
    private JButton boton1;
    public TextField2() {
        setLayout(null);
        textfield1=new JTextField();
        textfield1.setBounds(10,10,100,30);
        add(textfield1);
        textfield2=new JTextField();
        textfield2.setBounds(10,50,100,30);
        add(textfield2);
        boton1=new JButton("Sumar");
        boton1.setBounds(10,90,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            String cad1=textfield1.getText();
            String cad2=textfield2.getText();
            int x1=Integer.parseInt(cad1);
            int x2=Integer.parseInt(cad2);
            int suma=x1+x2;
            String total=String.valueOf(suma);
            setTitle(total);
        }
    }
    
    public static void main(String[] ar) {
    	TextField2 form=new TextField2();
    	form.setBounds(0,0,350,170);
    	form.setVisible(true);
    	form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
