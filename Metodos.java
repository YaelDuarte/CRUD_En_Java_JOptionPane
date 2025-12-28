package LogicaCRUD;

import javax.swing.JOptionPane;

public class Metodos {
	String[] listaNombres = new String[10];
	int conteoNombres = 0;
	
	/*
	 * Funcion que se encargara de agregar los nombres al Array
	 */
	public void NombreAAgregar(String nombre) {
		if(conteoNombres < listaNombres.length) {
			listaNombres[conteoNombres] = nombre;
			conteoNombres++;
			JOptionPane.showMessageDialog(null, "El nombre fue agregado correctamente");
		}else {
			JOptionPane.showMessageDialog(null, "La lista se encuentra llena, por favor elimina algunos nombres");
		}
	}
	
	/*
	 * Funcion que se encarga de mostrar en formato lista los elementos que contiene el array
	 * observamos que se genera un String vacio el cual se concatenara con los elementos que se encuentren
	 * en la iteracion con el for
	 */
	public void NombresEnLista() {
		String listaNombresAgregados = "";
		for(int i=0;i < conteoNombres;i++) {
			listaNombresAgregados +="\n"+ (i+1) + "." + listaNombres[i];
		}
		JOptionPane.showMessageDialog(null, listaNombresAgregados);
	}
	
	/*
	 *Esta funcion se encargara de recorrer toda la lista para buscar el nombre que se indica 
	 *en caso de ue se encuentre se soltara un mensaje y la bandera se activara  
	 */
	
	public void BuscarNombre(String nombre) {
		boolean nombreEncontrado = false;
		
		for(int i=0;i < conteoNombres;i++) {
			if(listaNombres[i].equalsIgnoreCase(nombre)) {
				nombreEncontrado = true;
				break;
			}
		}
		
		if(nombreEncontrado) {
			JOptionPane.showMessageDialog(null, "El nombre existe y se encuentra en el arreglo");
		}else {
			JOptionPane.showMessageDialog(null, "El nombre no existe, por favor verifica!");
		}
	}
	
	/*
	 * Funcion que se encargara de poder eliminar el nombre seleccionado y hacer que el Array se recorra
	 */
	
	public void EliminarNombres(String nombre) {
		boolean nombreEliminado = false;
		
		for(int i=0;i<conteoNombres;i++) {
			if(nombre.equalsIgnoreCase(listaNombres[i])) {
				for(int j = i; j < conteoNombres - 1; j++) {
	                listaNombres[j] = listaNombres[j + 1];
	            }
				listaNombres[conteoNombres-1] = null;
				conteoNombres--;
				nombreEliminado = true;
				break;
			}
		}
		
		if(nombreEliminado) {
			JOptionPane.showMessageDialog(null, "El nombre fue eliminado correctamente","Exito",
					JOptionPane.INFORMATION_MESSAGE);
		}else{
			JOptionPane.showMessageDialog(null, "El nombre no existe/La lista esta vacia",
					"Error",JOptionPane.ERROR_MESSAGE);
		}
	}
	
}
