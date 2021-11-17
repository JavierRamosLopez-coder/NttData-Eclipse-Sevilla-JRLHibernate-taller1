package com.nttdata.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase Cliente
 * 
 * @author jramlope
 *
 */
@Entity
@Table(name = "NTTDATA_CLIENTES")
public class Cliente implements Serializable {

	/** Atributo Serial **/
	private static final long serialVersionUID = 1L;

	/** Número de identificación (PK) **/
	private Long numericIdentifier;

	/** Nombre **/
	private String name;

	/** Primer apellido **/
	private String firstSurname;

	/** Segundo apellido **/
	private String secondSurname;

	/** DNI **/
	private String dni;

	/**
	 * @return the numericIdentifier
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "NUMERIC_IDENTIFIER")
	public Long getNumericIdentifier() {
		return numericIdentifier;
	}

	/**
	 * @param numericIdentifier the numericIdentifier to set
	 */
	public void setNumericIdentifier(Long numericIdentifier) {
		this.numericIdentifier = numericIdentifier;
	}

	/**
	 * @return the name
	 */
	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the firstSurname
	 */
	@Column(name = "FIRST_SURNAME")
	public String getFirstSurname() {
		return firstSurname;
	}

	/**
	 * @param firstSurname the firstSurname to set
	 */
	public void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}

	/**
	 * @return the secondSurname
	 */
	@Column(name = "SECOND_SURNAME")
	public String getSecondSurname() {
		return secondSurname;
	}

	/**
	 * @param secondSurname the secondSurname to set
	 */
	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}

	/**
	 * @return the dni
	 */
	@Column(name = "DNI")
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Cliente [numericIdentifier=" + numericIdentifier + ", name=" + name + ", firstSurname=" + firstSurname
				+ ", secondSurname=" + secondSurname + ", dni=" + dni + "]";
	}
	
	

}
