/**
 * 
 */
package com.curso.proyectosemana1;

/**
 * @author Nicolas
 *	Declaro las instancias de las clases, 2 en cada caso con diferentes atributos
 *	para mostrar todos los posibles resultados, y las introduzco en un array de tipo Cuenta
 */
public class Banco {
	static Cuenta gnomoAutonomo = new CuentaAutonomo("Carlos el Gnomo Autonomo", 50, 420, 543298);
	static Cuenta gnomoAutonomo2 = new CuentaAutonomo("Alberto el Gnomo Autonomo", 50000, 777, 876521);
	static Cuenta juan = new CuentaCorriente("Juan", 10, 985432, "Carla");
	static Cuenta pepe = new CuentaCorriente("Pepe", 10000, 785612);
	static Cuenta amazon = new CuentaEmpresa("Amazon", 1000000, "Jeff", "S.A");
	static Cuenta carniceria = new CuentaEmpresa("Carniceria Pedrito", 10, "Pedrito", "S.L");
	
	static Cuenta[] baseDeDatos = {gnomoAutonomo, gnomoAutonomo2, juan, pepe, amazon, carniceria};
	
	/**
	 * @param args
	 * Llamo al metodo movimientos bancarios que es donde se efectuaran todos los metodos
	 */
	public static void main(String[] args) {
		movimientosBancarios();
	}
	
	/**
	 * Recorro el array de Cuenta y compruebo de que clase es la instancia dentro del array 
	 * para realizar unos metodos u otros
	 */
	public static void movimientosBancarios() {
		for(Cuenta cuenta: baseDeDatos) {
			if(cuenta instanceof CuentaAutonomo) {
				System.out.println("****************************************************");
				System.out.println("Movimientos de: " + cuenta.getNombre() + " / " + cuenta.getNombreBanco());
				((CuentaAutonomo) cuenta).retirar(500);
				((CuentaAutonomo) cuenta).ingresar(10);
				((CuentaAutonomo) cuenta).desgravar(50, 100);
				System.out.println("****************************************************");
			}
			if(cuenta instanceof CuentaEmpresa) {
				System.out.println("****************************************************");
				System.out.println("Movimientos de: " + cuenta.getNombre() + " / " + cuenta.getNombreBanco());
				((CuentaEmpresa) cuenta).retirar(500);
				((CuentaEmpresa) cuenta).ingresar(10);
			}
			if(cuenta instanceof CuentaCorriente) {
				System.out.println("****************************************************");
				System.out.println("Movimientos de: " + cuenta.getNombre() + " / " + cuenta.getNombreBanco());
				((CuentaCorriente) cuenta).retirar(500);
				((CuentaCorriente) cuenta).ingresar(10);
				((CuentaCorriente) cuenta).consultarCotitular();;
				System.out.println("****************************************************");
			}
		}
	}
}
