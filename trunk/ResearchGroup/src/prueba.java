import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import Negocio.Autor;
import Negocio.Grupo;
import Negocio.Proyecto;
import Persistencia.GrupoHome;
import Persistencia.UtilidadHibernate;

public class prueba {

	
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session sesion = null;

		try {
			// First unit of work
			sesion = UtilidadHibernate.getSessionFactory().openSession();
			GrupoHome grupos = new GrupoHome();

			Transaction tx = sesion.beginTransaction();

			Grupo grupo = new Grupo(0, "prova", "lala");
			grupos.persist(grupo);

			sesion.save(grupo);
			//Mensaje Mensaje = new Mensaje("Hola a todo(a)s, primer
			// mensaje.");
			// sesion.save(Mensaje);
			tx.commit();
			sesion.close();
			System.out.println("fin transaccin.");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		UtilidadHibernate.shutdown();
	}
}
