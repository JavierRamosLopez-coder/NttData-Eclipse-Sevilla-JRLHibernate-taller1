package com.nttdata.persistence;

import java.util.List;

import org.hibernate.Session;

/**
 * Implementación ClienteImpl
 * 
 * @author jramlope
 *
 */
public class ClienteImpl extends CommonDaoImpl<Cliente> implements ClienteI {

	/** Conexión a la BBDD **/
	private Session session;

	/**
	 * Método constructor
	 */
	public ClienteImpl(Session session) {
		super(session);
		this.session = session;
	}

	@Override
	public List<Cliente> searchByNameAndSurname(String name, String surname) {

		// Verificación de sesión abierta.
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		// Localiza jugadores en función del nombre.
		final List<Cliente> clientList = session.createQuery("FROM Cliente WHERE NAME='"+name+"' AND FIRST_SURNAME='"+surname+"'").list();

		return clientList;

	}

}
