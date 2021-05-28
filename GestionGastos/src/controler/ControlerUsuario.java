package controler;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Gasto;
import modelo.Usuario;

public class ControlerUsuario {

	public static void menu(String usuario) {

		Scanner reader = new Scanner(System.in);
		
		String nuevoNombreContrasenia = "";
		//ArrayList<Gasto> gastos = new ArrayList<Gasto>();
		String SeleccionMenu = "";
		
		
		while (true) {

			System.out.println("MENU PRINCIPAL:");
			System.out.println("Cambiar nombre del usuario");
			System.out.println("Cambiar contrase�a");
			System.out.println("Administrar gastos");
			System.out.println("Eliminar la cuenta");
			System.out.println("Salir");
			System.out.println("--------------------------------\n");
			System.out.println("Por favor, introduce la opci�n que desees llevar a cabo\n");
			
			SeleccionMenu = reader.nextLine();
			

			if (SeleccionMenu.equalsIgnoreCase("Cambiar nombre del usuario")) {

				System.out.println("Introduce nuevo nombre de usuario, por favor");
				nuevoNombreContrasenia = reader.nextLine();
				
				if (ControlerPrincipal.cambiarNombreUsuario(usuario, nuevoNombreContrasenia)) {
					System.out.println("El nombre de usuario fue cambiado con exito");
				} else {
					System.out.println("Error. No existe usuario " + usuario);
				}
				
				// GestionGastos.a�adirGastos(usuario)
			}

			else if (SeleccionMenu.equalsIgnoreCase("Cambiar contrase�a")) {

				System.out.println("Introduce nueva contrase�a, por favor");
				nuevoNombreContrasenia = reader.nextLine();
				
				if (ControlerPrincipal.cambiarNombreUsuario(usuario, nuevoNombreContrasenia)) {
					System.out.println("La contrase�a fue cambiada con exito");
				} else {
					System.out.println("Error. No existe usuario " + usuario);
				}
				
				// GestionGastos.modificarGastos(usuario)
			}

			else if (SeleccionMenu.equalsIgnoreCase("Administrar gastos")) {

				ControlerGastos.MenuPrincipalGestionGastos(usuario);
			}

			else if (SeleccionMenu.equalsIgnoreCase("Eliminar la cuenta")) {

				if (ControlerPrincipal.eliminarUsuario(usuario)) {
					System.out.println("La cuenta fue eliminada.");
				} else {
					System.out.println("Error. No existe la cuenta de " + usuario);
				}
			}

			else if (SeleccionMenu.equalsIgnoreCase("Salir")) {
				break;
			}

			else {
				System.out.println(
						"Disculpa, no te he entendido. Selecciona una de las opciones que se muestran en pantalla.\n");

			}
		}

	}

	// public static GestionGastosGenerico () {}
}
