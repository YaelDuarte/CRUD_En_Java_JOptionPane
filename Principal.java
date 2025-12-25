package LogicaCRUD;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		Metodos metodosC = new Metodos();
		
		int seleccion;
		
		do {
			seleccion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido\n1.Agregar Nombre\n2.Ver lista de nombres\n3.Buscar Nombre"
					+ "\n4.Salir"));
			
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
			}
			
		}while(seleccion !=4);
	}
}
