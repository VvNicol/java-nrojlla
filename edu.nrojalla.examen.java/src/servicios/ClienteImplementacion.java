package servicios;

import java.io.IOException;
import java.util.Scanner;

import controladores.Inicio;
import dtos.ClienteDto;
import utils.Utils;
/**
 * 
 * Biblioteca de acciones del cliente
 * @author csi23-nrojlla
 */
public class ClienteImplementacion implements ClienteInterface {
	
	Scanner sc = new Scanner(System.in);
	/**
	 * Solicitar cita medica
	 */
	@Override
	public void SolicitudCitaMedica() throws IOException {
		MenuInterface mi = new MenuImplementacion();
		boolean esClienteValido = false;
		System.out.println("Solicitud cita medica");
		System.out.println("----------------------");
		System.out.println("Ingrese su dni (12345678Z):");
		String dniCli = sc.nextLine().toUpperCase();
		for(ClienteDto cli : Inicio.ClienteLista){
			if(dniCli.equals(cli.getDniCompletoCliente()) && cli.isValidoCliente() == true) {
				esClienteValido = true;
				mi.MenuConsultas();
			}
		}
		if(!esClienteValido) {
			System.out.println("No estas validado");
			System.out.println("----------------------");
		}
	}
	/**
	 * registrar cliente
	 */
	@Override
	public void ClienteRegistro() throws IOException {
		
		System.out.println("Crear nuevo cliente");
		System.out.println("----------------------");
		long id = Utils.generarIdCliente();
		System.out.println("Ingrese nombre:");
		String nombreCli = sc.nextLine();
		System.out.println("Ingrese sus apellidos:");
		String apellidosCli = sc.nextLine();
		System.out.println("Ingrese su dni:");
		String dniCli = sc.nextLine();

		ClienteDto nuevo = new ClienteDto(id,nombreCli,apellidosCli,dniCli);
		Inicio.ClienteLista.add(nuevo);
		System.out.println("Creado con exito");
		
	}

}
