import java.util.Scanner;
import java.util.ArrayList;


public class Controler {

	public static void Start () {
	
	//Declarar nuevo objeto tipo scanner llamado reader para interactuar con cliente.
	//Declarar nuevo objeto de tipo Arraylist de users.
	//Crear el while	
	//String de bienvenida: Dar opciones men� (login, createuser...)
	//Crear los ifs	
	
	
		Scanner reader = new Scanner(System.in);
		//ArrayList<User> users = new ArrayList<User>();
		
		
		while (true) {	
			
		//Men� de Opciones
			System.out.println("BIENVENIDO A TU PLATAFORMA DE GESTI�N DE GASTOS.");
			System.out.println("Por favor, introduce la opci�n que desees llevar a cabo\\n");
			System.out.println("Crear cuenta");
			System.out.println("Entrar en mi espacio");
			System.out.println("Salir");

			
			String respuesta1 = reader.nextLine();
			
			
	//Condiciones con sus caminos a m�todos
	if (respuesta1.equals("Crear cuenta")){
		System.out.println ("�Vamos a crearte una cuenta!");
		//CreacionCuenta.crearCuenta();
		GestionGastos.MenuPrincipalGestionGastos(); //esta llamada a m�todo aqu� es provisional, estoy probando que funcione.
	}
	
	else if (respuesta1.equals("Entrar en mi espacio")) {
		System.out.println ("�Entremos en tu espacio personal!");
		//Login.login();
	}
		
		
	else if (respuesta1.equals("Salir")) {
		break;
	
	}
	
	else{		
		System.out.println ("Disculpa, no te he entendido. �Podr�as repetir?");
	
	}
	
	}	
	reader.close();	
	}
}

		