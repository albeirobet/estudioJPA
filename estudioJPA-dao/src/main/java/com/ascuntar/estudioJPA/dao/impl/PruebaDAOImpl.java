package com.ascuntar.estudioJPA.dao.impl;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.ascuntar.estudioJPA.dao.PruebaDAO;
import com.ascuntar.estudioJPA.entities.Prueba;

/*
 * @author Eyder Albeiro Ascuntar Rosales
 */

public class PruebaDAOImpl implements PruebaDAO, Serializable {

	private static final long serialVersionUID = 9153317466475466077L;
	
	/*
	 * The name of this variable depends on the defined in persistence-unit from persistence.xml file located in
     * module-dm/src/main/resources/META-INF/persistence.xml
	 */	
	@PersistenceContext(unitName = "estudioJPAPU")
	private EntityManager em;

	@Override
	public boolean pruebaDAO(Prueba pr) {
		try {
			em.persist(pr);
			System.out.println("Success to persist the object");
			return true;
		} catch (Exception e) {
			System.out.println("Failed to persist the object:  "+e.getMessage());
			return false;
		}
	}

}
