package com.ascuntar.estudioJPA.boimpl;

import java.io.Serializable;
import javax.ejb.Stateless;
import javax.inject.Inject;
import com.ascuntar.estudioJPA.bo.PruebaBO;
import com.ascuntar.estudioJPA.dao.PruebaDAO;
import com.ascuntar.estudioJPA.entities.Prueba;

/*
 * @author Eyder Albeiro Ascuntar Rosales
 */

@Stateless
public class PruebaBOImpl implements PruebaBO, Serializable {

	private static final long serialVersionUID = -4987639425366667404L;
	@Inject
	private PruebaDAO pruebaDAO;

	@Override
	public boolean pruebaBO(Prueba pr) {
		return pruebaDAO.pruebaDAO(pr);
	}

}
