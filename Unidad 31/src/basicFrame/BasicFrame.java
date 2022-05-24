package basicFrame;

import javax.swing.*;

public class BasicFrame extends JFrame {
	 public BasicFrame() {
	        setLayout(null);
	    }

	    public static void main(String[] ar) {
	        BasicFrame frame=new BasicFrame();
	        frame.setBounds(10,20,1024,800);
	        frame.setVisible(true);
	        frame.setResizable(false);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }
}
