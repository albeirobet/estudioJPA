package com.ascuntar.estudioJPA.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ascuntar.estudioJPA.dao.PruebaDAO;
import com.ascuntar.estudioJPA.entities.Address;
import com.ascuntar.estudioJPA.entities.Book;
import com.ascuntar.estudioJPA.entities.Cd;
import com.ascuntar.estudioJPA.entities.CreditCard;
import com.ascuntar.estudioJPA.entities.CreditCardType;
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
			Address addr= new Address();
			addr.setCity("Popayán");
			addr.setCountry("Colombia");
			addr.setState("Cauca");
			addr.setStreet1("Cra 8 an 13");
			addr.setStreet2("Cra 6 an 14");
			addr.setZipcode("098");
			em.persist(addr);
			System.out.println("Success to persist the object Address");
			CreditCard creditCard = new CreditCard();
			CreditCardType creditCardType = null;
			creditCard.setControlNumber(123);
			creditCard.setCreditCardType(creditCardType.VISA);
			creditCard.setExpiryDate("12/12/2014");
			creditCard.setNumberCard(123123);
			em.persist(creditCard);
			System.out.println("Success to persist the object CreditCard");			
			Book book = em.createNamedQuery("findBookH2G2", Book.class).getSingleResult();
			System.out.println("Este es el libro buscado:  "+book.getTitle());
			Book nBook = new Book();
			nBook.setDescripcion("Christine");
			nBook.setIsbn("NM78");
			 float f = 10.4f;
			nBook.setPrice(f);
			nBook.setTitle("Christine");
			List<String> tags = new ArrayList<>();
			tags.add("Terror");
			tags.add("King");
			tags.add("Rey");
			nBook.setTags(tags);
			em.persist(nBook);
			
			List<Book> listBooks=  em.createNamedQuery("findAllBooks", Book.class).getResultList();
			for (Book book2 : listBooks) {
				System.out.println("Estos son los titulos de los libros:  "+book2.getTitle());
				if(book2.getTitle().equals("Christine")){
					System.out.println("Estos son los tags de Christine:  ");
					for (String tag : book2.getTags()) {
						System.out.println("  >>>>> "+tag);
					}
				}
			}
			
			
			Cd cd = new Cd();
			cd.setTitle("Sueños Liquidos");
			cd.setDescripcion("El mejor disco de Maná");
			Map<Integer, String> tracks= new HashMap<>();
			tracks.put(1, "Como dueles en los labios");
			tracks.put(2, "El chaman");
			tracks.put(3, "La sirena");
			cd.setTracks(tracks);
			em.persist(cd);
			System.out.println("Tracks persist correct");
			System.out.println(" >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Iniciando con las Relaciones");
			
			
			
			return true;
		} catch (Exception e) {
			System.out.println("Failed to persist the object:  "+e.getMessage());
			return false;
		}
	}

}
