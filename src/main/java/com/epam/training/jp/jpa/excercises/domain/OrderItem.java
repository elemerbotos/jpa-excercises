package com.epam.training.jp.jpa.excercises.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrderItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int quantity;
	@ManyToOne
	private Food food;
	
	public OrderItem(Food f, Integer integer) {
		food = f;
		quantity = integer;
	}

	// methods to compile project
	public Food getFood() {
		return food;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setFood(Food food) {
		this.food = food;
	}
	
	
}
