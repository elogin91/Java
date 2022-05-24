package constructor;

/**
 * Plantear una clase TablaMultiplicar. Definir dos constructores uno con un
 * par�metro que llegue un entero indicando que tabla queremos ver y otro con
 * dos enteros que indique el primero que tabla queremos ver y el segundo
 * par�metro indica cuantos t�rminos mostrar. Si no llega la cantidad de
 * t�rminos a mostrar inicializar en 10 los t�rminos a mostrar
 *
 */
public class TablaMultiplicar {
	private int tabla;
	private int terminos;

	public TablaMultiplicar(int ta, int ter) {
		tabla = ta;
		terminos = ter;
	}

	public TablaMultiplicar(int ta) {
		tabla = ta;
		terminos = 10;
	}

	public void imprimir() {
		System.out.println("Tabla de multiplicar del " + tabla);
		for (int f = 1; f <= terminos; f++) {
			int resultado = f * tabla;
			System.out.println(tabla + "*" + f + " = " + resultado);
		}
	}

	public static void main(String[] ar) {
		TablaMultiplicar tabla1 = new TablaMultiplicar(5);
		tabla1.imprimir();
		TablaMultiplicar tabla2 = new TablaMultiplicar(3, 5);
		tabla2.imprimir();
	}
}
