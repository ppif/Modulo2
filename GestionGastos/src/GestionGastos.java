import java.util.Scanner;
import java.util.ArrayList;


public class GestionGastos {

	//importar util scanner y arraylist para el futuro array de gastos
	//nuevo objeto tipo Arraylist de gastos?.
	//crear m�todo start: MenuPrincipalGestionGastos
	//crear el while
	//nuevo objeto reader para la respuesta
	//String con las opciones de gesti�n
	//generar los ifs
	//crear m�todos (a�adirGastos,modificarGastos,borrarGastos, listarGastos y salir)
	
	
	
	//ArrayList<Gasto> gastos = new ArrayList<Gasto>();
	
	
	public static void MenuPrincipalGestionGastos() {
		
		
		while (true) {
		
		System.out.println("MENU PRINCIPAL: GESTIONA TUS GASTOS");
		System.out.println("A�adir gastos");
		System.out.println("Modificar gastos");
		System.out.println("Borrar gastos");
		System.out.println("Listado de gastos");
		System.out.println("Salir");
		System.out.println("--------------------------------\n");
		System.out.println("Por favor, introduce la opci�n que desees llevar a cabo\n");
		
		Scanner reader = new Scanner(System.in);
		String SeleccionMenu = reader.nextLine();
		
		
		if (SeleccionMenu.equals("A�adir gastos")) {
			
			//GestionGastos.a�adirGastos
		}
		
		
		else if (SeleccionMenu.equals("Modificar gastos")) {
			
			//GestionGastos.modificarGastos
		}
		
		else if (SeleccionMenu.equals("Borrar gastos")) {
			
			//GestionGastos.borrarGastos
		}
		
		else if (SeleccionMenu.equals("Listado de gastos")) {
			
			//GestionGastos.listarGastos
		}
		
		else if (SeleccionMenu.equals("Salir")) {
			break;
		}
		
		else {
			System.out.println ("Disculpa, no te he entendido. Selecciona una de las opciones que se muestran en pantalla.\n");
			
		}
		
		
	}
		
	
	//public static GestionGastosGenerico () {}

		
		
	
	}
	
}
