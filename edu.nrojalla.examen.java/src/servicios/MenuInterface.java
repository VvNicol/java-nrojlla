/**
 * 
 */
package servicios;

import java.io.IOException;

/**
 * Biblioteca de metodos de menu
 * @author csi23-nrojlla 07052024
 */
public interface MenuInterface {
	
	/**
	 * vista de menu principal
	 * @return int
	 * @throws IOException 
	 */
	int MenuPrincipal() throws IOException;
	/**
	 * Opciones de empleado
	 * @throws IOException
	 */
	void MenuEmpleado() throws IOException;
	/**
	 * Opciones de Cliente
	 * @throws IOException
	 */
	void MenuCliente() throws IOException;
	/**
	 * Opciones y vista de consultas
	 * @throws IOException
	 */
	void MenuConsultas() throws IOException;

}
