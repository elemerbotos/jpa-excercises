package com.epam.training.jp.jpa.excercises.dao.jpaimpl;

import java.util.Date;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import com.epam.training.jp.jpa.excercises.dao.MenuDao;
import com.epam.training.jp.jpa.excercises.domain.Food;
import com.epam.training.jp.jpa.excercises.domain.Menu;

public class JpaMenuDao extends GenericJpaDao implements MenuDao {

	@Override
	public List<Menu> getActualMenus() {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Menu> c = cb.createQuery(Menu.class);
 
	  	Date date = new Date(new java.util.Date().getTime());
		Root<Menu> root = c.from(Menu.class);
		ParameterExpression<Date> today = cb.parameter(Date.class);
	
		CriteriaQuery<Menu> criteriaQuery = c.select(root).where(cb.between(
			today, root.<Date>get("fromDate"), root.<Date>get("toDate")));
	  
		TypedQuery<Menu> query = entityManager.createQuery(criteriaQuery);
		query.setParameter(today, date);
	  
		return query.getResultList();
	}

	@Override
	public Food findFoodById(int foodId) {
		return entityManager.find(Food.class, foodId);
	}

}
