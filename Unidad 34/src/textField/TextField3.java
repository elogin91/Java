package textField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextField3 extends JFrame implements ActionListener {
	private JTextField textfield1, textfield2;

	private JButton boton1;

	public TextField3() {

		setLayout(null);
		textfield1 = new JTextField();
		textfield1.setBounds(10, 10, 100, 30);
		add(textfield1);
		textfield2 = new JTextField();
		textfield2.setBounds(10, 50, 100, 30);
		add(textfield2);
		boton1 = new JButton("aceptar");
		boton1.setBounds(10, 90, 100, 30);
		add(boton1);
		boton1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			String cad1 = textfield1.getText();
			String cad2 = textfield2.getText();
			if (cad1.equals("juan") && cad2.equals("abc123")) {
				setTitle("Codigo correcto");
			} else {
				setTitle("Error: codigo incorrecto");
			}
		}

	}

	public static void main(String[] ar) {
		TextField3 form = new TextField3();
		form.setBounds(0, 0, 350, 170);
		form.setVisible(true);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
