package Persistencia;
// default package
// Generated 07-abr-2009 11:33:03 by Hibernate Tools 3.2.0.b9

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import Negocio.Edicion;

/**
 * Home object for domain model class Edicion.
 * @see .Edicion
 * @author Hibernate Tools
 */
public class EdicionHome {

	private static final Log log = LogFactory.getLog(EdicionHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Edicion transientInstance) {
		log.debug("persisting Edicion instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Edicion instance) {
		log.debug("attaching dirty Edicion instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Edicion instance) {
		log.debug("attaching clean Edicion instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Edicion persistentInstance) {
		log.debug("deleting Edicion instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Edicion merge(Edicion detachedInstance) {
		log.debug("merging Edicion instance");
		try {
			Edicion result = (Edicion) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Edicion findById(int id) {
		log.debug("getting Edicion instance with id: " + id);
		try {
			Edicion instance = (Edicion) sessionFactory.getCurrentSession()
					.get("Edicion", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Edicion instance) {
		log.debug("finding Edicion instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria(
					"Edicion").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
