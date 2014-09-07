package test_ejb_servlets;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Named
@Stateless
public class VisitsBean {

	@PersistenceContext
	EntityManager entityManager;
	
	public void recordVisit() {
		Visit visit = new Visit();
		visit.setVisitTime(new Date());
		entityManager.persist(visit);
	}
	
	@SuppressWarnings("unchecked")
	public List<Visit> getVisits() {
		return entityManager.createNamedQuery(Visit.ALL).getResultList();
	}
}