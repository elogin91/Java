package menu;

import javax.swing.*;
import java.awt.event.*;

public class MenuNumeros extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JMenuBar mb;
    private JMenu menu1;
    private JMenuItem m1,m2;
    private JTextField tf1,tf2;
    public MenuNumeros() {
        setLayout(null);
        mb=new JMenuBar();
        setJMenuBar(mb);
        menu1=new JMenu("Opciones");
        mb.add(menu1);
        m1=new JMenuItem("Redimensionar ventana");
        menu1.add(m1);
        m1.addActionListener(this);
        m2=new JMenuItem("Salir");
        menu1.add(m2);
        m2.addActionListener(this);
        tf1=new JTextField();
        tf1.setBounds(10,10,100,30);
        add(tf1);
        tf2=new JTextField();
        tf2.setBounds(10,50,100,30);
        add(tf2);
    }
 
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==m1) {
            String cad1=tf1.getText();
            String cad2=tf2.getText();
            int ancho=Integer.parseInt(cad1);
            int alto=Integer.parseInt(cad2);
            setSize(ancho,alto);
        }
        if (e.getSource()==m2) {
            System.exit(0);
        }
    }
 
    public static void main(String[] ar) {
    	MenuNumeros mn=new MenuNumeros();
    	mn.setBounds(800,600,300,200);
    	mn.setVisible(true);
    	mn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}

