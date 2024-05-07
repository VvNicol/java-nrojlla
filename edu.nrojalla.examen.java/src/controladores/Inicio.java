package controladores;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import dtos.CitaDto;
import dtos.ClienteDto;
import servicios.MenuImplementacion;
import servicios.MenuInterface;

/**
 * Aplicacion principal
 * 
 * @author csi23-nrojlla 07052024
 */
public class Inicio {
	/**
	 * Metodos estaticos e inicio de la aplicacion
	 */
	public static List<ClienteDto> ClienteLista = new ArrayList<ClienteDto>();
	public static List<CitaDto> CitaLista = new ArrayList<CitaDto>();

	static LocalDateTime fechaActual = LocalDateTime.now();
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
	static String fechaFormateada = fechaActual.format(formatter);
	public static String ficheroLog = "log-".concat(fechaFormateada).concat(".txt");

	public static void main(String[] args) {
		MenuInterface mi = new MenuImplementacion();

		int opcionSeleccionada;
		boolean esCerrado = false;

		try {

			// utils.ficheros.LeerYGuardar();

			FileWriter fileWriter = new FileWriter(ficheroLog, true);
			PrintWriter printWriter = new PrintWriter(fileWriter);

			do {

				opcionSeleccionada = mi.MenuPrincipal();
				String mensajeConcat = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))
						.concat("- Menu Principal, Opcion elegida : ").concat(String.valueOf(opcionSeleccionada));

				switch (opcionSeleccionada) {

				case 0:
					mensajeConcat += " - Menu cerrado";
					esCerrado = true;
					System.out.println("El menu se ha cerrado");
					break;
				case 1:
					mensajeConcat += " - Menu empleado";

					mi.MenuEmpleado();
					break;
				case 2:
					mensajeConcat += " Menu cliente";
					mi.MenuCliente();

					break;

				default:

					mensajeConcat += " - Opcion invalida";
					System.out.println("La opcion no es valida");
					break;
				}

				printWriter.println(mensajeConcat);

			} while (!esCerrado);

			printWriter.close();
			fileWriter.close();

		} catch (IOException e) {
			System.out.println("No se ha podido leer/escribir" + e.getMessage());
			e.printStackTrace();
		}
	}

}
