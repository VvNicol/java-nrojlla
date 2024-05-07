package servicios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import controladores.Inicio;
import dtos.CitaDto;
import dtos.ClienteDto;
import utils.Utils;

/**
 * Biblioteca de acciones de Empleado
 * 
 * @author csi23-nrojlla
 */
public class EmpleadoImplementacion implements EmpleadoInterface {
	Scanner sc = new Scanner(System.in);
	boolean esValidar = false;

	@Override
	public void ValidarCliente() throws IOException {
		if (Inicio.ClienteLista.size() > 0) {
			Utils.MostrarNoValidadosCliente();
			System.out.println("Ingrese el Dni a validar");
			String dniCli = sc.nextLine();

			for (ClienteDto cli : Inicio.ClienteLista) {

				if (cli.isValidoCliente() == false && dniCli.equals(cli.getDniCompletoCliente())) {
					cli.setValidoCliente(true);
					System.out.println("Cliente Validado");
				}
			}

		} else {
			System.out.println("No hay clientes por validar");
		}
	}

}
