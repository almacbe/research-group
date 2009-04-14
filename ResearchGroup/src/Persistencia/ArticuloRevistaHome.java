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

import Negocio.ArticuloRevista;

/**
 * Home object for domain model class ArticuloRevista.
 * @see .ArticuloRevista
 * @author Hibernate Tools
 */
public class ArticuloRevistaHome {

	private static final Log log = LogFactory.getLog(ArticuloRevistaHome.class);

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

	public void persist(ArticuloRevista transientInstance) {
		log.debug("persisting ArticuloRevista instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ArticuloRevista instance) {
		log.debug("attaching dirty ArticuloRevista instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ArticuloRevista instance) {
		log.debug("attaching clean ArticuloRevista instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ArticuloRevista persistentInstance) {
		log.debug("deleting ArticuloRevista instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ArticuloRevista merge(ArticuloRevista detachedInstance) {
		log.debug("merging ArticuloRevista instance");
		try {
			ArticuloRevista result = (ArticuloRevista) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ArticuloRevista findById(int id) {
		log.debug("getting ArticuloRevista instance with id: " + id);
		try {
			ArticuloRevista instance = (ArticuloRevista) sessionFactory
					.getCurrentSession().get("ArticuloRevista", id);
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

	public List findByExample(ArticuloRevista instance) {
		log.debug("finding ArticuloRevista instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria(
					"ArticuloRevista").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
