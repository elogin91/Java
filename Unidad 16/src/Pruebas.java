
public class Pruebas {

	public static void main(String[] args) {

		Persona[] arrayPersonas = new Persona[3];
		arrayPersonas[0] = new Persona(2, "Pepe");
		arrayPersonas[1] = new Persona(3, "Paco");

		Persona2[] arrayPersonas2 = new Persona2[] { new Persona2(2, "Pepe"), new Persona2(3, "Paco") };

		int[] edades = new int[3];
		String[] nombres = new String[3];
		edades[0] = 2;
		nombres[0] = "Pepe";
	}
	
	 static public class Persona2 {
			public int age;
			public String name;
			
			public Persona2(int age, String name) {
				this.age = age;
				this.name = name;
			}
	}

}
