package LogicaCRUD;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		Metodos metodosC = new Metodos();
		
		int seleccion;
		
		do {
			seleccion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido\n1.Agregar Nombre\n2.Ver lista de nombres\n3.Buscar Nombre"
					+ "\n4.Eliminar nombre\n5.Salir"));
			
			switch(seleccion) {
			case 1:
				String nombre = JOptionPane.showInputDialog("Ingresa el nombre");
				metodosC.NombreAAgregar(nombre);
				break;
			case 2:
				metodosC.NombresEnLista();
				break;
			case 3:
				String nombreABuscar = JOptionPane.showInputDialog("Ingresa el nombre que deseas buscar");
				metodosC.BuscarNombre(nombreABuscar);
				break;
			case 4:
				String nombreAEliminar = JOptionPane.showInputDialog("Ingresa el nombre que deseas eliminar");
				metodosC.EliminarNombres(nombreAEliminar);
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Gracias por usar el CRUD, hasta luego!",
			"Adios",JOptionPane.INFORMATION_MESSAGE);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion no valida, por favor revisa",
			"Error Opcion",JOptionPane.ERROR_MESSAGE);
				 break;
			}
			
		}while(seleccion !=5);
	}
}
