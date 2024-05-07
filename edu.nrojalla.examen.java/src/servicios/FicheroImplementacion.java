package servicios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import controladores.Inicio;
import dtos.CitaDto;
import utils.Utils;

public class FicheroImplementacion implements FicheroInterface {
	@Override
	public void ImprimirCitas() throws IOException {
		
		System.out.println("Fecha de la cita");
		LocalDate fechaDate = Utils.leerFecha();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
		String fechaFormateada = fechaDate.format(formatter);
		String ficheroCita = "informe-".concat(fechaFormateada).concat(".txt");

		boolean hayCitas = false;

		for (CitaDto citaFichero : Inicio.CitaLista) {		
			
			if (citaFichero.isEsCita() == true && fechaDate.equals(citaFichero.getFechaCita())) {
				hayCitas = true;
				break;
			}
		}
		if (hayCitas) {

			FileWriter fw = new FileWriter(ficheroCita, true);
			PrintWriter pw = new PrintWriter(fw);

			for (CitaDto citaFichero : Inicio.CitaLista) {

				if (citaFichero.isEsCita() == true) {
					String cita = citaFichero.toString();
					pw.println(cita);
				}
			}
			pw.close();
			fw.close();
			System.out.println("Se ha creado el informe '" + ficheroCita + "' correctamente.");
		} else {
			System.out.println("No hay informacion para mostrar");
		}
	}
}
