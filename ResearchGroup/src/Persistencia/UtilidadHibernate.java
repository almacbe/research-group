package Persistencia;
import org.hibernate.*;
import org.hibernate.cfg.*;


public class UtilidadHibernate {
	////////////////////////////////////////
	/**
	 * Startup Hibernate and provide access to the singleton SessionFactory
	 */
	  private static SessionFactory sessionFactory;

	  static {
	    try {
	       sessionFactory = new Configuration().configure().buildSessionFactory();
	    } catch (Throwable ex) {
	       System.out.println(ex.getMessage());
	       throw new ExceptionInInitializerError(ex);
	    }
	  }

	  public static SessionFactory getSessionFactory() {
	      // Alternatively, we could look up in JNDI here
	      return sessionFactory;
	  }

	  public static void shutdown() {
	      // Close caches and connection pools
	      getSessionFactory().close();
	  }
		
	
	/////////////////////////////////////////

}

