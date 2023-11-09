package com.curso.proyectosemana1;

public abstract class Cuenta {
	/**
	 * Declaro las variables que compartiran todas las instancias de la clase padre Cuenta
	 * además del idCuenta que será un autonumerico para poder ir asignandoles un numero de cuenta a cada instancia
	 */
	private static final String NOMBRE_BANCO = "BBVA";
	private String nombre;
	private int saldo;
	private static int numCuentas = 0;
	private final int ID_CUENTA;
	
	/**
	 * Constructor para ayudar a crear las instancias de las clases que hereden de esta misma clase
	 * @param nombre
	 * @param saldo
	 */
	public Cuenta(String nombre, int saldo) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
		this.numCuentas++;
		this.ID_CUENTA = this.numCuentas;
	}

	public Cuenta(String nombre, int saldo, int iD_CUENTA) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
		ID_CUENTA = iD_CUENTA;
	}
	

	public String getNombreBanco() {
		return NOMBRE_BANCO;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getID_CUENTA() {
		return ID_CUENTA;
	}
}
