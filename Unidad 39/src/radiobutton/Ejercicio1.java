package radiobutton;

import javax.swing.*;
import javax.swing.event.*;

public class Ejercicio1 extends JFrame implements ChangeListener {
	private JRadioButton radio1, radio2;
	private ButtonGroup bg;
	private JTextField texto1, texto2;

	public Ejercicio1() {
		setLayout(null);
		bg = new ButtonGroup();
		radio1 = new JRadioButton("Sumar");
		radio1.setBounds(200, 20, 100, 30);
		radio1.addChangeListener(this);
		add(radio1);
		bg.add(radio1);
		radio2 = new JRadioButton("Restar");
		radio2.setBounds(200, 70, 100, 30);
		radio2.addChangeListener(this);
		add(radio2);
		bg.add(radio2);
		texto1 = new JTextField();
		texto1.setBounds(10, 50, 50, 30);
		add(texto1);
		texto2 = new JTextField();
		texto2.setBounds(100, 50, 50, 30);
		add(texto2);
	}

	public void stateChanged(ChangeEvent e) {
		int num1;
		int num2;
		String total;
		String text = texto1.getText();
		num1 = Integer.parseInt(text);
		text = texto2.getText();
		num2 = Integer.parseInt(text);
		if (radio1.isSelected()) {
			total = Integer.toString(num1 + num2);
			setTitle(total);
		}
		if (radio2.isSelected()) {
			total = Integer.toString(num1 - num2);
			setTitle(total);
		}
	}

	public static void main(String[] ar) {
		Ejercicio1 formulario1 = new Ejercicio1();
		formulario1.setBounds(0, 0, 350, 230);
		formulario1.setVisible(true);
		formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
