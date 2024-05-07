package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import controladores.Inicio;
import dtos.ClienteDto;

/**
 * Metodos utiles
 * 
 * @author csi23-nrojlla
 */
public class Utils {
	
	/**
	 * generar id para cliente
	 * 
	 * @return
	 */
	public static long generarIdCliente() {
		long nuevoId = 0;
		int tamanio = Inicio.ClienteLista.size();

		if (tamanio > 0) {
			nuevoId = Inicio.ClienteLista.get(tamanio - 1).getIdCliente() + 1;
		} else {
			nuevoId = 1;
		}
		return nuevoId;
	}

	/**
	 * generar id para cita
	 * 
	 * @return
	 */
	public static long generarIdCita() {
		long nuevoId = 0;
		int tamanio = Inicio.CitaLista.size();

		if (tamanio > 0) {
			nuevoId = Inicio.CitaLista.get(tamanio - 1).getIdCitas() + 1;
		} else {
			nuevoId = 1;
		}
		return nuevoId;
	}

	/**
	 * Mostrar los clientes que no son validos
	 */
	public static void MostrarNoValidadosCliente() {

		for (ClienteDto cli : Inicio.ClienteLista) {

			if (cli.isValidoCliente() == false) {

				System.out.println(cli.getDniCompletoCliente() + "-" + cli.getNombreCompletoCliente());
			}
		}
	}

	/**
	 * Solicitar una fecha
	 * 
	 * @return local Date
	 */
	public static LocalDate leerFecha() {
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("Elija una fecha (dd-mm-yyyy)");
		String fechaEscogida = sc.next();

		try {
			return LocalDate.parse(fechaEscogida, formato);
		} catch (DateTimeParseException e) {
			System.out.println(
					"Error: La fecha ingresada no es válida. Por favor, ingrese una fecha en formato dd-MM-yyyy.");
			return leerFecha();
		}

	}
}