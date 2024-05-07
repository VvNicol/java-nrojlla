/**
 * 
 */
package dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Datos de los clientes
 * @author csi23-nrojlla 07052024
 */
public class ClienteDto {
	
	long idCliente;
	String nombreCompletoCliente = "aaaaa";
	String nombreCliente = "aaaaa";
	String apellidosCliente = "aaaaa";
	String dniCompletoCliente = "aaaaa";
	String consultaCliente = "aaaaa";
	boolean isValidoCliente = false;
	LocalDate fechaNacimientoCliente = LocalDate.of(9999, 12, 31);
	LocalDateTime fechaAltaCliente = LocalDateTime.of(9999, 12, 31, 00, 00, 00);
	
	
	
	@Override
	public String toString() {
		return dniCompletoCliente +";"+ nombreCompletoCliente +";"+ consultaCliente ;
	}


	/**
	 * 
	 */
	public ClienteDto() {
		super();
	}


	/**
	 * @param idCliente
	 * @param nombreCliente
	 * @param apellidosCliente
	 * @param dniCompletoCliente
	 */
	public ClienteDto(long idCliente, String nombreCliente, String apellidosCliente, String dniCompletoCliente) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.apellidosCliente = apellidosCliente;
		this.dniCompletoCliente = dniCompletoCliente;
		this.fechaAltaCliente = LocalDateTime.now();
		this.nombreCompletoCliente = nombreCliente.concat(",").concat(apellidosCliente);
	}
	
	
	/**
	 * @return the consultaCliente
	 */
	public String getConsultaCliente() {
		return consultaCliente;
	}


	/**
	 * @param consultaCliente the consultaCliente to set
	 */
	public void setConsultaCliente(String consultaCliente) {
		this.consultaCliente = consultaCliente;
	}


	/**
	 * @return the idCliente
	 */
	public long getIdCliente() {
		return idCliente;
	}
	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	/**
	 * @return the nombreCompletoCliente
	 */
	public String getNombreCompletoCliente() {
		return nombreCompletoCliente;
	}
	/**
	 * @param nombreCompletoCliente the nombreCompletoCliente to set
	 */
	public void setNombreCompletoCliente(String nombreCompletoCliente) {
		this.nombreCompletoCliente = nombreCompletoCliente;
	}
	/**
	 * @return the nombreCliente
	 */
	public String getNombreCliente() {
		return nombreCliente;
	}
	/**
	 * @param nombreCliente the nombreCliente to set
	 */
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	/**
	 * @return the apellidosCliente
	 */
	public String getApellidosCliente() {
		return apellidosCliente;
	}
	/**
	 * @param apellidosCliente the apellidosCliente to set
	 */
	public void setApellidosCliente(String apellidosCliente) {
		this.apellidosCliente = apellidosCliente;
	}
	/**
	 * @return the dniCompletoCliente
	 */
	public String getDniCompletoCliente() {
		return dniCompletoCliente;
	}
	/**
	 * @param dniCompletoCliente the dniCompletoCliente to set
	 */
	public void setDniCompletoCliente(String dniCompletoCliente) {
		this.dniCompletoCliente = dniCompletoCliente;
	}

	/**
	 * @return the isValidoCliente
	 */
	public boolean isValidoCliente() {
		return isValidoCliente;
	}
	/**
	 * @param isValidoCliente the isValidoCliente to set
	 */
	public void setValidoCliente(boolean isValidoCliente) {
		this.isValidoCliente = isValidoCliente;
	}
	/**
	 * @return the fechaNacimientoCliente
	 */
	public LocalDate getFechaNacimientoCliente() {
		return fechaNacimientoCliente;
	}
	/**
	 * @param fechaNacimientoCliente the fechaNacimientoCliente to set
	 */
	public void setFechaNacimientoCliente(LocalDate fechaNacimientoCliente) {
		this.fechaNacimientoCliente = fechaNacimientoCliente;
	}
	/**
	 * @return the fechaAltaCliente
	 */
	public LocalDateTime getFechaAltaCliente() {
		return fechaAltaCliente;
	}
	/**
	 * @param fechaAltaCliente the fechaAltaCliente to set
	 */
	public void setFechaAltaCliente(LocalDateTime fechaAltaCliente) {
		this.fechaAltaCliente = fechaAltaCliente;
	}
	
	
}
