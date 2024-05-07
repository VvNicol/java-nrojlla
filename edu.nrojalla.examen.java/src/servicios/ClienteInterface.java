/**
 * 
 */
package servicios;

import java.io.IOException;

/**
 * Biblioteca de las acciones de cliente
 * @author csi23-nrojlla
 */
public interface ClienteInterface {
	/**
	 * Solicitar cita medica
	 * @throws IOException
	 */
	void SolicitudCitaMedica() throws IOException; 
	/**
	 * Registro de un cliente
	 * @throws IOException
	 */
	void ClienteRegistro() throws IOException ;

}
