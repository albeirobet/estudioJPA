package com.ascuntar.estudioJPA.configuration;

import org.hibernate.cfg.reveng.DelegatingReverseEngineeringStrategy;
import org.hibernate.cfg.reveng.ReverseEngineeringStrategy;
import org.hibernate.cfg.reveng.TableIdentifier;

public class CustomEstrategyHibernate extends
		DelegatingReverseEngineeringStrategy {

	public CustomEstrategyHibernate(ReverseEngineeringStrategy delegate) {
		super(delegate);
	}

	public String tableToClassName(TableIdentifier tableIdentifier) {
		String className = super.tableToClassName(tableIdentifier);
		if (className.startsWith("Tbl")) {
			className = className.substring(3);
		}
		return className;
	}
}
