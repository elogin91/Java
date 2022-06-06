package textArea;

import javax.swing.*;

public class TextArea extends JFrame{
	private JTextField textfield1;
    private JTextArea textarea1;
    public TextArea() {
        setLayout(null);
        textfield1=new JTextField();
        textfield1.setBounds(10,10,200,30);
        add(textfield1);
        textarea1=new JTextArea();
        textarea1.setBounds(10,50,400,300);
        add(textarea1);
    }
    
    public static void main(String[] ar) {
    	TextArea form=new TextArea();
        form.setBounds(0,0,540,400);
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
}
