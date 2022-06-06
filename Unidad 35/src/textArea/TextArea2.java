package textArea;

import javax.swing.*;

public class TextArea2 extends JFrame{
	private JTextField textfield1;
    private JTextArea textarea1;
    private JScrollPane scrollpane1;
    public TextArea2() {
        setLayout(null);
        textfield1=new JTextField();
        textfield1.setBounds(10,10,200,30);
        add(textfield1);
        textarea1=new JTextArea();        
        scrollpane1=new JScrollPane(textarea1);    
        scrollpane1.setBounds(10,50,400,300);
        add(scrollpane1);
    }
    
    public static void main(String[] ar) {
    	TextArea2 form=new TextArea2();
        form.setBounds(0,0,540,400);
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
}
