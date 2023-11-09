package com.curso.proyectosemana1;

/**
 * Declaramos las variables que tendran las instancias de la clase CuentaAutonomo además de las que hereda del padre Cuenta
 * @author Nicolas
 * @see Cuenta, OperacionesBancarias, OperacionesAutonomo
 */

public class CuentaAutonomo extends Cuenta implements OperacionesBancarias, OperacionesAutonomo {
	private int numAutonomo;
	private int numTarjeta;
		
	public CuentaAutonomo(String nombre, int saldo, int numAutonomo, int numTarjeta) {
		super(nombre, saldo);
		this.numAutonomo = numAutonomo;
		this.numTarjeta = numTarjeta;
	}

	public int getNumAutonomo() {
		return numAutonomo;
	}


	public void setNumAutonomo(int numAutonomo) {
		this.numAutonomo = numAutonomo;
	}


	public int getNumTarjeta() {
		return numTarjeta;
	}


	public void setNumTarjeta(int numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	
	/**
	 * Override de los metodos de la interfaz OperacionesBancarias para adaptarlo a la instancia de CuentaAutonomo
	 *  que aumentan y reducen el saldo del objeto  
	 * @see OperacionesAutonomo
	 */

	@Override
	public void desgravar(int porcentaje, int gasto) {
		this.setSaldo(this.getSaldo() + ((porcentaje*gasto)/100));
		System.out.println("El usuario " + this.getNombre() + " (" + numAutonomo + ") con numero de cuenta " 
				+ this.getID_CUENTA() + " se ha desgravado " + ((porcentaje*gasto)/100) + "€ :)");
		enunciarSaldo();
	}
	
	/**
	 * Override de los metodos de la interfaz OperacionesBancarias para adaptarlo a la instancia de CuentaAutonomo
	 *  que aumentan y reducen el saldo del objeto  
	 * @see OperacionesBancarias
	 */

	@Override
	public void ingresar(int cantidad) {
		this.setSaldo(this.getSaldo() + cantidad);
		System.out.println("Cantidad ingresada con la tarjeta " + numTarjeta + ": " + cantidad + "€");
		enunciarSaldo();
	}

	@Override
	public void retirar(int cantidad) {
		this.setSaldo(this.getSaldo() - cantidad);
		System.out.println("Cantidad retirada con la tarjeta " + numTarjeta + ": " + cantidad + "€");
		enunciarSaldo();
	}
	@Override
	public void enunciarSaldo() {
		System.out.println("Saldo actual del usuario " + this.getNombre() + " (" + numAutonomo + ") con numero de cuenta " 
				+ this.getID_CUENTA() + ": " + this.getSaldo() + "€ :)");
		if (this.getSaldo() < 0) {
			System.out.println("Es dificil ser autónomo :(");
		}
	}
}
