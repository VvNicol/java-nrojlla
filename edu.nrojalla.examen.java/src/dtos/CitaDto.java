package dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CitaDto {

	long idCitas;
	String consulta = "aaaaa";
	LocalDate fechaCita = LocalDate.of(9999, 12, 31);
	LocalTime horaCita = LocalTime.of(00, 00, 00);
	boolean esCita = false;
	
	
	
	/**
	 * 
	 */
	public CitaDto() {
		super();
	}

	/**
	 * @param idCitas
	 * @param consulta
	 * @param fechaCita
	 * @param horaCita
	 */
	public CitaDto(long idCitas, String consulta, LocalDate fechaCita, LocalTime horaCita) {
		super();
		this.idCitas = idCitas;
		this.consulta = consulta;
		this.fechaCita = fechaCita;
		this.horaCita = horaCita;
	}

	/**
	 * @return the esCita
	 */
	public boolean isEsCita() {
		return esCita;
	}

	/**
	 * @param esCita the esCita to set
	 */
	public void setEsCita(boolean esCita) {
		this.esCita = esCita;
	}

	/**
	 * @return the fechaCita
	 */
	public LocalDate getFechaCita() {
		return fechaCita;
	}

	/**
	 * @param fechaCita the fechaCita to set
	 */
	public void setFechaCita(LocalDate fechaCita) {
		this.fechaCita = fechaCita;
	}

	/**
	 * @return the horaCita
	 */
	public LocalTime getHoraCita() {
		return horaCita;
	}

	/**
	 * @param horaCita the horaCita to set
	 */
	public void setHoraCita(LocalTime horaCita) {
		this.horaCita = horaCita;
	}

	/**
	 * @return the idCitas
	 */
	public long getIdCitas() {
		return idCitas;
	}

	/**
	 * @param idCitas the idCitas to set
	 */
	public void setIdCitas(long idCitas) {
		this.idCitas = idCitas;
	}

	/**
	 * @return the consulta
	 */
	public String getConsulta() {
		return consulta;
	}

	/**
	 * @param consulta the consulta to set
	 */
	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}

}
