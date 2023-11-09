package com.curso.proyectosemana1;

/**
 * Metodos que compartiran todas las cuentas
 * @author Nicolas
 *
 */
public interface OperacionesBancarias {
	void ingresar(int cantidad);
	void retirar(int cantidad);
	void enunciarSaldo();
}
