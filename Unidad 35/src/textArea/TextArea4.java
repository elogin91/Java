package textArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TextArea4 extends JFrame implements ActionListener{
	private JScrollPane sp1, sp2;
    private JTextArea ta1, ta2;
    private JButton boton1;
    public TextArea4() {
    	setLayout(null);
    	ta1=new JTextArea();
        sp1=new JScrollPane(ta1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sp1.setBounds(10,10,200,140);
        add(sp1);
        ta2=new JTextArea();
        sp2=new JScrollPane(ta2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sp2.setBounds(220,10,200,140);
        add(sp2);
        boton1=new JButton("Verificar");
        boton1.setBounds(10,260,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            String texto1=ta1.getText();
            String texto2=ta2.getText();
            if (texto1.equals(texto2)==true) {
                setTitle("Ambos tienen el mismo texto.");
            } else {
            	setTitle("No tiene el mismo texto.");
            }            	
        }
    }
    
    public static void main(String[] ar) {
    	TextArea4 form=new TextArea4();
        form.setBounds(0,0,540,400);
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
}
