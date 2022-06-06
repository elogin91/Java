package checkbox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;

public class Ejer1 extends JFrame implements ActionListener{
    private JCheckBox check1,check2,check3;
    private JButton boton1;
    public Ejer1() {
        setLayout(null);
        check1=new JCheckBox("Google");
        check1.setBounds(10,30,200,30);       
        add(check1);
        check2=new JCheckBox("Mozilla");
        check2.setBounds(10,60,200,30);                
        add(check2);
        check3=new JCheckBox("Safari");
        check3.setBounds(10,90,200,30);              
        add(check3);    
        boton1=new JButton ("Aceptar");
        boton1.setBounds(10,150,200,30);
        boton1.addActionListener(this);        
        add(boton1);        
    }    
    public void actionPerformed(ActionEvent e){
    	if (e.getSource()==boton1) {    	
    	
        String cad="";
        if (check1.isSelected()==true) {
            cad=cad+"Google-";
        }
        if (check2.isSelected()==true) {
            cad=cad+"Mozilla-";
        }
        if (check3.isSelected()==true) {
            cad=cad+"Safari-";
        }
        setTitle(cad); 
        }
    }
    public static void main(String[] ar) {
    	Ejer1  Ej1=new Ejer1 ();
    	Ej1.setBounds(500,200,500,500);
    	Ej1.setVisible(true);
    	Ej1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}

