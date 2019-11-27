package dao;

import java.io.Serializable;

import javax.persistence.EntityManager;

import entity.Viaje;
import utils.JpaUtils;

public class ViajeFacade extends AbstractFacade<Viaje> implements Serializable {

	private EntityManager em;
	private static final long serialVersionUID = 1L;

	public ViajeFacade() {
		super(Viaje.class);
		getEntityManager();
	}

	@Override
	protected EntityManager getEntityManager() {
		if (em == null) {
			em = JpaUtils.getEntityManagerFactory().createEntityManager();
		}
		return em;
	}

}
