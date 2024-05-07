/**
 * 
 */
package servicios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import controladores.Inicio;

/**
 * Detalle de los metodos del menu interface
 * 
 * @author csi23-nrojlla 07052024
 */
public class MenuImplementacion implements MenuInterface {
	Scanner sc = new Scanner(System.in);
	EmpleadoInterface ei = new EmpleadoImplementacion();
	FicheroInterface fi = new FicheroImplementacion();
	ClienteInterface ci = new ClienteImplementacion();
	ConsultasInterface coi = new ConsultasImplementacion();

	/**
	 * Escribir en el fichero log
	 * 
	 * @param mensaje
	 * @throws IOException
	 */
	private void escribirEnFicheroLog(String mensaje) throws IOException {
		try (PrintWriter printWriter = new PrintWriter(new FileWriter(Inicio.ficheroLog, true))) {
			printWriter.println(mensaje);
		}
	}

	@Override
	public int MenuPrincipal() throws IOException {
		System.out.println("-----------------------------");
		System.out.println("Menu principal");
		System.out.println("0. Cerrar");
		System.out.println("1. Menu empleado");
		System.out.println("2. Menu cliente");
		System.out.println("-----------------------------");

		int opcionElegir = sc.nextInt();

		return opcionElegir;
	}

	@Override
	public void MenuEmpleado() throws IOException {
		int opcionSeleccionada;
		boolean esCerrado = false;

		do {

			opcionSeleccionada = MenuPrincipalEmpleado();
			String mensajeLog = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))
					.concat("- Menu Empleado, Opcion elegida : ").concat(String.valueOf(opcionSeleccionada));

			switch (opcionSeleccionada) {

			case 0:
				mensajeLog += " - Volver";
				esCerrado = true;
				System.out.println("Volver");
				break;
			case 1:
				mensajeLog += " - Menu validar";
				ei.ValidarCliente();

				break;
			case 2:
				mensajeLog += " Menu imprimir citas";
				fi.ImprimirCitas();

				break;

			default:

				mensajeLog += " - Opcion invalida";
				System.out.println("La opcion no es valida");
				break;
			}

			escribirEnFicheroLog(mensajeLog);

		} while (!esCerrado);

	}

	/**
	 * Vista del menu empleado
	 * 
	 * @return int
	 */
	private int MenuPrincipalEmpleado() {
		System.out.println("-----------------------------");
		System.out.println("Menu principal empleado");
		System.out.println("0. Volver");
		System.out.println("1. Validar cliente");
		System.out.println("2. Imprimir citas");
		System.out.println("-----------------------------");

		int opcionElegir = sc.nextInt();

		return opcionElegir;
	}

	@Override
	public void MenuCliente() throws IOException {
		int opcionSeleccionada;
		boolean esCerrado = false;

		do {

			opcionSeleccionada = MenuPrincipalCliente();
			String mensajeLog = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))
					.concat("- Menu Cliente, Opcion elegida : ").concat(String.valueOf(opcionSeleccionada));

			switch (opcionSeleccionada) {

			case 0:
				mensajeLog += " - Volver";
				esCerrado = true;
				System.out.println("Volver");
				break;
			case 1:
				mensajeLog += " - Registro cliente";
				ci.ClienteRegistro();

				break;
			case 2:
				mensajeLog += " Solicitud cita medica";
				ci.SolicitudCitaMedica();

				break;

			default:

				mensajeLog += " - Opcion invalida";
				System.out.println("La opcion no es valida");
				break;
			}

			escribirEnFicheroLog(mensajeLog);

		} while (!esCerrado);

	}

	private int MenuPrincipalCliente() throws IOException {
		System.out.println("-----------------------------");
		System.out.println("Menu principal cliente");
		System.out.println("0. Volver");
		System.out.println("1. Registro cliente");
		System.out.println("2. Solicitud cita medica");
		System.out.println("-----------------------------");

		int opcionElegir = sc.nextInt();

		return opcionElegir;
	}

	public void MenuConsultas() throws IOException {

		int opcionSeleccionada;
		boolean esCerrado = false;

		do {

			opcionSeleccionada = MenuConsultasEspecialistas();
			String mensajeLog = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))
					.concat("- Menu consultas, Opcion elegida : ").concat(String.valueOf(opcionSeleccionada));

			switch (opcionSeleccionada) {

			case 0:
				mensajeLog += " - Volver";
				esCerrado = true;
				System.out.println("Volver");
				break;
			case 1:
				String psicologia = "Psicologia";
				mensajeLog += " - Psicología";
				coi.ConsultasEspecialistas(psicologia);

				break;
			case 2:
				String traumatologia = "Traumatologia";
				mensajeLog += " - Traumatología";
				coi.ConsultasEspecialistas(traumatologia);
				break;
			case 3:
				String fisioterapia = "Fisioterapia";
				mensajeLog += " - Fisioterapia";
				coi.ConsultasEspecialistas(fisioterapia);

				break;

			default:

				mensajeLog += " - Opcion invalida";
				System.out.println("La opcion no es valida");
				break;
			}

			escribirEnFicheroLog(mensajeLog);

		} while (!esCerrado);

	}

	/**
	 * Vista menu consultas de especialistas
	 * 
	 * @return int
	 */
	private int MenuConsultasEspecialistas() {
		System.out.println("-----------------------------");
		System.out.println("Menu Consultas Especialistas");
		System.out.println("0. Volver");
		System.out.println("1. Psicología");
		System.out.println("2. Traumatología");
		System.out.println("3. Fisioterapia");
		System.out.println("-----------------------------");

		int opcionElegir = sc.nextInt();

		return opcionElegir;
	}

}
