package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameButton3 extends JFrame implements ActionListener{
	private JButton button1,button2;
    public FrameButton3() {
        setLayout(null);
        button1=new JButton("Masculino");
        button1.setBounds(10,100,90,30);
        add(button1);
        button1.addActionListener(this);
        button2=new JButton("Femenino");
        button2.setBounds(110,100,90,30);
        add(button2);
        button2.addActionListener(this);
      	
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button1) {
            setTitle("Masculino");
        }
        if (e.getSource()==button2) {
            setTitle("Femenino");
        }
    }
    
    public static void main(String[] ar){
    	FrameButton3 form=new FrameButton3();
        form.setBounds(0,0,350,200);
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
