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
	

			System.out.println("Bienvenido/a a tu espacio de gesti�n de gastos. �Eres nuevo/a aqu�? Responde Salir en caso de que quieras salir.");
			
			String respuesta1 = reader.nextLine();
	
	if (respuesta1.equals("Si")){
		
		System.out.println ("�Pues vamos a crearte una cuenta!");
		//CreacionCuenta.crearCuenta();
		GestionGastos.MenuPrincipalGestionGastos(); //esta llamada a m�todo aqu� es provisional, estoy probando que funcione.
	}
	
	else if (respuesta1.equals("No")) {
		System.out.println ("�Pues entremos en tu espacio personal!");
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

		