package model;

import java.util.ArrayList;

public class registroUsusario {
	
	/**Esta función llena una lista con los nombres de los ususarios que se registrar
	 * 
	 * @param nombre
	 * @return
	 */
	public ArrayList<String> llenarUsusarios(String nombre) {
		ArrayList<String> lista = new ArrayList<>();
			lista.add(nombre);
		return lista;
	}
	/**Esta función llena una lista con las cedulas de los usuarios que se registren
	 * 
	 * @param cedula
	 * @return
	 */
	public ArrayList<String> llenarCedulaususarios(String cedula){
		ArrayList<String> listaCedula = new ArrayList<>();
		listaCedula.add(cedula);
		return listaCedula;
		
	}
}