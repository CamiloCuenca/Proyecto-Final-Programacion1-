package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class registroUsusario {

	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<>();
		ArrayList<String> cedulas= new ArrayList<>(); 
		System.out.println(llenarListaNombres(nombres));
		System.out.println(llenarListaCedula(cedulas));
		
		
	}
	public static  ArrayList<String>  llenarListaNombres(ArrayList<String> nombres) {
		String nombre=null;
		for(int i =0;i<1;i++) {
			nombre=JOptionPane.showInputDialog("Ingrese su nombre: ");
			nombres.add(nombre);
		}
		
		return nombres;
		
	}
	public static  ArrayList<String>  llenarListaCedula (ArrayList<String> cedulas) {
		String cedula = JOptionPane.showInputDialog("ingrese su cedula: ");
		for(int i = 0; i<cedulas.size();i++) {
			if(cedula.length()!=10) {
				System.out.println("el dato ingresado es incorrecto");
			}else {
				cedulas.add(cedula);
			}
			
		}
		return cedulas;
	

		
		
		
		
		

		
		
		
	}
	
	public static boolean verificarUsuario(ArrayList<String> cedulas, String cedula){
		for(int i=0;i<cedulas.size()-1;i++) {
			for(int j=i+1;j<cedulas.size();j++) {
				if(cedulas.get(i).equals(cedulas.get(j))) {
					return false;
				}else {
					return true;
				}
				
					
			}
		}
		
		return false;
		
	}
}
