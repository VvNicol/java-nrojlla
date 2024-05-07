package servicios;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import controladores.Inicio;
import dtos.CitaDto;
import dtos.ClienteDto;
import utils.Utils;

/**
 * Detalle de los metodos de cosultas especialistas
 * 
 * @author csi23-nrojlla
 */
public class ConsultasImplementacion implements ConsultasInterface {
	Scanner sc = new Scanner(System.in);

	/**
	 * colsulta solicitud de cita medica
	 */
	@Override
	public void ConsultasEspecialistas(String especialidad) throws IOException {

		System.out.println("Consultas");
		System.out.println("----------------------");
		Long idCita = Utils.generarIdCita();
		String especialidadString = especialidad;
		LocalDate fecha = Utils.leerFecha();
		System.out.println("Ingrese la hora que desea: (HH:mm:ss)");
		String hora = sc.nextLine();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime horas = LocalTime.parse(hora, formato);
		
		Inicio.CitaLista.add(new CitaDto(idCita,especialidadString,fecha,horas));
		
		
		System.out.println("----------------------");
		System.out.println("Para confirmar ingrese su DNI");
		String dniCli = sc.nextLine().toUpperCase();
		
		for(ClienteDto cli : Inicio.ClienteLista) {
			
			if(dniCli.equals(cli.getDniCompletoCliente())) {
				cli.setConsultaCliente(especialidadString);
			}
		}
		System.out.println("Creado con exito");
	}

}
