package com.curso.proyectosemana1;

/**
 * Declaramos las variables que tendran las instancias de la clase CuentaCorriente además de las que hereda del padre Cuenta
 * @author Nicolas
 * @see Cuenta, OperacionesBancarias
 */
public class CuentaEmpresa extends Cuenta implements OperacionesBancarias {
	private String nombreOwner;
	private String tipoEmpresa;

	public CuentaEmpresa(String nombre, int saldo, String nombreOwner, String tipoEmpresa) {
		super(nombre, saldo);
		this.nombreOwner = nombreOwner;
		this.tipoEmpresa = tipoEmpresa;
	}
	
	/**
	 * Override de los metodos de la interfaz OperacionesBancarias para adaptarlo a la instancia de CuentaEmpresa
	 *  que aumentan y reducen el saldo del objeto  
	 * @see OperacionesBancarias
	 */
	@Override
	public void ingresar(int cantidad) {
		this.setSaldo(this.getSaldo() + cantidad);
		System.out.println("Cantidad ingresada: " + cantidad + "€");
		enunciarSaldo();
	}

	@Override
	public void retirar(int cantidad) {
		this.setSaldo(this.getSaldo() - cantidad);
		System.out.println("Cantidad retirada: " + cantidad + "€");
		enunciarSaldo();
	}
	@Override
	public void enunciarSaldo() {
		System.out.println("Fondos actuales de la empresa " + this.getNombre() + "." + tipoEmpresa + " con numero de cuenta " 
		+ this.getID_CUENTA() + " del Sr/Sra. " + nombreOwner + ": " + this.getSaldo());
		if (this.getSaldo() < 0) {
			System.out.println("La empresa está al borde de la quiebra");
		}
	}
}
