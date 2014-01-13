package com.ascuntar.estudioJPA.ejbs;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/*
 * @author Eyder Albeiro Ascuntar Rosales
 */

@Singleton
@Startup
public class PruebaEjb {

	public PruebaEjb() {
		System.out
				.println(" ->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  Test in PruebaEjb");
	}

	@PostConstruct
	public void funcionInicio() {
		System.out
				.println(" ->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  Test in PostConstruct PruebaEjb");
	}

}
