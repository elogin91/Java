package combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import static javax.swing.JOptionPane.showMessageDialog;

   public class Ejercicio1  extends JFrame implements ActionListener {

       /**
        *
        */
       private static final long serialVersionUID = 1L;
       private JTextField txtNombre;         
       private JComboBox<String> cmbPais;
      
       public Ejercicio1()
       {
           JButton btnOk;
           JLabel j = new JLabel();
           j.setText("Nombre:");
           j.setBounds(10, 10, 300, 20);
           add(j);
           j = new JLabel();
           j.setText("Pais");
           j.setBounds(10, 40, 300, 20);
           add(j);
           txtNombre = new JTextField();
           txtNombre.setBounds(90, 10, 200, 25);
           add(txtNombre);
           cmbPais = new JComboBox<String>();
           cmbPais.setBounds(90, 40, 200, 20);
           cmbPais.addItem("España");
           cmbPais.addItem("Alemania");
           cmbPais.addItem("Francia");
           add(cmbPais);
          
           btnOk=new JButton("Verificar");
           btnOk.setBounds(10,300,100,30);
           btnOk.addActionListener(this);
           add(btnOk);
              
           setLayout(null);
       }
       public void actionPerformed(ActionEvent arg0) {
           /*String texto1,texto2;
           texto1=txtArea1.getText().trim();
           texto2=txtArea2.getText().trim();
           if(texto1.equals(texto2))
               showMessageDialog(null, "Los textos son iguales");
           else
               showMessageDialog(null, "Los textos son diferentes");
           */
           if(txtNombre.getText().trim().equals(""))
           {
               showMessageDialog(null, "Nombre vacio");
           }
           else
           {
               showMessageDialog(null, txtNombre.getText()+" "+cmbPais.getSelectedItem());
           }          
          
       }
       public static void main(String[] ar) {
           Ejercicio1 form=new Ejercicio1();
           form.setBounds(500,200,900,600);
           form.setVisible(true);
           form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       }       

   }
