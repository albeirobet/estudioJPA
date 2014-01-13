package com.ascuntar.estudioJPA.dao;

import javax.ejb.Local;

import com.ascuntar.estudioJPA.entities.Prueba;

/*
 * @author Eyder Albeiro Ascuntar Rosales
 */

@Local
public interface PruebaDAO {

	public boolean pruebaDAO(Prueba pr);

}
