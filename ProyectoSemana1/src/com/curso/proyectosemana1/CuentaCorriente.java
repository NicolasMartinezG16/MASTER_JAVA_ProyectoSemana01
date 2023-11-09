package com.curso.proyectosemana1;

/**
 * Declaramos las variables que tendran las instancias de la clase CuentaCorriente además de las que hereda del padre Cuenta
 * @author Nicolas
 * @see Cuenta, OperacionesBancarias
 */
public class CuentaCorriente extends Cuenta implements OperacionesBancarias {
	private int numTarjeta;
	private String coTitular;
	
	public CuentaCorriente(String nombre, int saldo, int numTarjeta) {
		super(nombre, saldo);
		this.numTarjeta = numTarjeta;
	}
	
	public CuentaCorriente(String nombre, int saldo, int numTarjeta, String coTitular) {
		super(nombre, saldo);
		this.numTarjeta = numTarjeta;
		this.coTitular = coTitular;
	}

	public int getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(int numTarjeta) {
		this.numTarjeta = numTarjeta;
	}
	

	public String getCoTitular() {
		return coTitular;
	}

	public void setCoTitular(String coTitular) {
		this.coTitular = coTitular;
	}
	
	/**
	 * Override de los metodos de la interfaz OperacionesBancarias para adaptarlo a la instancia de CuentaCorriente
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
		System.out.println("Saldo actual del usuario " + this.getNombre() + " con numero de cuenta " 
		+ this.getID_CUENTA() + ": " + this.getSaldo() + "€ :)");
		if (this.getSaldo() < 0) {
			System.out.println("Esta usted en números rojos :(");
		}
	}
	
	/**
	 * Metodo para consultar la varibale cotitular de la instancia imprimiendola por pantalla	
	 */
	public void consultarCotitular() {
		if(coTitular != null) {
			System.out.println("Cotitular de la cuenta bancaria: " + this.getCoTitular());
		}else{
			System.out.println("La cuenta de número " + this.getID_CUENTA() + " no dispone de ningun titular mas que " 
					+ this.getNombre());
		}
	}
}
