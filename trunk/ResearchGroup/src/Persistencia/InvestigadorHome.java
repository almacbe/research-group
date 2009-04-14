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

import Negocio.Investigador;

/**
 * Home object for domain model class Investigador.
 * @see .Investigador
 * @author Hibernate Tools
 */
public class InvestigadorHome {

	private static final Log log = LogFactory.getLog(InvestigadorHome.class);

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

	public void persist(Investigador transientInstance) {
		log.debug("persisting Investigador instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Investigador instance) {
		log.debug("attaching dirty Investigador instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Investigador instance) {
		log.debug("attaching clean Investigador instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Investigador persistentInstance) {
		log.debug("deleting Investigador instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Investigador merge(Investigador detachedInstance) {
		log.debug("merging Investigador instance");
		try {
			Investigador result = (Investigador) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Investigador findById(int id) {
		log.debug("getting Investigador instance with id: " + id);
		try {
			Investigador instance = (Investigador) sessionFactory
					.getCurrentSession().get("Investigador", id);
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

	public List findByExample(Investigador instance) {
		log.debug("finding Investigador instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria(
					"Investigador").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
