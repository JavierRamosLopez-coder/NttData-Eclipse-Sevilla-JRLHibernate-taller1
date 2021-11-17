package com.nttdata.ejecucion;

import java.util.List;

import org.hibernate.Session;

import com.nttdata.hibernate.services.ClientService;
import com.nttdata.hibernate.services.ClientServiceImpl;
import com.nttdata.persistence.Cliente;

/**
 * Clase NttdataHibernateTest
 * 
 * @author jramlope
 *
 */
public class NttdataHibernateTest {

	/**
	 * Método main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Session
		final Session session = NttdataHibernateUtil.getSessionFactory().openSession();

		// Inicialización de servicios
		final ClientService clientService = new ClientServiceImpl(session);

		// Clientes
		Cliente cliente = new Cliente();

		cliente.setName("Alonso");
		cliente.setFirstSurname("Ramos");
		cliente.setSecondSurname("López");
		cliente.setDni("21016078B");

		Cliente cliente2 = new Cliente();

		cliente2.setName("Javier");
		cliente2.setFirstSurname("Ramos");
		cliente2.setSecondSurname("López");
		cliente2.setDni("21016078N");

		// Insercción
		clientService.insertClient(cliente);
		clientService.insertClient(cliente2);

		cliente.setName("Inmaculada");
		cliente2.setName("Francisco Javier");

		// Actualización
		clientService.updateClient(cliente);
		clientService.updateClient(cliente2);

		// Eliminación de un cliente
		// clientService.deleteClient(cliente);

		// Muestra de todos los clientes (Lista)
		List<Cliente> all = clientService.showAllClients();

		for (final Cliente alls : all) {

			System.out.println(alls.getNumericIdentifier() + " | " + alls.getName() + " | " + alls.getFirstSurname()
					+ " | " + alls.getSecondSurname() + " | " + alls.getDni());

		}

		// Búsqueda de un cliente
		List<Cliente> clientes = clientService.searchByNameAndSurname("Francisco Javier", "Ramos");

		for (final Cliente clientee : clientes) {
			System.out.println(
					clientee.getNumericIdentifier() + " | " + clientee.getDni() + " | " + clientee.getSecondSurname());
		}

		// Consultar por id
		Cliente listado = clientService.searchClientById(1L);

		System.out.println(listado.toString());

		// Cierre
		session.close();

	}

}
