package com.ascuntar.estudioJPA.bo;

import javax.ejb.Local;
import com.ascuntar.estudioJPA.entities.Prueba;

/*
 * @author Eyder Albeiro Ascuntar Rosales
 */

@Local
public interface PruebaBO {

	public boolean pruebaBO(Prueba pr);

}
